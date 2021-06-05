  package com.example.lab4_2_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

  public class LoginActivity extends AppCompatActivity {

    private EditText edit_id;
    private EditText edit_pw;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        edit_id = (EditText)findViewById(R.id.EditText1);
        edit_pw = (EditText)findViewById(R.id.EditText2);

        Button btn=(Button)findViewById(R.id.Button1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String idtext;
                String pwtext;

                idtext=edit_id.getText().toString();
                pwtext=edit_pw.getText().toString();

                Intent intent = new Intent(LoginActivity.this, NextActivity.class);

                Bundle extras = new Bundle();
                extras.putString("id", idtext);
                extras.putString("pw", pwtext);

                intent.putExtras(extras);
                startActivity(intent);
            }
        });
    }
}