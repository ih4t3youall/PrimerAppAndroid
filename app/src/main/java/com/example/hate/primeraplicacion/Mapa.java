package com.example.hate.primeraplicacion;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class Mapa  extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            setContentView(R.layout.activity_mapa);
        }catch (Exception e){
            Toast.makeText(getApplicationContext(),"tire exception",Toast.LENGTH_SHORT).show();
            e.printStackTrace();

        }

    }
}

