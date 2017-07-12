package com.appbusters.robinkamboj.dialogfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class WithFragment extends Fragment {

    Button showDialog;
    public static WithFragment newInstance(){
        return new WithFragment();
    }

    public WithFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_with, container, false);
        showDialog = (Button) v.findViewById(R.id.show_dialog);
        showDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((WithActivity) getActivity()).newDialog(10);
            }
        });
        return v;
    }
}
