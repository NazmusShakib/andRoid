package com.example.gwe.practiceproject;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        //Log.d("SHUVO", "Call from orientation changes.");
        //Log.d("SHUVO", ""+newConfig.orientation);
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Log.d("SHUVO", "Welcome to LANDSCAPE Mode");
        }
        if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            Log.d("SHUVO", "Welcome to PORTRAIT Mode");
        }
    }

    public void doSomething(View view) {
        if (view.getId() == R.id.btnFirst) {
            Log.d("SHUVO", "Message from first button");
            Toast.makeText(getBaseContext(), "Message from first Button", Toast.LENGTH_LONG).show();
        }
        if (view.getId() == R.id.btnSecond) {
            Log.d("SHUVO", "Message from second button");
            Toast.makeText(getBaseContext(), "Messge from second button", Toast.LENGTH_LONG).show();
        }
    }
}
