package com.example.chari.alc4phase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;




public class ActivityA extends ActivityB {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);

        setTitle("ALC 4 Phase 1");
        getSupportActionBar().setTitle("About ALC");


        final Button button = findViewById(R.id.ABOUT_ALC);
                button.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {

                        startActivity(new Intent(ActivityA.this, ActivityB.class));
            }
        });

        final Button button1 = findViewById(R.id.MY_PROFILE);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(ActivityA.this, ActivityC.class));
            }
        });
    }

}







