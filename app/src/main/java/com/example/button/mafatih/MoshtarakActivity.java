package com.example.button.mafatih;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.sql.BatchUpdateException;

public class MoshtarakActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moshtarak);

        Button moshtarakback = (Button) findViewById(R.id.moshtarakback);
        TextView moshtaraktxt = (TextView) findViewById(R.id.moshtaraktxt) ;

        String moshtarak = " ";
        try {
            InputStream is = getAssets().open( "Moshtarak.txt");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            moshtarak = new String(buffer);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        moshtaraktxt.setText(moshtarak);


        moshtarakback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backtotaghibat();
            }
        });

    }
    public void backtotaghibat(){
        Intent backmoshtarak = new Intent(this, TaghibatActivity.class);
        startActivity(backmoshtarak);
    }

}
