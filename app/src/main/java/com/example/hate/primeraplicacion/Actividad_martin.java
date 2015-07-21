package com.example.hate.primeraplicacion;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.Toast;


public class Actividad_martin extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_martin);
        WebView web;
        web = (WebView) findViewById(R.id.web);

        Bundle bundle = getIntent().getExtras();
        String url = bundle.getString("url");

        Toast.makeText(this, url, Toast.LENGTH_SHORT).show();


        web.loadUrl("http://" +url);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_actividad_martin, menu);
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

    public void finalizar(View view){

        Toast.makeText(this, "finalizar", Toast.LENGTH_SHORT).show();
        finish();


    }

}
