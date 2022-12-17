package com.diva.latest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);
    }

    public void checkout(View view) {
        EditText cctxt = (EditText) findViewById(R.id.ccText);
        try {
            // Assuming we do some HTTP requests credit card validation and processing
            //Everything seems fine and then we hit some unforseen error
            processCC(cctxt.getText().toString());
        } catch (RuntimeException re) {
            Log.e("diva-log", "Error while processing transaction with credit card: " + cctxt.getText().toString());
            Toast.makeText(this, "An error occured. Please try again later", Toast.LENGTH_SHORT).show();
        }
    }

    private void processCC(String ccstr) {
        // Do some important processing and throw if there is any error
        RuntimeException e = new RuntimeException();
        throw e;
    }
}

