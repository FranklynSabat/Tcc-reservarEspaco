package com.example.usuario.reservarespaco;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.content.Intent;

public class ReservarEspacoActivity extends AppCompatActivity {

    private Button btnQuadra, btnChurras, btnSalao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservar_espaco);

        btnQuadra = (Button) findViewById(R.id.btnQuadra);
        btnChurras = findViewById(R.id.btnChurras);
        btnSalao = findViewById(R.id.btnSalao);

        btnQuadra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Calendario.class);
                startActivity(intent);
            }
        });


        btnChurras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), Calendario.class);
                startActivity(intent1);
            }
        });




        btnSalao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(), Calendario.class);
                startActivity(intent2);
            }
        });
    }




}