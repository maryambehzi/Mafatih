package com.example.button.mafatih;

import android.app.ListActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.ArrayList;


//
public class MainActivity extends AppCompatActivity {

    ArrayList<String> favoriteItems ;



//    SharedPreferences favorite = getSharedPreferences();
//
    private Button adiye , ziaratha , exit, search , counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adiye = (Button) findViewById(R.id.adiye);

        exit = (Button) findViewById(R.id.exit);

        ziaratha = (Button) findViewById(R.id.ziaratha);

        search = (Button) findViewById(R.id.search_btn);

//      favlist = (Button) findViewById(R.id.favorites);

        counter = (Button) findViewById(R.id.counter);




//        ziaratha.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                openziarathaActivity();
//            }
//        });


        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensearchActivity();
            }
        });
        adiye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAdiyeActivity();
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });
        ziaratha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

//        favlist.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                openfavoriteActivity();
//            }
//        });
        counter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opencounterActivity();
            }
        });

    }

    public void openAdiyeActivity() {
        Intent adiye = new Intent(this, AdiyeActivity.class);
        startActivity(adiye);
    }
    public void openjoshanActivity(){
        Intent joshan = new Intent(this, joshanActivity.class);
        startActivity(joshan);
    }
    public void openziarathaActivity(){
        Intent ziaratha = new Intent(this, ZiaratMenu.class);
        startActivity(ziaratha);

    }
    public void opensearchActivity(){
        Intent search = new Intent(this, SearchActivity.class);
        startActivity(search);
    }
//    public void openfavoriteActivity(){
//        Intent favorites = new Intent(this, favoritsActivity.class);
//        startActivity(favorites);
//    }
    public void opencounterActivity(){
        Intent count = new Intent(this, counterActivity.class);
        startActivity(count);
    }
}



