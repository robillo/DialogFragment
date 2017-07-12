package com.appbusters.robinkamboj.dialogfragment;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WithoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_without);
    }

    public void onClick(View view) {
        MyDialogFragment fragment = MyDialogFragment.newInstance(5);
        fragment.show(getSupportFragmentManager(), "TAG");
    }
}
