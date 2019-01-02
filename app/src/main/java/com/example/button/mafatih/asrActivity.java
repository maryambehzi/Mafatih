package com.example.button.mafatih;

import android.content.Intent;
import android.content.SharedPreferences;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import org.w3c.dom.NameList;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class asrActivity extends AppCompatActivity {

    public static ArrayList<String> favoriteItems;

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
        setContentView(R.layout.activity_asr);

        CheckBox fave = (CheckBox) findViewById(R.id.asrfav);
        final TextView asrtxt = (TextView) findViewById(R.id.asrtxt);


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

//            fave.setOnCheckedChangeListener(new );


//        asrfave.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                try {
//                    opensavingActivity();
//                } catch (ClassNotFoundException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
    }

    public void selectItem(View view){

        favoriteItems.add("asr");

        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()){
            case R.id.asrfav:{
                if (checked){
                SharedPreferences favorite =getSharedPreferences("favorite", MODE_PRIVATE);
                SharedPreferences.Editor editor = favorite.edit();
                Gson gson = new Gson();
                String json = gson.toJson(favoriteItems);
                editor.putString("fave list", json);
                editor.apply();
                }
            }
        }

    }


//    public void opensavingActivity() throws ClassNotFoundException {
//        SharedPreferences sharedPreferences = getSharedPreferences("shared preferences", MODE_PRIVATE);
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        Gson gson = new Gson();
//        String json = gson.toJson(fav);
//        editor.putString("favorite", json);
//        editor.apply();
//
//
//    }
}
