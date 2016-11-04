package com.example.nicholas.grabble;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlayActivity extends AppCompatActivity {

    Button btnPlayGame,btnWordForm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        btnPlayGame = (Button) findViewById(R.id.btPlayGame);
        btnWordForm = (Button) findViewById(R.id.btSubmitWord);


        btnPlayGame.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intentPlayActivity = new Intent(getApplicationContext(), MapsActivity.class);
                startActivity(intentPlayActivity);
            }
        });
        btnWordForm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub

                /// Create Intent for SignUpActivity  abd Start The Activity
                Intent intentInstructions=new Intent(getApplicationContext(),WordFormActivity.class);
                startActivity(intentInstructions);
            }
        });



    }
}


