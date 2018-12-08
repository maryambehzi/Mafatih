package com.example.button.mafatih;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class maghrebActivity extends AppCompatActivity {


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.backbar, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
//         switch (item.getGroupId()){
//             case R.id.backbar:
//                 finish();
//                 return true;
//             default:
        finish();
        return super.onOptionsItemSelected(item);}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maghreb);

//         Button maghrebback = (Button) findViewById(R.id.maghrebback);
         TextView maghrebtxt = (TextView) findViewById(R.id.maghrebtxt);

        String maghreb = " ";

        try {
            InputStream is = getAssets().open("maghreb.txt");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            maghreb = new String(buffer);


        } catch (IOException e) {
            e.printStackTrace();
        }

        maghrebtxt.setText(maghreb);

//        maghrebback.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                finish();
//            }
//        });
    }

}
