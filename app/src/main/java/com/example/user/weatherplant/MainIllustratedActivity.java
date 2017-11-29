package com.example.user.weatherplant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainIllustratedActivity extends AppCompatActivity {
    private Button Event, Monster, Back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_illustrated);

        Event = (Button) findViewById(R.id.Event);
        Monster = (Button) findViewById(R.id.Monster);
        Back = (Button) findViewById(R.id.MainIllustratedBack);

        Event.setOnClickListener(myclick);
        Monster.setOnClickListener(myclick);
        Back.setOnClickListener(myclick);
    }
    private View.OnClickListener myclick =
            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent();
                    switch (view.getId()){
                        case R.id.Event:
                            intent.setClass(MainIllustratedActivity.this , EventIllustratedActivity.class);
                            startActivity(intent);
                            break;
                        case R.id.Monster:
                            intent.setClass(MainIllustratedActivity.this , MonsterIllustratedActivity.class);
                            startActivity(intent);
                            break;
                        case R.id.MainIllustratedBack:
                            intent.setClass(MainIllustratedActivity.this , MainActivity.class);
                            startActivity(intent);
                            break;
                    }
                }
            };
}
