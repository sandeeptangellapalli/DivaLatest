package com.diva.latest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class InputValidation3Activity extends AppCompatActivity {

    private DivaJni djni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_validation3);

        djni = new DivaJni();
    }

    public void push(View view) {
        EditText cTxt = (EditText) findViewById(R.id.ivi3CodeText);

        if (djni.initiateLaunchSequence(cTxt.getText().toString()) != 0) {
            Toast.makeText(this, "Launching in T - 10 ...", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Access denied!", Toast.LENGTH_SHORT).show();
        }

    }
}

