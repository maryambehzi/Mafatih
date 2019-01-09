package com.example.button.mafatih;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class  counterActivity extends AppCompatActivity {

    private static final String SAVE = "save";

    private static  final String TEXT = "text";

    private static String txt = "txt";

    private int i = 0;

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
        return super.onOptionsItemSelected(item);
//
//
//
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        final Button count = (Button) findViewById(R.id.count);
        final Button reset = (Button) findViewById(R.id.reset);
        final TextView txtcnt = (TextView) findViewById(R.id.txtcount);


        SharedPreferences save = getSharedPreferences(SAVE, MODE_PRIVATE);

        txt = save.getString(TEXT, "");
        txtcnt.setText(txt);

        i = Integer.parseInt(String.valueOf(txtcnt));






        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                i++;

                txtcnt.setText(""+i+"");

                reset.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        i = 0;
                        txtcnt.setText("0");

                    }
                });

                SharedPreferences save = getSharedPreferences(SAVE, MODE_PRIVATE);
                SharedPreferences.Editor editor = save.edit();

                editor.putString(TEXT, txtcnt.getText().toString());
                editor.apply();








            }
        });


    }
}
