package com.appbusters.robinkamboj.dialogfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class WithActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_with);

        if(null ==savedInstanceState){
            initFragment(WithFragment.newInstance());
        }
    }

    private void initFragment(Fragment fragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragment_container, fragment);
        transaction.commit();
    }

    public void newDialog(int num){
        MyDialogFragment fragment = MyDialogFragment.newInstance(num);
        fragment.show(getSupportFragmentManager(), "TAG");
    }
}
