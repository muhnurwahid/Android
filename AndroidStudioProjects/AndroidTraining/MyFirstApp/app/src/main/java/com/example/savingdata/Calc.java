package com.example.savingdata;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.MainActivity;
import com.example.R;

public class Calc extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        SharedPreferences sp = getSharedPreferences(getString(R.string.preference_file_key),Context.MODE_PRIVATE);
        Toast.makeText(this,"YOUR ACCESS IS "+sp.getBoolean("isAccess",false),Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            onBackPressed();
            SharedPreferences sp = getSharedPreferences(getString(R.string.preference_file_key),Context.MODE_PRIVATE);
            SharedPreferences.Editor edit = sp.edit();
            if((sp.getBoolean("isAccess",false))==true){
                edit.putBoolean("isAccess",false);
            }else{
                edit.putBoolean("isAccess",true);
            }
            edit.commit();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
