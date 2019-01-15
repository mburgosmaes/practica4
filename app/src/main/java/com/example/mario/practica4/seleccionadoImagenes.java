package com.example.mario.practica4;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class seleccionadoImagenes extends AppCompatActivity implements seleccionadoImagen1.OnFragmentInteractionListener, seleccionadoImagen2.OnFragmentInteractionListener,
        seleccionadoImagen3.OnFragmentInteractionListener, seleccionadoImagen4.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccionado_imagenes);
    }

    public void casco (View view){
        findViewById(R.id.idEscudo).setVisibility(View.VISIBLE);
        findViewById(R.id.idEspada).setVisibility(View.GONE);
        findViewById(R.id.idLanza).setVisibility(View.GONE);
        findViewById(R.id.idYelmo).setVisibility(View.GONE);

    }

    public void espada(View view){
        findViewById(R.id.idEscudo).setVisibility(View.GONE);
        findViewById(R.id.idEspada).setVisibility(View.VISIBLE);
        findViewById(R.id.idLanza).setVisibility(View.GONE);
        findViewById(R.id.idYelmo).setVisibility(View.GONE);


    }

    public void lanza(View view){
        findViewById(R.id.idEscudo).setVisibility(View.GONE);
        findViewById(R.id.idEspada).setVisibility(View.GONE);
        findViewById(R.id.idLanza).setVisibility(View.VISIBLE);
        findViewById(R.id.idYelmo).setVisibility(View.GONE);


    }

    public void yelmo(View view){
        findViewById(R.id.idEscudo).setVisibility(View.GONE);
        findViewById(R.id.idEspada).setVisibility(View.GONE);
        findViewById(R.id.idLanza).setVisibility(View.GONE);
        findViewById(R.id.idYelmo).setVisibility(View.VISIBLE);


    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
