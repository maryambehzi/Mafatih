package com.example.button.mafatih;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class TaghibatActivity extends AppCompatActivity {

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

    private Button sobh, zohr, asr, maghreb, moshtarak , esha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taghibat);

        moshtarak = (Button) findViewById(R.id.moshtarak);
        sobh = (Button) findViewById(R.id.sobh);
        zohr =(Button) findViewById(R.id.zohr);
        asr = (Button) findViewById(R.id.asr);
        maghreb = (Button) findViewById(R.id.maghreb);
        esha = (Button) findViewById(R.id.esha);

        moshtarak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMoshtarakActivity();
            }

        });
        sobh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensobhActivity();
            }
        });
        zohr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openzohrActivity();
            }
        });
        asr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openasrActivity();
            }
        });
        maghreb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openmaghrebActivity();
            }
        });
        esha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openeshaActivity();
            }
        });
    }

            public void openMoshtarakActivity() {
                Intent moshtarak = new Intent( this, MoshtarakActivity.class);
                startActivity(moshtarak);

            }
            public void opensobhActivity(){
            Intent sobh = new Intent(this, sobhActivity.class);
            startActivity(sobh);
            }
            public void openzohrActivity(){
            Intent zohr = new Intent(this, zohrActivity.class);
            startActivity(zohr);
            }
            public void openasrActivity(){
            Intent asr = new Intent(this, asrActivity.class);
            startActivity(asr);
            }
            public void openmaghrebActivity(){
            Intent maghreb = new Intent(this, maghrebActivity.class);
            startActivity(maghreb);
            }
            public void openeshaActivity(){
            Intent esha = new Intent(this, eshaActivity.class);
            startActivity(esha);
            }


}
