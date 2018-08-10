package com.example.egytek.task2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignUp2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up2);
    }
    public void goToRegister (View view){
        Intent goToRegister = new Intent(SignUp2.this,Register.class);
        startActivity(goToRegister);
    }
}
