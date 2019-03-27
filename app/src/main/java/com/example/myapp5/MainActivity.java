package com.example.myapp5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("------","CREATE");

        Button b1 = findViewById(R.id.btnOK);
        b1.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                
                Intent i = new Intent(MainActivity.this,Main4Activity.class);
                i.putExtra("Name","ssssssssss");
                startActivityForResult(i,110);



            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("------","START");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("------","RESTART");
    }

    @Override
    protected void onResume() {
        super.onResume();
            Log.d("------","RESUME");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("------","PAUSE");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("------","STOP");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("------","DESTROY");
    }

}
