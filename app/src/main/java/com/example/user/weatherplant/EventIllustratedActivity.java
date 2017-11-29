package com.example.user.weatherplant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EventIllustratedActivity extends AppCompatActivity {
    private Button Back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_illustrated);

        Back = (Button) findViewById(R.id.EventBack);
        Back.setOnClickListener(myclick);
    }
    private View.OnClickListener myclick =
            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent();
                    intent.setClass(EventIllustratedActivity.this , MainIllustratedActivity.class);
                    startActivity(intent);
                }
            };
}
