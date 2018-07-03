package com.khahani.app.ordercoffee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void afzayesh(View view) {
        TextView countTextView = (TextView) findViewById(R.id.count);
        String countString = countTextView.getText().toString();
        int count = Integer.parseInt(countString);

        if (count < 20)
            count++;

        countTextView.setText(String.valueOf(count));//count+"");
    }

    public void kahesh(View view) {
        TextView countTextView = (TextView) findViewById(R.id.count);
        String countString = countTextView.getText().toString();
        int count = Integer.parseInt(countString);
        if (count > 1)
            count--;

        countTextView.setText(String.valueOf(count));
    }
}
