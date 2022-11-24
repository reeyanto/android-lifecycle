package com.reeyanto.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnPindah;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate: MainActivity");

        btnPindah = findViewById(R.id.btn_pindah);
//        cara 1:
//        btnPindah.setOnClickListener(view -> {
//            pindahActivity();
//        });
        
        
//        cara 2:
//        btnPindah.setOnClickListener(this::buttonClicked);
        
        
//        cara 3:
        btnPindah.setOnClickListener(this);
    }

    private void pindahActivity() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
    
//    cara 2
//    private void buttonClicked(View view) {
//        if (view.getId() == R.id.btn_pindah) {
//            pindahActivity();
//        }
//    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_pindah) {
            pindahActivity();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: MainActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: MainActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: MainActivity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: MainActivity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart: MainActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: MainActivity");
    }
}