package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onBtnClick(View view){
        TextView nameOutput= findViewById(R.id.nameOutput);
        TextView emailOutput= findViewById(R.id.emailOutput);
        TextView phoneOutput= findViewById(R.id.phoneOutput);

        EditText name=findViewById(R.id.name);
        EditText email=findViewById(R.id.email);
        EditText phone=findViewById(R.id.phone);

        nameOutput.setText(name.getText().toString());
        emailOutput.setText(email.getText().toString());
        phoneOutput.setText(phone.getText().toString());
    }
}