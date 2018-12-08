package com.example.button.mafatih;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;


//
public class MainActivity extends AppCompatActivity {
    private Button adiye , ziaratha , exit ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adiye = (Button) findViewById(R.id.adiye);

        exit = (Button) findViewById(R.id.exit);

        ziaratha = (Button) findViewById(R.id.ziaratha);

//        ziaratha.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                openziarathaActivity();
//            }
//        });

        adiye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAdiyeActivity();
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });
        ziaratha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
    public void openAdiyeActivity() {
        Intent adiye = new Intent(this, AdiyeActivity.class);
        startActivity(adiye);
    }
    public void openjoshanActivity(){
        Intent joshan = new Intent(this, joshanActivity.class);
        startActivity(joshan);
    }
    public void openziarathaActivity(){
        Intent ziaratha = new Intent(this, ZiaratMenu.class);
        startActivity(ziaratha);

    }
}
//
//
//
//