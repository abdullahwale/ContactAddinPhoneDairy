package com.example.contactaddinphonedairy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.QuickContactBadge;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        QuickContactBadge quickContactBadge = (QuickContactBadge) findViewById(R.id.quickContactBadge);
        quickContactBadge.assignContactFromPhone("2323434545545", true);
    }
}
