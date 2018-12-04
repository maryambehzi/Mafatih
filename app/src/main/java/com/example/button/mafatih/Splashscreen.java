package com.example.button.mafatih;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splashscreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        Thread time = new Thread(){

            public void run(){
                try {
                    sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent start = new Intent("android.intent.action.MAINACTIVITY");
                    startActivity(start);
                }

            }
        };

        time.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
