package com.example.lab3_4_4_contextmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView objTxtView;

    public static final int ID_COLOR_RED = 1;
    public static final int ID_COLOR_GREEN = 2;
    public static final int ID_COLOR_BLUE = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        objTxtView = (TextView)findViewById(R.id.textView1);
        registerForContextMenu(objTxtView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        SubMenu mnuTextBackGroundColor = menu.addSubMenu("Text BackGround");
        mnuTextBackGroundColor.add(Menu.NONE, ID_COLOR_RED, Menu.NONE, "RED");
        mnuTextBackGroundColor.add(Menu.NONE, ID_COLOR_GREEN, Menu.NONE, "GREEN");
        mnuTextBackGroundColor.add(Menu.NONE, ID_COLOR_BLUE, Menu.NONE, "BLUE");

        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case ID_COLOR_RED:
                objTxtView.setBackgroundColor(Color.RED);
                return true;
            case ID_COLOR_GREEN:
                objTxtView.setBackgroundColor(Color.GREEN);
                return true;
            case ID_COLOR_BLUE:
                objTxtView.setBackgroundColor(Color.BLUE);
                return true;
        }


        return super.onContextItemSelected(item);
    }
}