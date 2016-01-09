package com.example.dreher.meet2eat;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    public boolean authorized = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (!authorized) startActivity(new Intent(this, Login.class));
        else startActivity(new Intent(this, Home.class));
    }
}