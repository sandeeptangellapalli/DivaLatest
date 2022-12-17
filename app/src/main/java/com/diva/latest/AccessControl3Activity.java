package com.diva.latest;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AccessControl3Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_access_control3);

        SharedPreferences spref = PreferenceManager.getDefaultSharedPreferences(this);
        String pin = spref.getString(getString(R.string.pkey), "");

        if (!pin.isEmpty()) {
            Button vbutton = (Button) findViewById(R.id.aci3viewbutton);
            vbutton.setVisibility(View.VISIBLE);
        }
    }

    public void addPin(View view) {
        SharedPreferences spref = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor spedit = spref.edit();
        EditText pinTxt = (EditText) findViewById(R.id.aci3Pin);
        String pin = pinTxt.getText().toString();

        if (pin == null || pin.isEmpty()) {
            Toast.makeText(this, "Please Enter a valid pin!", Toast.LENGTH_SHORT).show();
        }
        else {
            Button vbutton = (Button) findViewById(R.id.aci3viewbutton);
            spedit.putString(getString(R.string.pkey), pin);
            spedit.commit();
            if (vbutton.getVisibility() != View.VISIBLE) {
                vbutton.setVisibility(View.VISIBLE);
            }

            Toast.makeText(this, "PIN Created successfully. Private notes are now protected with PIN", Toast.LENGTH_SHORT).show();
        }
    }

    public void goToNotes(View view) {
        Intent i = new Intent(this, AccessControl3NotesActivity.class);
        startActivity(i);
    }
}
