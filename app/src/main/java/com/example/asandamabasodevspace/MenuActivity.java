package com.example.asandamabasodevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {
    TextView greeting;
    Button home;
    Button calc;
    Button about;
    Button profile;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        greeting = findViewById(R.id.greeting);
        home = findViewById(R.id.homeButton);
        calc = findViewById(R.id.calcButton);
        about= findViewById(R.id.aboutButton);
        profile = findViewById(R.id.devProfileButton);
        name = getIntent().getStringExtra("NameToMenu");
        greeting.setText("Dear "+name+"\nWelcome to my code space");
    }

    public void homer(View v){
        Intent home = new Intent(MenuActivity.this,MainActivity.class);
        startActivity(home);
    }

    public void goToCalc(View v){
        Intent toCalc = new Intent(MenuActivity.this,CalculateActivity.class);
        startActivity(toCalc);
    }

    public void toAboutMe(View v){
        Intent toAbout = new Intent(MenuActivity.this, AboutMeActivity.class);
        startActivity(toAbout);
    }

    public void toProfile(View v){
        Intent toDevProfile = new Intent(MenuActivity.this, ProfileActivity.class);
        startActivity(toDevProfile);
    }


}


