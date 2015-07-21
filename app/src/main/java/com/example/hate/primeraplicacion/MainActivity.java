package com.example.hate.primeraplicacion;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {


    private EditText texto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto = (EditText) findViewById(R.id.texto);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void martin(View view){


        Intent i = new Intent(this,Actividad_martin.class);
        String url = texto.getText().toString();
        i.putExtra("url",url);
        startActivity(i);



    }


    public void verMapa(View view){

        Intent i = new Intent(this,Mapa.class);
        startActivity(i);


    }

    public void gps(View view){

        GPSTracker gps = new GPSTracker(this);


        double longitud = gps.getLongitude();
        double latitud = gps.getLatitude();

        TextView text = (TextView) findViewById(R.id.textoLongitud);
        text.setText(String.valueOf(longitud));

        TextView textLatitud = (TextView) findViewById(R.id.textoLatitud);
        textLatitud.setText(String.valueOf(latitud));
    }

}
