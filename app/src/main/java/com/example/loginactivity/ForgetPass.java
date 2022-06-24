package com.example.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ForgetPass extends AppCompatActivity {

    Dialog popup;
    Button sendOTP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_pass);

        sendOTP=findViewById(R.id.sendOTP);
        popup=new Dialog(this);

        popup.setContentView(R.layout.activity_forget_pass_popup);
        popup.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        popup.setCancelable(false);

        sendOTP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                popup.show();

            }
        });

        Button checkOTP=popup.findViewById(R.id.otpCheckPopup);
        EditText newPass=popup.findViewById(R.id.createPass);
        EditText confirmPass=popup.findViewById(R.id.confirmPassword);
        Button createpassBtn = popup.findViewById(R.id.createPassbtn);

        checkOTP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(ForgetPass.this, "Please create new password!!", Toast.LENGTH_SHORT).show();

                newPass.setEnabled(true);
                confirmPass.setEnabled(true);
                createpassBtn.setEnabled(true);

            }
        });



        createpassBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ForgetPass.this, "Password Successfully created. Please login with new password.", Toast.LENGTH_LONG).show();
                popup.dismiss();
                Intent intent=new Intent(ForgetPass.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}