package com.example.mario.practica4;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class fragmentCiudades extends Fragment {

    private String[] ciudades;
    ArrayAdapter<String> adaptadorCiudades;
    public ListView listViewCiudades;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_ciudades, container, false);
        ciudades = new String[] {getResources().getString(R.string.moscu),
                getResources().getString(R.string.cmexico), getResources().getString(R.string.lisboa),
                getResources().getString(R.string.tokio), getResources().getString(R.string.londres),
                getResources().getString(R.string.roma), getResources().getString(R.string.atenas),
                getResources().getString(R.string.bruselas), getResources().getString(R.string.aires),
                getResources().getString(R.string.canberra)};
        List<String> listaCiudades =  Arrays.asList(ciudades);
        Collections.shuffle(listaCiudades);
        adaptadorCiudades = new ArrayAdapter<String>(this.getActivity() , android.R.layout.simple_list_item_1 , listaCiudades);
        listViewCiudades = view.findViewById(R.id.listaCiudades);
        listViewCiudades.setAdapter(adaptadorCiudades);
        return view;
    }

}
