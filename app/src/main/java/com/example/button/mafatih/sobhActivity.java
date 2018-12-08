package com.example.button.mafatih;

import android.content.Intent;
import android.support.annotation.RequiresPermission;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class sobhActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobh);

        Button sobhback = (Button) findViewById(R.id.sobhback);
        TextView sobhtxt = (TextView) findViewById(R.id.sobhtxt);


        String sobh = " ";

        try {
            InputStream is = getAssets().open("sobh.txt");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            sobh = new String(buffer);


        } catch (IOException e) {
            e.printStackTrace();
        }

        sobhtxt.setText(sobh);

//        try{
//            BufferedReader br = new BufferedReader(new InputStreamReader((getAssets().open("contents.txt"))));
//            String line;
//
//            while ((line = br.readLine()) != null){
//                sobhtxt.setText(line);
//
//                next.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//
//                    }
//                });
//
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        sobhback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

}
