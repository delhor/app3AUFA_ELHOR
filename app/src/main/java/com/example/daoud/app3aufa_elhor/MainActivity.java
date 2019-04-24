package com.example.daoud.app3aufa_elhor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toastMe(View view){
        //Toast mytoast = Toast.makeTest(this, message, duration);
        Toast myToast = Toast.makeText(this, "Hello Toast!",
                Toast.LENGTH_SHORT);
        myToast.show();
    }

    public void countMe (View view) {
        // Get the text view
        TextView showCountTextView
                = (TextView) findViewById(R.id.textView);

        //Get the value of the text view.
        String countString = showCountTextView.getText().toString();

        //Convert value to a number and increment it
        Integer count = Integer.parseInt(countString);
        count++;

        //Display the new value in the text view
        showCountTextView.setText(count.toString());
    }

    @Override
    public void onClick(View v) {

    }
}
