package com.example.nicholas.grabble;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import org.xmlpull.v1.XmlPullParserException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    Button btnPlay, btnInstructions, btnAchievements, btnExit;

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
        btnPlay.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentPlayActivity = new Intent(getApplicationContext(), StartGameOptionsActivity.class);
                startActivity(intentPlayActivity);
            }
        });
        btnInstructions.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub

                /// Create Intent for SignUpActivity  abd Start The Activity
                Intent intentInstructions = new Intent(getApplicationContext(), InstructionsActivity.class);
                startActivity(intentInstructions);
            }
        });
        btnAchievements.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub

                /// Create Intent for SignUpActivity  abd Start The Activity
                Intent intentHighScore = new Intent(getApplicationContext(), AchievementsActivity.class);
                startActivity(intentHighScore);
            }
        });
        btnExit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub

                /// Create Intent for SignUpActivity  abd Start The Activity
                Intent homeIntent = new Intent(Intent.ACTION_MAIN);
                homeIntent.addCategory(Intent.CATEGORY_HOME);
                homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(homeIntent);
            }
        });



//        InputStream is = getResources().openRawResource(R.raw.dictionary);
//        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
//        String word = null;
//        try {
//            word = reader.readLine();
//        } catch (IOException e1) {
//            e1.printStackTrace();
//        }
//        while (word != null) {
//            Dictionary.add(word);
//            try {
//                word = reader.readLine();
//            } catch (IOException e1) {
//                e1.printStackTrace();
//            }
//        }
//        try {
//            reader.close();
//        } catch (IOException e1) {
//            e1.printStackTrace();
//        }
//        try {
//            is.close();
//        } catch (IOException e1) {
//            e1.printStackTrace();
//        }


    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }



}
