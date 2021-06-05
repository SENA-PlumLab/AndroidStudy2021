package com.example.lab4_2_intents;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NextActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        TextView result = (TextView)findViewById(R.id.result);
        Button btn = (Button)findViewById(R.id.Button2);

        Bundle extras=getIntent().getExtras();
        result.setText("ID = "+extras.getString("id")+
                "\nPassword = "+extras.getString("pw")+"\n");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NextActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
