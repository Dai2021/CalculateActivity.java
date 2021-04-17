package com.example.asandamabasodevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculateActivity extends AppCompatActivity   {
    EditText b1;
    EditText b2;
    int cp1;
    int sp2;
    int profit;
    double cost;
    Button calcBack;
    TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);
        b1 = findViewById(R.id.costprice);
        b2 = findViewById(R.id.sellingprice);
        ans = findViewById(R.id.answer);
        calcBack = findViewById(R.id.calcBack);

    }

    public void backToMenu(View v){
        Intent backMenu = new Intent(CalculateActivity.this,MenuActivity.class);
        startActivity(backMenu);
    }
    public void calcAnswer(View v){
        cp1 = Integer.parseInt(b1.getText().toString());
        sp2 = Integer.parseInt(b2.getText().toString());
       

        cost = ((cp1-sp2))*profit;
        ans.setText(String.valueOf(cost));
        ans.setBackgroundColor(Color.GREEN);
      
    }

}
