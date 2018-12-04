package com.example.button.mafatih;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.content.ClipData;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ziarathaActivity extends AppCompatActivity {

    private int count;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ziaratha);

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linearlayout);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
               ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.MATCH_PARENT);





        StringBuilder text = new StringBuilder();

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(getAssets().open("contents.txt")));
            String line ;


            while ((line = br.readLine()) != null) {

                for(int i = 0; i<=count ; i++){

                    LinearLayout linearnew = new LinearLayout(this);
                    linearnew.setOrientation(LinearLayout.HORIZONTAL);

                    //String items = "";



//                    try {
//                        InputStream is = getAssets().open("contents.txt");
//
//                        int size = is.available();
//                        byte[] buffer = new byte[size];
//                        is.read(buffer);
//                        is.close();
//                        items = new String(buffer);
//
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                      این کارایی که کامنت‌کردم اضافه بود…در واقعا یه بار دیگه متن رو می‌خوند ولی خب ازش استفاده‌ای نمی‌کرد
                    Button buttonnew = new Button(this);
                    buttonnew.setText(line);
                    buttonnew.setId(i);
                    buttonnew.setLayoutParams(params);

                    buttonnew.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            openActivity();
                        }
                    });


                    linearnew.addView(buttonnew);
                    linearLayout.addView(linearnew);


                }

//                text.append(line);
//                text.append('\n');
//                  این‌ها هم اضافی بود دقیقا هم نفهمیدم چیکار می‌کرد… بود و نبودش فرقی نداشت
//                count++;
//                  اگه این بالایی رو از کامنت برداریم اولی رو یک باز دکمه می‌:نه دومی رو دو بار سومی و سه بار و به همین ترتیب تا آخر
            }

        } catch (IOException e) {
            e.printStackTrace();
        }



    }
    public void openActivity(){

    }
}
