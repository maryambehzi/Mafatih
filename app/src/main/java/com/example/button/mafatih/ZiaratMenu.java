package com.example.button.mafatih;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ZiaratMenu extends ListActivity {

//    String filename = "contents.txt";

//    {
//        try {
//            InputStream is = getAssets().open("contents.txt");
//            int size = is.available();
//            byte[] buffer = new byte[size];
//            is.read(buffer);
//            is.close();
//            filename = new String(buffer);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

// try {
//        BufferedReader br = new BufferedReader(new InputStreamReader(getAssets().open("contents.txt")));
//        String line ;



//    {
//        try {
//           BufferedReader br = new BufferedReader(new InputStreamReader(getAssets().open(filename)));
//           String line;
//
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
    String ziaratha[] = {"ایام هفته","دعای صبوح","دعای کمیل","دعای عشرات","دعای سمات","دعای مشلول","دعای مستشیر","دعای مجیر","دعای عدیله","بازگشت"};
    String ziarat[] = {"HafteMenu","soboh","komail","asharat","samat","mashlol","mostashir","mojir","adile","Main"};





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setListAdapter(new ArrayAdapter<String>(ZiaratMenu.this, android.R.layout.simple_list_item_1, ziaratha));
    }


    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        String className = ziarat[position];
//        "".split(",");

        try{

            Class clicked = Class.forName("com.example.button.mafatih." + className + "Activity" );
            Intent openClass = new Intent(ZiaratMenu.this, clicked);
            startActivity(openClass);

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}
