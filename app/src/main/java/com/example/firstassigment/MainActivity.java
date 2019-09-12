package com.example.firstassigment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String TXT = "whatiwant";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addOp(View view){
        //getting the values entered
        EditText editText1 =
                (EditText) findViewById(R.id.edittext1);
        EditText editText2 =
                (EditText) findViewById(R.id.edittext2);
        int firstNumber = Integer.parseInt(editText1.getText().toString());
        int secondNumber = Integer.parseInt(editText2.getText().toString());
        int result = firstNumber + secondNumber;
        //displaying at the same activity
//        TextView textView =
//                (TextView) findViewById(R.id.textview1);
//        textView.setTextSize(40);
//        textView.setText(String.valueOf(result));

        //sending it to the other activity
        Intent intent = new Intent(
                this, DisplayViewActivity.class);
        String message = String.valueOf(result);
        intent.putExtra(TXT, message);
        startActivity(intent);
    }

    public void mulOp(View view){
        //getting the values entered
        EditText editText1 =
                (EditText) findViewById(R.id.edittext1);
        EditText editText2 =
                (EditText) findViewById(R.id.edittext2);
        int firstNumber = Integer.parseInt(editText1.getText().toString());
        int secondNumber = Integer.parseInt(editText2.getText().toString());
        int result = firstNumber * secondNumber;
        //displaying at the same activity
//        TextView textView =
//                (TextView) findViewById(R.id.textview1);
//        textView.setTextSize(40);
//        textView.setText(String.valueOf(result));

        //sending it to the other activity
        Intent intent = new Intent(
                this, DisplayViewActivity.class);
        String message = String.valueOf(result);
        intent.putExtra(TXT, message);
        startActivity(intent);
    }


}
