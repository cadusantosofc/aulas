package com.example.androidpoo;

import android.os.Bundle;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class LogicaCadastro extends AppCompatActivity {

    EditText id_var, nome_var, documento_var, curso_var;

    ArrayList<Alunos> alunos_var = new ArrayList<>();
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.tela_cadastro);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        id_var = findViewById(R.id.etx_id);
        nome_var = findViewById(R.id.etx_nome);
        documento_var = findViewById(R.id.etx_documento);
        curso_var = findViewById(R.id.etx_curso);

        


    }
}