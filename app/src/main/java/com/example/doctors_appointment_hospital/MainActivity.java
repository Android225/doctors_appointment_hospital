package com.example.doctors_appointment_hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    // круглые кнопки для xml https://www.youtube.com/watch?v=vjNb-WWWF9A

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Убрать ActionBar
        getSupportActionBar().hide();

     // Показать ActionBar
     //   getSupportActionBar().show();
    }
}