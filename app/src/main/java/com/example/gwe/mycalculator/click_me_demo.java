package com.example.gwe.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class click_me_demo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button bn;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_me_demo);

        bn = (Button) findViewById(R.id.b2);
        bn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Toast.makeText(getBaseContext(), "This echo from second button",Toast.LENGTH_LONG).show();
            }
        });

    }

    public void getMe(View v)
    {
        Toast.makeText(getBaseContext(), "You click on first button",Toast.LENGTH_LONG).show();
    }
}
