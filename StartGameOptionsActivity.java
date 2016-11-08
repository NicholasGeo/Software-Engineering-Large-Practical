package com.example.nicholas.grabble;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartGameOptionsActivity extends AppCompatActivity {

    Button btnPlayGame,btnWordForm, btnDistancePath, btnBack, btnExit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_game_options);

        btnPlayGame = (Button) findViewById(R.id.btPlayGame);
        btnWordForm = (Button) findViewById(R.id.btWordForm);
        btnDistancePath = (Button) findViewById(R.id.btDistancePath);


        btnPlayGame.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intentPlayActivity = new Intent(getApplicationContext(), MapsActivity.class);
                startActivity(intentPlayActivity);
            }
        });
        btnWordForm.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intentWordForm = new Intent(getApplicationContext(), WordFormActivity.class);
                startActivity(intentWordForm);
            }
        });

        btnDistancePath.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub

                /// Create Intent for SignUpActivity  abd Start The Activity
                Intent intentDistancePath=new Intent(getApplicationContext(),StepsActivity.class);
                startActivity(intentDistancePath);
            }
        });

        btnBack = (Button) findViewById(R.id.btBackStart);
        btnExit = (Button) findViewById(R.id.btExitStart);

        btnBack.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intentBack = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intentBack);
            }
        });
        btnExit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub

                /// Create Intent for SignUpActivity  abd Start The Activity
                Intent homeIntent = new Intent(Intent.ACTION_MAIN);
                homeIntent.addCategory( Intent.CATEGORY_HOME );
                homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(homeIntent);
            }
        });
    }
}
