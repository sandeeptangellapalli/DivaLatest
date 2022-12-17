package com.diva.latest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;

    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void startChallenge (View view){

        if (view == findViewById(R.id.d1button)) {
            Intent i = new Intent(this, LogActivity.class);
            startActivity(i);
        } else if (view == findViewById(R.id.d2button)) {
            Intent i = new Intent(this, HardcodeActivity.class);
            startActivity(i);
        } else if (view == findViewById(R.id.d3button)) {
            Intent i = new Intent(this, InsecureDataStorage1Activity.class);
            startActivity(i);
        } else if (view == findViewById(R.id.d4button)) {
            Intent i = new Intent(this, InsecureDataStorage2Activity.class);
            startActivity(i);
        } else if (view == findViewById(R.id.d5button)) {
            Intent i = new Intent(this, InsecureDataStorage3Activity.class);
            startActivity(i);
        } else if (view == findViewById(R.id.d6button)) {
            Intent i = new Intent(this, InsecureDataStorage4Activity.class);
            startActivity(i);
        } else if (view == findViewById(R.id.d7button)) {
            Intent i = new Intent(this, SQLInjectionActivity.class);
            startActivity(i);
        } else if (view == findViewById(R.id.d8button)) {
            Intent i = new Intent(this, InputValidation2URISchemeActivity.class);
            startActivity(i);
        } else if (view == findViewById(R.id.d9button)) {
            Intent i = new Intent(this, AccessControl1Activity.class);
            startActivity(i);
        } else if (view == findViewById(R.id.d10button)) {
            Intent i = new Intent(this, AccessControl2Activity.class);
            startActivity(i);
        } else if (view == findViewById(R.id.d11button)) {
            Intent i = new Intent(this, AccessControl3Activity.class);
            startActivity(i);
        } else if (view == findViewById(R.id.d12button)) {
            Intent i = new Intent(this, Hardcode2Activity.class);
            startActivity(i);
        } else if (view == findViewById(R.id.d13button)) {
            Intent i = new Intent(this, InputValidation3Activity.class);
            startActivity(i);
        }
    }
}