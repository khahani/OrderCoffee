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

        Count = 1;
    }

    public void afzayesh_click(View view) {
        afzayesh();
        display();
    }

    public void kahesh_click(View view) {
        kahesh();
        display();
    }

    private int Count;

    public void afzayesh() {
        if (Count < 20)
            Count++;
    }

    public void kahesh() {
        if (Count > 1)
            Count--;
    }

    public void display() {
        TextView countTextView = (TextView) findViewById(R.id.count);
        countTextView.setText(String.valueOf(Count));
    }
}
