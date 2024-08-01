package com.example.jokenpo;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
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

    public void selecionadoPedra(View view){
        this.opcaoSelecionada("Pedra");
    }

    public void selecionadoPapel(View view){
        this.opcaoSelecionada("Papel");
    }

    public void selecionadoTesoura(View view){
        this.opcaoSelecionada("Tesoura");
    }

    public void opcaoSelecionada(String opcaoSelecionada){

        int aleatorio = new Random().nextInt(3);
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};
        String opcaoApp = opcoes[aleatorio];

        ImageView imageResultado = findViewById(R.id.imageResultado);
        switch (opcaoApp){
            case "Pedra":
                imageResultado.setImageResource(R.drawable.pedra);
                break;
            case "Papel":
                imageResultado.setImageResource(R.drawable.papel);
                break;
            case  "Tesoura":
                imageResultado.setImageResource(R.drawable.tesoura);
                break;
        }

        TextView txtResultado = findViewById(R.id.txtResultado);
        if((opcaoApp == "Pedra" && opcaoSelecionada ==  "Tesoura")||(opcaoApp == "Papel" && opcaoSelecionada ==  "Pedra")||(opcaoApp == "Tesoura" && opcaoSelecionada ==  "Papel")){
            txtResultado.setText("Você Perdeu! :(");
        }else if((opcaoApp == "Pedra" && opcaoSelecionada ==  "Papel")||(opcaoApp == "Papel" && opcaoSelecionada ==  "Tesoura")||(opcaoApp == "Tesoura" && opcaoSelecionada ==  "Pedra")){
            txtResultado.setText("Você Ganhou! :)");
        }else {
            txtResultado.setText("Deu Empate. :|");
        }

    }

}