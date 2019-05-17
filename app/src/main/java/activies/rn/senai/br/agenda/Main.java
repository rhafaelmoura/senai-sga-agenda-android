package activies.rn.senai.br.agenda;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Main extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        setTitle("Lista de Alunos");

        List<String> alunos = new ArrayList<String>();
        alunos.add("Paulo");
        alunos.add("João");
        alunos.add("Maria");

        ListView listaAlunos = (ListView) findViewById(R.id._dynamic_main_list_alunos);

        listaAlunos.setAdapter(new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                alunos
        ));

    }
}
