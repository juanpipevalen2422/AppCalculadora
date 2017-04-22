package com.example.angelica.appcalculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView nombre;
    Button Ingresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre = (TextView) findViewById(R.id.name);
        Ingresar = (Button) findViewById(R.id.button);
        Ingresar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intento = new Intent(this,Main2Activity.class);
        startActivity(intento);
    }
}
