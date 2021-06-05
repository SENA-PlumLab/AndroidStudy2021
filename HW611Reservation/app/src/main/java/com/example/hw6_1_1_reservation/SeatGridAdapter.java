package com.example.hw6_1_1_reservation;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.core.app.ComponentActivity;

public class SeatGridAdapter extends BaseAdapter {
    Context context_SeatGrid;

    public SeatGridAdapter(Context c){
        context_SeatGrid = c;
    }
    public int getCount(){ return (seats_RowNum.length)*10; }
    public Object getItem(int position){
        return null;
    }
    public long getItemId(int position){
        return 0;
    }

    String[] seats_RowNum={"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        TextView tv_seat = new TextView(context_SeatGrid);
        tv_seat.setLayoutParams(new ViewGroup.LayoutParams(100, 100));
        tv_seat.setPadding(1, 1, 1, 1);
        tv_seat.setText(seats_RowNum[(pos/ 10)] + ((pos % 10) + 1));

        tv_seat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View dialogView = (View) View.inflate(
                        context_SeatGrid, R.layout.activity_dialog_view, null);
                AlertDialog.Builder dig = new AlertDialog.Builder(context_SeatGrid);

                dig.setView(dialogView);
                dig.setTitle(tv_seat.getText() +"\n예약하시겠습니까?");
                dig.setNegativeButton("취소", null);
                dig.setPositiveButton("결제", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Intent intent = new Intent(context_SeatGrid, ReservationCompleteActivity.class);
                        intent.putExtra("seat", tv_seat.getText());
                        context_SeatGrid.startActivity(intent);
                    }
                });

                dig.show();
            }
        });

        return tv_seat;
    }
}
