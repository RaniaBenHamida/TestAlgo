package com.example.rania.testalgo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    String displayMagic(int pMin, int pMax) {
        String  msg = "";

        if (pMin > pMax) {
            int aux = pMin;
            pMin = pMax;
            pMax = aux;
        }

        for (int i = pMin; i <= pMax; i++) {
            boolean value = true;
            if (i % 3 == 0) {
                msg += "H";
                value = false;
            }
            if (i % 5 == 0){
                msg += "S";
                value = false;
            }
            if (value){
                msg += i;
            }
        }
        return msg;
    }
}

