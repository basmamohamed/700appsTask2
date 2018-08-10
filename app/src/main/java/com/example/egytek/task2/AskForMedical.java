package com.example.egytek.task2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AskForMedical extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_for_medical);
    }
    public void signIn (View view){
        Intent goToSignIn = new Intent(AskForMedical.this,SignIn.class);
        startActivity(goToSignIn);
    }
    public void signUp (View view){
        Intent goToSignIn = new Intent(AskForMedical.this,SignUp.class);
        startActivity(goToSignIn);
    }

}
