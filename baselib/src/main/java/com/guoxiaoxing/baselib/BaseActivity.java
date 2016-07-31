package com.guoxiaoxing.baselib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupVariate();
        setupView(savedInstanceState);
        setupData();
    }

    abstract void setupVariate();

    abstract void setupView(Bundle savedInstanceState);

    abstract void setupData();


}
