package com.saugat.secondassignmentfragment.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.saugat.secondassignmentfragment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Palendrome extends Fragment {


    public Palendrome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_palendrome, container, false);
    }

}
