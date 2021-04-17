package com.example.asandamabasodevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.method.ScrollingMovementMethod;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AboutMeActivity extends AppCompatActivity{
    Button backFromAbout;
    TextView scroller;
    TextView profile;
    ImageView me;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
        backFromAbout = findViewById(R.id.aboutBack);
        profile = findViewById(R.id.myPro);
        me = findViewById(R.id.dai2021);

        scroller = findViewById(R.id.myInfo);
        scroller.setSelected(true);
        scroller.setMovementMethod(new ScrollingMovementMethod());
        String info = "My name is Asanda Mabaso\nI am currently an Application Development student doing my final year in my Diploma.\nI have coding skills in:\nJava\nSQL\nDatabases" +
                "\nAndroid Studio\nI love challanges and always willing to learn things.\n\n" +
                "Interests:\nReading,Car racing,Tennis";
        scroller.setText(info);

    }
    public void backToMenu(View v){
        Intent backMenu = new Intent(AboutMeActivity.this,MenuActivity.class);
        startActivity(backMenu);
    }
}
