package com.example.quadraticequation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.media.audiofx.DynamicsProcessing;
import android.os.Bundle;

import com.example.quadraticequation.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        Equation equation = new Equation(binding);
        binding.setEquation(equation);
    }
}