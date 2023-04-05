package com.example.gitauksinisprotas;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button rules;
    private Button youtube;
    private Button play;
    private ImageView gamePicture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auksinisprotas);

        buttonClick();
        pictureClick();
    }

    private void pictureClick(){
        gamePicture = findViewById(R.id.gamePicture);
        gamePicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add your code to handle the click event here
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=23KyQNOopTQ&ab_channel=Lietuvosnacionalinisradijasirtelevizija"));
                startActivity(browserIntent);
            }
        });
    }

    private void buttonClick() {

        rules = (Button)findViewById(R.id.buttonTaisykles);
        play = (Button)findViewById(R.id.buttonPlay);


//        rules.setBackgroundColor(Color.TRANSPARENT);
//        rules.setBackgroundResource(R.drawable.goldblock1low);


        rules.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // button.setEnabled(false);
                        Handler handler = new Handler();
                        handler.postDelayed(()->rules.setEnabled(true), 500);

                       // Toast.makeText(MainActivity.this, ("rules"), Toast.LENGTH_SHORT).show();
                        openActivityRules();

                    }
                }
        );

//        youtube.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        // button.setEnabled(false);
//                        Handler handler = new Handler();
//                        handler.postDelayed(()->youtube.setEnabled(true), 500);
//
//                        //Toast.makeText(MainActivity.this, ("youtube"), Toast.LENGTH_SHORT).show();
//                        //openActivityYoutube();
//                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=23KyQNOopTQ&ab_channel=Lietuvosnacionalinisradijasirtelevizija"));
//                        startActivity(browserIntent);
//                    }
//                }
//        );

        play.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // button.setEnabled(false);
                        Handler handler = new Handler();
                        handler.postDelayed(()->play.setEnabled(true), 500);

                        //Toast.makeText(MainActivity.this, ("timer"), Toast.LENGTH_SHORT).show();
                        openActivityPlay();

                    }
                }
        );


    }

    public void openActivityRules(){
        Intent intent = new Intent(this,ActivityRules.class);
        startActivity(intent);
    };


    public void openActivityPlay(){
        Intent intent = new Intent(this, ActivityPlay.class);
        startActivity(intent);
    };
}