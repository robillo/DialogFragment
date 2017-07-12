package com.appbusters.robinkamboj.dialogfragment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.without:{
                startActivity(new Intent(this, WithoutActivity.class));
                break;
            }
            case R.id.with:{
                startActivity(new Intent(this, WithActivity.class));
                break;
            }
        }
    }
}
