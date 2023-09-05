package com.example.maisdeumatela;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
    }

    public void chamarTela1(View v){
        Intent tela1 = new Intent(this, MainActivity.class);
        startActivity(tela1);

    }
}