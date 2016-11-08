package com.example.nicholas.grabble;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnPlay,btnInstructions,btnAchievements,btnExit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlay = (Button) findViewById(R.id.btPlay);
        btnInstructions = (Button) findViewById(R.id.btnInstruction);
        btnAchievements = (Button) findViewById(R.id.btAchievements);
        btnExit = (Button) findViewById(R.id.btExitAchiev);

//        btnPlay.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                // TODO Auto-generated method stub
//
//                /// Create Intent for SignUpActivity  abd Start The Activity
//                Intent intentPlayActivity = new Intent(getApplicationContext(), PlayActivity.class);
//                startActivity(intentPlayActivity);
//            }
//        });
        btnPlay.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intentPlayActivity = new Intent(getApplicationContext(), StartGameOptionsActivity.class);
                startActivity(intentPlayActivity);
            }
        });
        btnInstructions.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub

                /// Create Intent for SignUpActivity  abd Start The Activity
                Intent intentInstructions=new Intent(getApplicationContext(),InstructionsActivity.class);
                startActivity(intentInstructions);
            }
        });
        btnAchievements.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub

                /// Create Intent for SignUpActivity  abd Start The Activity
                Intent intentHighScore=new Intent(getApplicationContext(),AchievementsActivity.class);
                startActivity(intentHighScore);
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
