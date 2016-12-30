package com.example.nicholas.grabble;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Iterator;

public class WordFormActivity extends AppCompatActivity  {
    ArrayList<String> Dictionary = new ArrayList<String>();
    ArrayList<Character> LettersCollected = new ArrayList<Character>();
    String str =  new String("ABCDEFGHIJKLMNOPQRSTTVUWXYZ");

    int counter = 0;
    TextView score;
    TextView dictionary;
    EditText sevenLetterWord;
    TextView submitButton;
    Button submitWord;
    String answerWord = "";
    boolean correctWord = false;
    StringBuilder dict = new StringBuilder(1000);

    //TODO go back to textView and use string builder to display characters available - then find why to remove this -
    //TODO maybe call the method again? and then edit through that - write your thoughts on paper
    //TODO how to do the high scores
    //TODO how to remove letter each time it appears in input

    //private Button btnBack, btnExit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_form);
        score = (TextView) findViewById(R.id.tvScoreDisplay);
        dictionary = (TextView) findViewById(R.id.tvLettersCollected);
        submitButton = (Button) findViewById(R.id.btSubmitWord);
        for(int i = 0; i < str.length(); i++){
            LettersCollected.add(str.charAt(i));
        }
        for(Character l : LettersCollected) {
            dict.append(l + " ");
        }
        dictionary.setText(dict);
        InputStream is = getResources().openRawResource(R.raw.dictionary);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        String word = null;
        try {
            word = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            while (word != null) {
                Dictionary.add(word);
                word = reader.readLine();
            }
            reader.close();
            is.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        buttonPressed();

    }


    public void buttonPressed(){
             submitButton.setOnClickListener(new View.OnClickListener() {
                  public void onClick(View v) {
                      sevenLetterWord = (EditText) findViewById(R.id.etSevenLWord);
                      answerWord = sevenLetterWord.getText().toString().toUpperCase();
                      for(String text : Dictionary){
                          if (answerWord.equals(text.toUpperCase())) {
                             // sevenLetterWord.setError(null);
                              checkValidWord();
                          }
                          else {
//                              sevenLetterWord.setError("The word does not exist");
                          }
                      }
              }
            });

    }

    public void checkValidWord(){

        for(int i = 0; i < answerWord.length(); i++){
            Iterator<Character> itr=LettersCollected.iterator();
            while(itr.hasNext()){
                Character letter=itr.next();
                if(answerWord.charAt(i) == letter){
                    counter ++;
                    itr.remove();
                }
            }
//            for(Character letter: LettersCollected){
//                if(answerWord.charAt(i) == letter){
//                    LettersCollected.remove(answerWord.charAt(i));
//                    counter ++;
//                }
//            }
        }
        if(counter == 7){
//            for(int i = 0; i<answerWord.length(); i++){
//                LettersCollected.remove(answerWord.charAt(i));
//            }
            upadateDictionary();
            calculateScore();
        }else{
            //Display error message that user does not have letter used available
        }

    }
    //update letters displayed to the user
    public void upadateDictionary(){
        dict.setLength(0);
        for(Character l : LettersCollected) {
            dict.append(l + " ");
        }
        dictionary.setText(dict);

    }
    //calculate the score the word the user entered gains
    public void calculateScore(){

        score.setText(Integer.toString(80));


    }




//    public void checkWord(){
//
//
//    }









//        btnBack = (Button) findViewById(R.id.btBackInstr);
//        btnExit = (Button) findViewById(R.id.btExitInstr);
//
//        btnBack.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View v){
//                Intent intentBack = new Intent(getApplicationContext(), MainActivity.class);
//                startActivity(intentBack);
//            }
//        });
//        btnExit.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                // TODO Auto-generated method stub
//
//                /// Create Intent for SignUpActivity  abd Start The Activity
//                Intent homeIntent = new Intent(Intent.ACTION_MAIN);
//                homeIntent.addCategory( Intent.CATEGORY_HOME );
//                homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                startActivity(homeIntent);
//            }
//        });

        //TODO calculate scores, insert current letters from map
    }

