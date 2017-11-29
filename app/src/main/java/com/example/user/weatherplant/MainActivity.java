package com.example.user.weatherplant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button COLLECT, WAREHOUSE, ILLUSTRACTED;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        COLLECT = (Button) findViewById(R.id.collect);
        WAREHOUSE = (Button) findViewById(R.id.warehouse);
        ILLUSTRACTED = (Button) findViewById(R.id.illustrated);

        COLLECT.setOnClickListener(myClick);
        WAREHOUSE.setOnClickListener(myClick);
        ILLUSTRACTED.setOnClickListener(myClick);
    }
    private View.OnClickListener myClick =
            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent();
                    switch(view.getId()){
                        case R.id.collect:

                            break;
                        case R.id.warehouse:
                            intent.setClass(MainActivity.this , WarehouseActivity.class);
                            startActivity(intent);
                            break;
                        case R.id.illustrated:
                            intent.setClass(MainActivity.this , MainIllustratedActivity.class);
                            startActivity(intent);
                            break;
                    }
                }
            };
}
