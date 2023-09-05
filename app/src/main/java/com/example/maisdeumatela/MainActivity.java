package com.example.maisdeumatela;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void chamarTela2(View v){
        Intent tela2 = new Intent(this, Tela2.class);
        startActivity(tela2);

    }
}