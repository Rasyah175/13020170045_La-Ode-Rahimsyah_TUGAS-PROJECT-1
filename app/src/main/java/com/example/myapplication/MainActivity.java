package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button bhitluas,bhitvolum,breset;
    private EditText Tig,las,TigPris;
    private TextView has;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        has = findViewById(R.id.hasil);
        Tig = findViewById(R.id.tinggi);
        las = findViewById(R.id.alas);
        TigPris = findViewById(R.id.t_prisma);
        bhitluas = findViewById(R.id.luas);
        bhitvolum = findViewById(R.id.volume);
        breset = findViewById(R.id.reset);
        bhitluas.setOnClickListener(click_luas);
        bhitvolum.setOnClickListener(click_volum);
        breset.setOnClickListener(click_reset);
    }
    View.OnClickListener click_luas = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          try {
              float hasilluas;
              int tinggi,alas,prisma;
              tinggi = Integer.parseInt(Tig.getText().toString());
              alas = Integer.parseInt(las.getText().toString());
              prisma = Integer.parseInt(TigPris.getText().toString());
              hasilluas = tinggi*(alas*(3*prisma));
              has.setText(hasilluas+" cm^2");
          }catch (NumberFormatException ee){
              has.setText("0.0 cm^2");
          }
        }
    };
    View.OnClickListener click_volum = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            try {
                double hasilvolum;
                int tinggi,alas,prisma;
                tinggi = Integer.parseInt(Tig.getText().toString());
                alas = Integer.parseInt(las.getText().toString());
                prisma = Integer.parseInt(TigPris.getText().toString());
                hasilvolum = (0.5*tinggi*alas)*prisma;
                has.setText(hasilvolum+" cm^3");
            }catch (NumberFormatException ee){
                has.setText("0.0 cm^3");
            }

        }
    };
    View.OnClickListener click_reset = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Tig.setText(null);
            las.setText(null);
            TigPris.setText(null);
            has.setText(null);
            Tig.requestFocus();
        }
    };



}
