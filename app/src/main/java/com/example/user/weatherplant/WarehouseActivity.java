package com.example.user.weatherplant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WarehouseActivity extends AppCompatActivity {
    private Button Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warehouse);

        Back = (Button) findViewById(R.id.EventBack);
        Back.setOnClickListener(myclick);
    }
    private View.OnClickListener myclick =
            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //初始化Intent物件
                    Intent intent = new Intent();
                    //從MainActivity 到Main2Activity
                    intent.setClass(WarehouseActivity.this , MainActivity.class);
                    //開啟Activity
                    startActivity(intent);
                }
            };
}
