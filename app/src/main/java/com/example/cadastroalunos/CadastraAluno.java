package com.example.cadastroalunos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class CadastraAluno extends AppCompatActivity {

    Spinner cursos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastra_aluno);

        cursos = findViewById(R.id.spnCurso);
        String[] strCursos = getResources().getStringArray(R.array.cursos);
        ArrayAdapter<String> adp = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item,strCursos);
        cursos.setAdapter(adp);


    }






}
