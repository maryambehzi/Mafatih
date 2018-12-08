package com.example.button.mafatih;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdiyeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adiye);
        Button taghibat = (Button) findViewById(R.id.taghibat);
        Button doaha = (Button)  findViewById(R.id.doaha);
        Button exit = (Button) findViewById(R.id.exitadiye);

        taghibat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTaghibatActivity();
            }
        });
        doaha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openziaratmenu();

            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    public void openTaghibatActivity(){
        Intent Taghibat = new Intent(this, taghibatMenuActivity.class);
        startActivity(Taghibat);
    }
    public void openziaratmenu(){
        Intent ziaratha = new Intent(this, ZiaratMenu.class);
        startActivity(ziaratha);
    }
}
