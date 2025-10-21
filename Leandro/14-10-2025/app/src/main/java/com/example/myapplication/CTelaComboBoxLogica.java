package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CTelaComboBoxLogica extends AppCompatActivity {

    Spinner combobox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c_tela_combo_box_design);

            combobox = findViewById(R.id.spn_nomes);

        ArrayList<String> listanome = new ArrayList<>();
        listanome.add("Ana");
        listanome.add("Arthur");
        listanome.add("Davi");
        listanome.add("Bruno");

        ArrayAdapter<String> adaptador = new
                ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item);

        // DropDow abre as opções abaixo da combobox
        adaptador.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);

        // Joga os nomes na combobox ao iniciar ao iniciar o App
        combobox.setAdapter(adaptador);
    }
}