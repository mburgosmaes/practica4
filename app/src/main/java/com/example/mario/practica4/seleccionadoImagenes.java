package com.example.mario.practica4;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class seleccionadoImagenes extends Activity {

    Button btnImagen1;
    Button btnImagen2;
    Button btnImagen3;
    Button btnImagen4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccionado_imagenes);

        btnImagen1 = findViewById(R.id.btnImagen1);
        btnImagen2 = findViewById(R.id.btnImagen2);
        btnImagen3 = findViewById(R.id.btnImagen3);
        btnImagen4 = findViewById(R.id.btnImagen4);

        btnImagen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.idFrame, new seleccionadoImagen1());
                ft.commit();
            }
        });

        btnImagen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.idFrame, new seleccionadoImagen2());
                ft.commit();
            }
        });

        btnImagen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.idFrame, new seleccionadoImagen3());
                ft.commit();
            }
        });

        btnImagen4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.idFrame, new seleccionadoImagen4());
                ft.commit();
            }
        });
    }
}
