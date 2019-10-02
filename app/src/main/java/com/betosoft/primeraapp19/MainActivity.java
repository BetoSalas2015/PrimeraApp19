package com.betosoft.primeraapp19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnAceptar, btnCancelar;
    EditText edtPara;
    TextView txtPara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAceptar = findViewById(R.id.btnAceptar);
        btnCancelar = findViewById(R.id.btnCancelar);
        edtPara = findViewById(R.id.edtPara);
        txtPara = findViewById(R.id.txtPara);

        btnAceptar.setOnClickListener(this);
        btnCancelar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if ( v.getId() == R.id.btnAceptar)
            Toast.makeText(getApplicationContext(),"Presionaste el botón Aceptar",Toast.LENGTH_LONG).show();
        if ( v.getId() == R.id.btnCancelar)
            Toast.makeText(getApplicationContext(),"Presionaste el botón Cancelar",Toast.LENGTH_LONG).show();
    }
}









