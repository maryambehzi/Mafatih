package com.example.button.mafatih;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.json.JSONArray;

public class taghibatMenuActivity extends ListActivity {
    String taghibatfa[] = {"تعقیبات مشترک","تعقیبات نماز صبح","تعقبات نماز ظهر","تعقیبات نماز عصر","تعقیبات نماز مغرب","تعقیبات نماز عشا"};
    String taghibattag[] = {"Moshtarak","sobh","zohr", "asr","maghreb", "esha"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setListAdapter(new ArrayAdapter<String>(taghibatMenuActivity.this, android.R.layout.simple_list_item_1, taghibatfa));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        String classname = taghibattag[position];

        try {
            Class clicked = Class.forName("com.example.button.mafatih."+classname+"Activity");
            Intent open = new Intent(taghibatMenuActivity.this, clicked);
            startActivity(open);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
