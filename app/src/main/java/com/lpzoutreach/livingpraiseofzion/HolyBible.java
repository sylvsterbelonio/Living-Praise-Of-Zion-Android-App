package com.lpzoutreach.livingpraiseofzion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class HolyBible extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holy_bible);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}