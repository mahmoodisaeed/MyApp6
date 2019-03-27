package com.example.myapp5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        TextView txt1 = findViewById(R.id.txt1);
        Log.d("ddddddddddddd","eedwfewfewfew");
        txt1.setText("22");
        Log.d("ThreadName",Thread.currentThread().getName());
        new Thread(new Runnable() {
            @Override
            public void run() {
                Log.d("ThreadName",Thread.currentThread().getName());

            }
        }).start();
    }
}
