package com.example.button.mafatih;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class joshanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joshan);

        Button joshanback = (Button) findViewById(R.id.joshanback);
        TextView doa = (TextView) findViewById(R.id.doa);

        String joshan = " ";
        try {
            InputStream is =getAssets().open("joshan.txt");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            joshan = new String(buffer);
        } catch (IOException ex){
            ex.printStackTrace();
        }
         doa.setText(joshan);


        joshanback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backtomain();
            }
        });
    }

    public void backtomain(){
        Intent backjoshan = new Intent(this, MainActivity.class);
        startActivity(backjoshan);
    }
    }
