package com.saugat.secondassignmentfragment.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.saugat.secondassignmentfragment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Armstrong extends Fragment implements View.OnClickListener{

    private Button btnCalculateArmstrong;
    private EditText etArmstrongNumber;
    private TextView tvArmstrongResult;

    public Armstrong() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_armstrong, container, false);

        etArmstrongNumber = view.findViewById(R.id.etArmstrongNumber);
        btnCalculateArmstrong = view.findViewById(R.id.btnCalculateArmstrong);
        tvArmstrongResult = view.findViewById(R.id.tvArmstrongResult);

        btnCalculateArmstrong.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int c = 0, a, temp;

        int n = Integer.parseInt(etArmstrongNumber.getText().toString());

        temp = n;

        while(n > 0){
            a = n%10;
            n = n/10;
            c = c+(a*a*a);
        }

        if (temp == c){
            tvArmstrongResult.append(temp + " is a armstrong number.\n");
        }
        else {
            tvArmstrongResult.append(temp + " is not a armstrong number.\n");
    }
}
