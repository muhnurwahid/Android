package com.example;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.fragments.MainFragment;
import com.example.savingdata.Calc;

public class DisplayMessageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        SharedPreferences sp = getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        if(message!=null){
            if(message.equals("")){
                editor.putBoolean("isAccess",false);
            }else{
                editor.putBoolean("isAccess",true);
            }
            editor.commit();
            TextView textView = (TextView) findViewById(R.id.textView2);
            textView.setText(message);
        }

    }

    public void basicFragment(View view){
        Intent intent = new Intent(this, MainFragment.class);
        startActivity(intent);
    }

    public void goCal(View view){
        Intent intent = new Intent(this,Calc.class);
        startActivity(intent);
    }
}
