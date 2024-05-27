package com.example.quadraticequation;

import android.app.Activity;
import android.view.View;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.quadraticequation.databinding.ActivityMainBinding;

public class Equation extends BaseObservable {
    String a;
    String b;
    String c;

    ActivityMainBinding binding;

    public Equation(ActivityMainBinding binding) {
        this.binding = binding;
    }

    @Bindable
    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @Bindable
    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Bindable
    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public void equationSolver(View view){
        int a = Integer.parseInt(getA());
        int b = Integer.parseInt(getB());
        int c = Integer.parseInt(getC());

        double discriminant = b * b - (4 * a * c);

        double x1 = 0, x2 = 0;
        if(discriminant > 0){
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            binding.textView2.setText("X1: "+x1+" X2: "+x2);
        }
        else if (discriminant < 0){
            binding.textView2.setText("No Real Roots");
        }
        else{
            x1 = - b / (2 * a);
            binding.textView2.setText("X1: "+x1);
        }
    }

}
