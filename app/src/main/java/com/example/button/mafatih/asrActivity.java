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
         final TextView asrtxt = (TextView) findViewById(R.id.asrtxt);
         Button next = (Button) findViewById(R.id.asrnext);
         Button pre = (Button) findViewById(R.id.asrpre);

        final String[] asr = {" "};


            try{
                InputStream is = getAssets().open("asr.txt");
                int size = is.available();
                byte[] buffer = new byte[size];
                is.read(buffer);
                is.close();
                asr[0] = new String(buffer);



            } catch (IOException e) {
                e.printStackTrace();
            }

            asrtxt.setText(asr[0]);


        asrback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
