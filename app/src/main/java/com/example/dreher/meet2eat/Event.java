package com.example.dreher.meet2eat;

import android.os.Bundle;
import android.app.Activity;

public class Event extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
