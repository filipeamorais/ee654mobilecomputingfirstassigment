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
        EditText editText1 =
                (EditText) findViewById(R.id.edittext1);
        EditText editText2 =
                (EditText) findViewById(R.id.edittext2);
        int firstNumber = Integer.parseInt(editText1.getText().toString());
        int secondNumber = Integer.parseInt(editText2.getText().toString());
        int result = firstNumber + secondNumber;
        //String message = editText.getText().toString();
        TextView textView =
                (TextView) findViewById(R.id.textview1);
        textView.setTextSize(40);
        textView.setText(String.valueOf(result));
        String message = editText1.getText().toString();
        intent.putExtra(TXT, message);
        startActivity(intent);
    }

    public void mulOp(View view){
        EditText editText1 =
                (EditText) findViewById(R.id.edittext1);
        EditText editText2 =
                (EditText) findViewById(R.id.edittext2);
        int firstNumber = Integer.parseInt(editText1.getText().toString());
        int secondNumber = Integer.parseInt(editText2.getText().toString());
        int result = firstNumber * secondNumber;
        //String message = editText.getText().toString();
        TextView textView =
                (TextView) findViewById(R.id.textview1);
        textView.setTextSize(40);
        textView.setText(String.valueOf(result));
    }


}
