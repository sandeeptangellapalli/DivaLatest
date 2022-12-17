package com.diva.latest;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import android.view.View;
import android.widget.Toast;

public class AccessControl1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_access_control1);
    }

    @SuppressLint("QueryPermissionsNeeded")
    public void viewAPICredentials(View view) {
        // Calling implicit intent i.e. with app defined action instead of activity class
        Intent i = new Intent();
        i.setAction("com.diva.latest.action.VIEW_CREDS");
        // Check whether the intent resolves to an activity or not
        if (i.resolveActivity(getPackageManager()) != null){
            startActivity(i);
        }
        else {
            Toast.makeText(this, "Error while getting API details", Toast.LENGTH_SHORT).show();
            Log.e("Diva-aci1", "Couldn't resolve the Intent VIEW_CREDS to our activity");
        }
    }
}
