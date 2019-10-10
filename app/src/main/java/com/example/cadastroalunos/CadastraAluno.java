package com.example.cadastroalunos;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

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

    public void salvarAluno() {
        Toast.makeText(this,"Salvando Aluno...",Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menucadastroaluno,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.iccancel) {
            finish();
        }

        if (id == R.id.icsave){
           salvarAluno();
        }
        return super.onOptionsItemSelected(item);
    }
}
