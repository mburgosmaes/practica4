package com.example.mario.practica4;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class fragmentPaises extends Fragment {


    private String[] paises;
    ArrayAdapter<String> adaptadorPaises;
    public ListView listViewPaises;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_paises, container, false);

        paises = new String[] {getResources().getString(R.string.portugal),
                getResources().getString(R.string.argentina), getResources().getString(R.string.australia), getResources().getString(R.string.belgica),
                getResources().getString(R.string.grecia),getResources().getString(R.string.japon), getResources().getString(R.string.reinounido),
                getResources().getString(R.string.rusia), getResources().getString(R.string.mexico), getResources().getString(R.string.italia)};
        List<String> listaPaises = Arrays.asList(paises);
        Collections.shuffle(listaPaises);
        adaptadorPaises = new ArrayAdapter<String>(this.getActivity() , android.R.layout.simple_list_item_1 , listaPaises);
        listViewPaises = view.findViewById(R.id.listaPaises);
        listViewPaises.setAdapter(adaptadorPaises);
        return view;
    }
}
