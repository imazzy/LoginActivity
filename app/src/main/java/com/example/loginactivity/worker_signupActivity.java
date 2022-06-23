package com.example.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

public class worker_signupActivity extends AppCompatActivity {

    String[] speciality = {"Electrical","Carpentry","Painting","Mason","Pest Control","Plumbing","Tank Cleaning"};
    AutoCompleteTextView autocompletetxt;
    Dialog popup;
    Button next;

    ArrayAdapter<String> adapterItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worker_signup);

        autocompletetxt=findViewById(R.id.auto_complete_txt);
        adapterItems=new ArrayAdapter<String>(this,R.layout.list_item,speciality);
        popup=new Dialog(this);
        next=findViewById(R.id.next);

        autocompletetxt.setAdapter(adapterItems);

        autocompletetxt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
//                Toast.makeText(getApplicationContext(), "Item: "+item, Toast.LENGTH_SHORT).show();
            }
        });

        popup.setContentView(R.layout.activity_user_popup);
        popup.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        popup.setCancelable(false);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                popup.show();

            }
        });

        Button otpCheck = popup.findViewById(R.id.otpCheck);

        otpCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(worker_signupActivity.this, "Your Application has been submitted and sent to Admin for approval!!!", Toast.LENGTH_LONG).show();
                popup.dismiss();
            }
        });

    }
}