package com.example.dreher.meet2eat;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registry extends AppCompatActivity implements View.OnClickListener{

    Button bRegister;
    EditText etEmail, etUsername, etPassword, etconPassword;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registry);

        etEmail = (EditText) findViewById(R.id.etEmail);
        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        etconPassword = (EditText) findViewById(R.id.etconPassword);
        bRegister = (Button) findViewById(R.id.bRegister);

        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           startActivity(new Intent(getApplication(), Login.class));



            }
        });




    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.bRegister:

                break;
        }
    }
}
