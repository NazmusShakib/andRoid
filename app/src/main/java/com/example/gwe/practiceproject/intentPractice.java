package com.example.gwe.practiceproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class intentPractice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_practice);
    }

    public void process(View view) {
        Intent intent = null, chooser = null;
        if (view.getId() == R.id.launch_maps) {
            intent = new Intent(android.content.Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:19.076,72.877"));
            chooser = Intent.createChooser(intent, "Lunch Maps");
            startActivity(chooser);

        } else if (view.getId() == R.id.launch_market) {

        } else if (view.getId() == R.id.send_mail) {

        }

    }
}
