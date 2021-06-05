package com.example.lab3_4_1_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //1st 삽입
    TextView objTxtView; //TextView 객체 선언


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2nd 삽입
        objTxtView = (TextView)findViewById(R.id.textView1);
        registerForContextMenu(objTxtView); //Context menu 제공
    }

    // 3rd 3개의 method 추가

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        MenuItem mnuTextColor = menu.add("Text Color");
        MenuItem mnuTextStyle = menu.add("Texxt Style");
        MenuItem mnuTextSize = menu.add("Text Size");

        SubMenu etc = menu.addSubMenu("Etc");

        SubMenu mnuCherry = etc.addSubMenu("Cherry");
        mnuCherry.setIcon(R.drawable.cherry);

        SubMenu mnuKiwi = etc.addSubMenu("Kiwi");
        mnuKiwi.setIcon(R.drawable.kiwi);

        SubMenu mnuFile = etc.addSubMenu("File");
        mnuFile.setIcon(R.drawable.file);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu){
        return super.onPrepareOptionsMenu(menu);
    }


}