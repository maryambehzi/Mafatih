package com.example.button.mafatih;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdiyeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adiye);
        Button taghibat = (Button) findViewById(R.id.taghibat);
        Button doaha = (Button)  findViewById(R.id.doaha);

        taghibat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTaghibatActivity();
            }
        });
    }
    public void openTaghibatActivity(){
        Intent Taghibat = new Intent(this, taghibatMenuActivity.class);
        startActivity(Taghibat);
    }
}
