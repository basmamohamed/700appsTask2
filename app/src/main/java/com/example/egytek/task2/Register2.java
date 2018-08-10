package com.example.egytek.task2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Register2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);
    }
    public void getStarted (View view){
        Intent goToGetStarted = new Intent (Register2.this,RegistrationSuccess.class);
        startActivity(goToGetStarted);
    }
}
