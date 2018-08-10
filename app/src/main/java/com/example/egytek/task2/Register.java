package com.example.egytek.task2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    TextView passwordMismatched;
    EditText password,confirmPassword;
    Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        password = (EditText)findViewById(R.id.password);
        confirmPassword = (EditText)findViewById(R.id.confirmPassword);
        passwordMismatched = (TextView)findViewById(R.id.mismatched);
        nextButton = (Button)findViewById(R.id.nextButton);
    }
    public void goToRegister2 (View view){
        if (!validate()) {
            onSignupFailed();
            return;
        }
        else {
        Intent goToRegister2 = new Intent(Register.this,Register2.class);
        startActivity(goToRegister2);
        finish();
    }}
    public void onSignupFailed() {
        passwordMismatched.setVisibility(passwordMismatched.VISIBLE);
        nextButton.setEnabled(true);
    }
    public boolean validate() {
        boolean valid = true;
        if (!confirmPassword.getText().toString().equals(password.getText().toString()) ) {
            confirmPassword.setError("password is not matched");
            valid = false;
        } else {
            confirmPassword.setError(null);
        }

        return valid;
    }


    }
