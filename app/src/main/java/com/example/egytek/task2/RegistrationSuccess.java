package com.example.egytek.task2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RegistrationSuccess extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_success);
    }
    public void goToMainscreenUserDoctor (View view){
        Intent goToMainscreenUserDoctor = new Intent(RegistrationSuccess.this,MainscreenUserDoctor.class);
        startActivity(goToMainscreenUserDoctor);
    }
}
