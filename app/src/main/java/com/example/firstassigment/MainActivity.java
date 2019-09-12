package com.example.firstassigment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

    public void addOp(View view){
        EditText editText =
                (EditText) findViewById(R.id.edittext1);
        String message = editText.getText().toString();
        TextView textView =
                (TextView) findViewById(R.id.textview1);
        textView.setTextSize(40);
        textView.setText(message);
    }


}
