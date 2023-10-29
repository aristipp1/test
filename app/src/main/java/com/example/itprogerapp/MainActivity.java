package com.example.itprogerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private EditText editText1,editText2 ;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        editText1= findViewById(R.id.editText_1);
        editText2= findViewById(R.id.editText_2);
btn.setOnClickListener(new View.OnClickListener()
{
    @Override
    public void onClick(View v)
    {
        float num1= Float.parseFloat(editText1.getText().toString());
        float num2= Float.parseFloat(editText1.getText().toString());
        float res = num1+num2;
        textView.setText(String.valueOf(res));
    }
}                     );

        }

    }

