package com.example.egytek.task2;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class SignIn extends AppCompatActivity {
    EditText email;
    TextView emailInvalid,signIn,rememberMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        email = (EditText)findViewById(R.id.emailEdit);
        emailInvalid = (TextView)findViewById(R.id.emailInvalid);
        signIn = (TextView)findViewById(R.id.signInButton);
        rememberMe = (TextView)findViewById(R.id.remember_me);
    }
    public void  rememberMe (View view){
        Drawable image = SignIn.this.getResources().getDrawable( R.drawable.ic_remember_select );
        rememberMe.setCompoundDrawablesWithIntrinsicBounds(image,null,null,null);
    }
    public void signin(View view) {
        if (!validate()) {
            onSignupFailed();
            return;
        }
        else {
            Intent goToMainScreen = new Intent(SignIn.this,MainscreenUserDoctor.class);
            startActivity(goToMainScreen);
            finish();
        }
        }
    public void onSignupFailed() {
        emailInvalid.setVisibility(emailInvalid.VISIBLE);
        signIn.setEnabled(true);
    }

    public boolean validate() {
        boolean valid = true;


        if (email.getText().toString().isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(email.getText().toString()).matches()) {
            email.setError("Enter a valid email address");
            valid = false;
        } else {
            email.setError(null);
        }
        return valid;
    }
}
