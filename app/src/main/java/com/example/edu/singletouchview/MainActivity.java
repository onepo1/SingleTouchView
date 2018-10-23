package com.example.edu.singletouchview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SingleTouchView singleTouchView = new SingleTouchView(this, null);
        setContentView(singleTouchView);
    }
}
