package com.example.button.mafatih;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class eshaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esha);

         Button eshaback = (Button) findViewById(R.id.eshaback);
         TextView eshatxt = (TextView) findViewById(R.id.eshatxt);


        String esha = " ";

        try {
            InputStream is = getAssets().open("esha.txt");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            esha = new String(buffer);

        } catch (IOException e) {
            e.printStackTrace();
        }

        eshatxt.setText(esha);

        eshaback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backtotaghibat();
            }
        });
    }
    public void backtotaghibat(){
        Intent backesha = new Intent(this, TaghibatActivity.class);
        startActivity(backesha);
    }
}
