package com.example.simplerotation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;
    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.txt1);
        mEditText = (EditText) findViewById(R.id.edit_txt1);

        mTextView.setText(String.valueOf(0));
    }

    public void doMagic(View view) {

        String cont = mTextView.getText().toString();

        int val1 = Integer.parseInt(cont);

        cont = mEditText.getText().toString();

        int val2 = Integer.parseInt(cont);

        mTextView.setText(String.valueOf(val1 + val2));

    }
}
