package com.app.me.androidcalculator2;

//https://www.androidauthority.com/build-a-calculator-app-721910/

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    /*step 3
    Create a private ActivityMainBinding instance within your class,
    and in the onCreate() method, delete the setContentView() line and replace
    with the DataBindingUtil.setContentView() line in the code snippet below.
     */
    private ViewDataBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        binding = DataBindingUtil.<ViewDataBinding>setContentView(this, R.layout.activity_main);
    }
}
