package com.example.asandamabasodevspace;


import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
    Button back;
    TextView detailer;
    TextView name;
    TextView email;
    TextView number;
    ImageView myStudent;
    ImageView myEmail;
    ImageView myNumber;
    ImageView myLink;
    ImageView twit;

    String whatsApp = "+27736485727";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        back = findViewById(R.id.back);
        detailer = findViewById(R.id.details);
        name = findViewById(R.id.myName);
        email = findViewById(R.id.myEmail);
        number = findViewById(R.id.myNumber);

        myStudent = findViewById(R.id.student);
        myEmail = findViewById(R.id.email);
        myNumber = findViewById(R.id.cellphone);
        myLink = findViewById(R.id.linkedIn);
        twit = findViewById(R.id.twitter);

    }

    public void backToMenu(View v){
        Intent backMenu = new Intent(ProfileActivity.this,MenuActivity.class);
        startActivity(backMenu);
    }
    // I have no twitter profile
    public void toTwitter(View v){
        Intent twitterIcon = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com"));
        startActivity(twitterIcon);
    }
    public void toLinkedIn(View v){
        Intent toLinked = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.linkedin.com/in/asanda-mabaso-8833877b/"));
        startActivity(toLinked);
    }
    //Open whats app by clicking image
    public void toWhatsApp(View v){
        String url = "https://api.whatsapp.com/send?phone="+whatsApp;
        Intent wApp = new Intent(Intent.ACTION_VIEW);
        wApp.setData(Uri.parse(url));
        startActivity(wApp);
    }
    //Clicking the email image you are redirected to the composing an email menu
    public void toGmail(View v){
        try {
            Intent emailer = new Intent(Intent.ACTION_VIEW,Uri.parse("mailto:"+"asanda.mabaso@gmail.com"));
            startActivity(emailer);
        }
        catch (ActivityNotFoundException e){

        }
    }

}
