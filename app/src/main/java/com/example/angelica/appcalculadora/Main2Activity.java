package com.example.angelica.appcalculadora;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    EditText Nume1;
    EditText Nume2;
    RadioGroup container;
    EditText resultado;
    Button botonVolver;

    float NumUno, NumDos, resul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        container = (RadioGroup) findViewById(R.id.radiogroup);
        Nume1 = (EditText) findViewById(R.id.Numero_1);
        Nume2 = (EditText) findViewById(R.id.Numero_2);
        resultado = (EditText) findViewById(R.id.Resultado);
        botonVolver = (Button) findViewById(R.id.buttonVolver);
        botonVolver.setOnClickListener(this);


        container.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (checkedId == R.id.radioButton1) {
                    NumUno = Integer.parseInt(Nume1.getText().toString());
                    NumDos = Integer.parseInt(Nume2.getText().toString());
                    resul = NumUno + NumDos;
                    resultado.setText(String.valueOf(resul));
                } else if (checkedId == R.id.radioButton2){
                    NumUno = Integer.parseInt(Nume1.getText().toString());
                    NumDos = Integer.parseInt(Nume2.getText().toString());
                    resul = NumUno - NumDos;
                    resultado.setText(String.valueOf(resul));
                }else if(checkedId == R.id.radioButton3){
                    NumUno = Integer.parseInt(Nume1.getText().toString());
                    NumDos = Integer.parseInt(Nume2.getText().toString());
                    resul = NumUno * NumDos;
                    resultado.setText(String.valueOf(resul));
                }else if(checkedId == R.id.radioButton4){
                    NumUno = Integer.parseInt(Nume1.getText().toString());
                    NumDos = Integer.parseInt(Nume2.getText().toString());
                    resul = NumUno / NumDos;
                    resultado.setText(String.valueOf(resul));
                }
            }
        });
    }

    @Override
    public void onClick(View v) {

        super.onBackPressed();
    }
}
