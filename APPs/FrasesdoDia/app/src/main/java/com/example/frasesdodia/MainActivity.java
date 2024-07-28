package com.example.frasesdodia;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void gerarNovaFrase(View view){

        String[] frases = {
                "Acredite em você mesmo.",
                "Não deixe para amanhã o que você pode fazer hoje.",
                "O sucesso é a soma de pequenos esforços repetidos dia após dia.",
                "Você é mais forte do que imagina.",
                "O único lugar onde o sucesso vem antes do trabalho é no dicionário.",
                "Não espere por oportunidades, crie-as.",
                "A persistência é o caminho do êxito.",
                "Acredite que você pode, assim você já está no meio do caminho.",
                "Grandes realizações são possíveis quando se acredita em si mesmo.",
                "Faça o seu melhor, mas sempre com paixão.",
                "A jornada de mil milhas começa com um passo.",
                "Os desafios são o que tornam a vida interessante.",
                "Você é capaz de mais do que pensa.",
                "O único limite para a nossa realização de amanhã são nossas dúvidas de hoje.",
                "Acredite que é possível.",
                "A disciplina é a mãe do sucesso.",
                "Transforme suas feridas em sabedoria.",
                "A prática leva à perfeição.",
                "Seja a mudança que você deseja ver no mundo.",
                "A maior glória em viver não está em nunca cair, mas em nos levantar toda vez que caímos.",
                "O sucesso é a soma de pequenos esforços repetidos dia após dia.",
                "Acredite em você e em todas as suas capacidades.",
                "Não pare quando estiver cansado. Pare quando tiver terminado.",
                "Se você pode sonhar, você pode fazer.",
                "O fracasso é a oportunidade de começar de novo com mais inteligência.",
                "Você nunca é velho demais para definir um novo objetivo ou sonhar um novo sonho.",
                "O futuro pertence àqueles que acreditam na beleza dos seus sonhos.",
                "A persistência é a mãe da boa sorte.",
                "Vá com confiança na direção dos seus sonhos. Viva a vida que você imaginou.",
                "Nunca é tarde demais para ser o que você poderia ter sido."
        };

        TextView txt = findViewById(R.id.txtResultado);
            int randomNumber = new Random().nextInt(30);
        txt.setText(frases[randomNumber]);
    }

}