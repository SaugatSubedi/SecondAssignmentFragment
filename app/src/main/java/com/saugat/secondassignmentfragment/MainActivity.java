package com.saugat.secondassignmentfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.saugat.secondassignmentfragment.fragment.Armstrong;
import com.saugat.secondassignmentfragment.fragment.Automorphic;
import com.saugat.secondassignmentfragment.fragment.CircleFragment;
import com.saugat.secondassignmentfragment.fragment.Palendrome;
import com.saugat.secondassignmentfragment.fragment.SimpleInterest;
import com.saugat.secondassignmentfragment.fragment.Swapping;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button Circle, Palendrome, SI, Armstrong, Automorphic, Swapping;

//    private Boolean status = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Circle = findViewById(R.id.Circle);
        Palendrome = findViewById(R.id.Palendrome);
        SI = findViewById(R.id.SI);
        Armstrong = findViewById(R.id.Armstrong);
        Automorphic = findViewById(R.id.Automorphic);
        Swapping = findViewById(R.id.Swapping);

        Circle.setOnClickListener(this);
        Palendrome.setOnClickListener(this);
        SI.setOnClickListener(this);
        Armstrong.setOnClickListener(this);
        Automorphic.setOnClickListener(this);
        Swapping.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        switch (v.getId()) {
            case R.id.Circle:
                CircleFragment circle = new CircleFragment();
                fragmentTransaction.replace(R.id.fragmentContainer, circle);
                fragmentTransaction.commit();
                break;

            case R.id.Palendrome:
                Palendrome palindrome = new Palendrome();
                fragmentTransaction.replace(R.id.fragmentContainer, palindrome);
                fragmentTransaction.commit();
                break;

            case R.id.SI:
                SimpleInterest simpleInterest = new SimpleInterest();
                fragmentTransaction.replace(R.id.fragmentContainer, simpleInterest);
                fragmentTransaction.commit();
                break;

            case R.id.Armstrong:
                Armstrong armstrong = new Armstrong();
                fragmentTransaction.replace(R.id.fragmentContainer, armstrong);

            case R.id.Automorphic:
                Automorphic automorphic = new Automorphic();
                fragmentTransaction.replace(R.id.fragmentContainer, automorphic );
                fragmentTransaction.commit();
                break;

            case R.id.Swapping:
                Swapping swapping = new Swapping();
                fragmentTransaction.replace(R.id.fragmentContainer, swapping);
                fragmentTransaction.commit();
                break;
        }
    }
}
