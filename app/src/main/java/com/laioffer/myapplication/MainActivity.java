package com.laioffer.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = "lifecycle";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: we will add our logic here.
        TextView welcomeTextView = findViewById(R.id.welcomeTextView);
        EditText nameEditText = findViewById(R.id.nameEditText);
        EditText emailEditText = findViewById(R.id.emailEditText);
        Button submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString();
                String email = emailEditText.getText().toString();
                welcomeTextView.setText("Welcome " + name + ", your email is: " + email);
            }
        });

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "We are at onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "We are at onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "We are at onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "We are at onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "We are at onDestroy()");
    }
}
