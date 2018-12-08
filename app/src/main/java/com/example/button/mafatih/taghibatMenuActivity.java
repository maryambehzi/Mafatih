package com.example.button.mafatih;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class taghibatMenuActivity extends ListActivity {

   ArrayList<String> Taglists = new ArrayList<>();
   ArrayList<String> Namelists = new ArrayList<>();




//    String taghibatfa[] = {"تعقیبات مشترک","تعقیبات نماز صبح","تعقبات نماز ظهر","تعقیبات نماز عصر","تعقیبات نماز مغرب","تعقیبات نماز عشا"};
//    String taghibattag[] = {"Moshtarak","sobh","zohr", "asr","maghreb", "esha"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getName();

        setListAdapter(new ArrayAdapter<String>(taghibatMenuActivity.this, android.R.layout.simple_list_item_1, Namelists));

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        getTag();


        String classname = Taglists.get(position);

        //        Toast.makeText(getApplicationContext(),Taglists.toString(),Toast.LENGTH_LONG).show();

//        if(classname == "Adiye")
//            finish();
//        else {


        try {

            Class clicked = Class.forName("com.example.button.mafatih."+ classname +"Activity");
            Intent open = new Intent(taghibatMenuActivity.this, clicked);
            startActivity(open);
            } catch (ClassNotFoundException e) {
                finish();        }

    }
//}

    public void getTag(){
        String Tag;
        try {


            InputStream is = getAssets().open("TaghibatMenu.json");
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
            InputStream is = getAssets().open("TaghibatMenu.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            name = new String(buffer, "UTF-8");
            JSONArray nameArray = new JSONArray(name);

            for(int i = 0; i<nameArray.length(); i++){
                JSONObject object = nameArray.getJSONObject(i);
                Namelists.add(object.getString("name"));

            }


        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

}
