package com.example.first_application;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void Strength(View view) {
        Intent intent = new Intent(this, SignalActivity.class);
                startActivity(intent);
    }

    public void Location(View view) {


    }
}
