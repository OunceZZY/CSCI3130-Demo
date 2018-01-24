package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // The only added method (other than the interface)
    public void copyMessage(View view) {
        // search for the two windows, get the new string and replace with new string
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        TextView textView = findViewById(R.id.textView);
        
        String message = editText2.getText().toString();

        textView.setText(message);


    }
}

