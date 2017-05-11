package com.example.interactingotherapps;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/**
 * Created by Dhandy on 5/11/2017.
 */

public class First extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        actDial();
    }

    public void actDial(){
        Uri number = Uri.parse("tel:554321");
        Intent callIntent = new Intent(Intent.ACTION_DIAL,number);
        startActivity(callIntent);
    }
}
