package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity {

LinearLayout li;
EditText edtxt1;

Spinner spin1;
String [] names = { "developer ", " designer","teacher"} ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spin1 = findViewById(R.id.spin1);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,R.layout.drop_down_menu,names);
        spin1.setAdapter(arrayAdapter);

    }


    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            li.setOrientation(LinearLayout.HORIZONTAL);
            

        }
    }
}