package com.example.vergarajohnmichaelquiz4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main3Activity extends AppCompatActivity {

    TextView txtGreeting;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        txtGreeting = findViewById(R.id.tvGreeting);
        Intent intent = getIntent();
        String str = intent.getStringExtra("person");
        txtGreeting.setText(str);
    }


    public void goLogout(View v){
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }



}
