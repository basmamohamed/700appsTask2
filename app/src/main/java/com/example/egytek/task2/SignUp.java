package com.example.egytek.task2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }
    public void goToSignUp2 (View view){
        Intent goToSignUp2 = new Intent(SignUp.this,SignUp2.class);
        startActivity(goToSignUp2);
    }
}
