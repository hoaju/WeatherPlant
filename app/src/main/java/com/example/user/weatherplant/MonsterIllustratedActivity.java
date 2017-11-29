package com.example.user.weatherplant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MonsterIllustratedActivity extends AppCompatActivity {
    private Button Back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monster_illustrated);

        Back = (Button) findViewById(R.id.MonsterBack);
        Back.setOnClickListener(myclick);
    }
    private View.OnClickListener myclick =
            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent();
                    intent.setClass(MonsterIllustratedActivity.this, MainIllustratedActivity.class);
                    startActivity(intent);
                }
            };
}
