package com.example.user.weatherplant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {

    private Button TapToStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        TapToStart = (Button) findViewById(R.id.taptostart);

        TapToStart.setOnClickListener(tomain);
    }

    private View.OnClickListener tomain =
            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent();
                    intent.setClass(StartActivity.this , MainActivity.class);
                    startActivity(intent);
                }
            };
}
