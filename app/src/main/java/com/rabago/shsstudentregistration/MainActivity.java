package com.rabago.shsstudentregistration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;

    private String[] students = {
            "BSIT",
            "BSCS",
            "BSCpE",
            "MSIT",
            "MSCS",
            "Aprilyn",
            "Hazel",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.submittoast);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Record Submitted", Toast.LENGTH_LONG).show();
            }
        });

    }
}
