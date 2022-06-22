package com.example.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class signupActivity extends AppCompatActivity {

    EditText name,mobileNumber,organisation,houseNo,email,password,confirmPassword;
    TextView textView;
    Button login;
    float v=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        name=findViewById(R.id.name);
        mobileNumber=findViewById(R.id.mobileNumber);
        organisation=findViewById(R.id.organisation);
        houseNo=findViewById(R.id.houseNo);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        confirmPassword=findViewById(R.id.confirmPassword);
        textView=findViewById(R.id.textView);
        login=findViewById(R.id.login);

        textView.setTranslationX(800);
        name.setTranslationX(800);
        mobileNumber.setTranslationX(800);
        organisation.setTranslationX(800);
        houseNo.setTranslationX(800);
        email.setTranslationX(800);
        password.setTranslationX(800);
        confirmPassword.setTranslationX(800);
        login.setTranslationX(800);

        textView.setAlpha(v);
        name.setAlpha(v);
        mobileNumber.setAlpha(v);
        organisation.setAlpha(v);
        houseNo.setAlpha(v);
        email.setAlpha(v);
        password.setAlpha(v);
        confirmPassword.setAlpha(v);
        login.setAlpha(v);

        textView.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        name.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(400).start();
        mobileNumber.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        organisation.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(600).start();
        houseNo.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();
        email.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(800).start();
        password.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(900).start();
        confirmPassword.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(1000).start();
        login.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(1100).start();
    }
}