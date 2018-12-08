package com.example.button.mafatih;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class zohrActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zohr);

         Button zohrback = (Button) findViewById(R.id.zohrback);
         TextView zohrtxt = (TextView) findViewById(R.id.zohrtxt);


        String zohr = " ";

        try {
            InputStream is = getAssets().open("zohr.txt");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            zohr = new String(buffer);


        } catch (IOException e) {
            e.printStackTrace();
        }

        zohrtxt.setText(zohr);

        zohrback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

}
