package com.example.button.mafatih;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class asrActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asr);

         Button asrback = (Button) findViewById(R.id.asrback);
         TextView asrtxt = (TextView) findViewById(R.id.asrtxt);

        String asr = " ";

        try{
            InputStream is = getAssets().open("asr.txt");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            asr = new String(buffer);



        } catch (IOException e) {
            e.printStackTrace();
        }

        asrtxt.setText(asr);

        asrback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backtotaghibat ();
            }
        });
    }
    public void backtotaghibat(){
        Intent backasr = new Intent(this, TaghibatActivity.class);
        startActivity(backasr);
    }
}
