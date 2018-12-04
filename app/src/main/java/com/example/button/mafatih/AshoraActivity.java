package com.example.button.mafatih;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AshoraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ashora);

        Button ashoraback = (Button) findViewById(R.id.ashoraback);

        ashoraback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backtomain();
            }
        });
    }

    public void backtomain(){
        Intent backashora = new Intent(this, MainActivity.class);
        startActivity(backashora);
    }
}
