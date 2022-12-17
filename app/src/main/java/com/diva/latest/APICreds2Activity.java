package com.diva.latest;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class APICreds2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apicreds2);
        TextView apicview = (TextView) findViewById(R.id.apic2TextView);
        EditText pintext  = (EditText) findViewById(R.id.aci2pinText);
        Button  vbutton   = (Button) findViewById(R.id.aci2button);
        Intent i = getIntent();
        boolean bcheck = i.getBooleanExtra(getString(R.string.chk_pin), true);

        if (bcheck == false) {
            // Connect to vendor cloud and send User PIN
            // Get API credentials and other confidential details of the user
            String apidetails = "TVEETER API Key: secrettveeterapikey\nAPI User name: diva2\nAPI Password: p@ssword2";
            // Display the details on the app
            apicview.setText(apidetails);
        }
        else {
            apicview.setText("Register yourself at http://payatu.com to get your PIN and then login with that PIN!");
            pintext.setVisibility(View.VISIBLE);
            vbutton.setVisibility(View.VISIBLE);
        }
    }

    public void viewCreds(View view) {
        //Save user PIN
        // Connect to vendor cloud and send User PIN
        // Get API credentials and other confidential details of the user
        // If PIN is wrong ask user to enter correct pin
        Toast.makeText(this, "Invalid PIN. Please try again", Toast.LENGTH_SHORT).show();
    }
}
