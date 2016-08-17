package com.example.simplerotation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String SUM_KEY_BUNDLE = "mySum";
    private TextView mTextView;
    private EditText mEditText;

    private int mSum;

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

        mSum = val1 + val2;

        mTextView.setText(String.valueOf(mSum));

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {

        outState.putInt(SUM_KEY_BUNDLE, mSum);
        super.onSaveInstanceState(outState);

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        mSum = savedInstanceState.getInt(SUM_KEY_BUNDLE, 0);
        mTextView.setText(String.valueOf(mSum));
    }
}
