package com.example.button.mafatih;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.jar.Attributes;

public class ZiaratMenu extends ListActivity {

    ArrayList<String> Taglists = new ArrayList<>();
    ArrayList<String> Namelists = new ArrayList<>();





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getName();

        setListAdapter(new ArrayAdapter<String>(ZiaratMenu.this, android.R.layout.simple_list_item_1, Namelists));

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        getTag();


        String className = Taglists.get(position);

//        Toast.makeText(getApplicationContext(),Taglists.toString(),Toast.LENGTH_LONG).show();


        try{

            Class clicked = Class.forName("com.example.button.mafatih." + className + "Activity" );
            Intent open = new Intent(ZiaratMenu.this, clicked);
            startActivity(open);
            } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void getTag(){
        String Tag;
        try {


            InputStream is = getAssets().open("ZiaratMenu.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            Tag = new String(buffer, "UTF-8");
            JSONArray TagArray = new JSONArray(Tag);

            for(int i = 0; i<TagArray.length(); i++){
                JSONObject object = TagArray.getJSONObject(i);
                Taglists.add(object.getString("Tag"));

            }


        }catch (IOException e){
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void getName(){
        String name;

        try {
            InputStream is = getAssets().open("ZiaratMenu.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            name = new String(buffer, "UTF-8");
            JSONArray NameArray = new JSONArray(name);

            for(int i = 0;i<NameArray.length();i++){
                JSONObject object = NameArray.getJSONObject(i);
                Namelists.add(object.getString("name"));
            }
        }catch (IOException e){
            e.printStackTrace();
        }catch (JSONException e){
            e.printStackTrace();
        }
    }
}
