package com.example.nicholas.grabble;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InstructionsActivity extends AppCompatActivity {

    private Button btnBack, btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);

        btnBack = (Button) findViewById(R.id.btBackInstr);
        btnExit = (Button) findViewById(R.id.btExitInstr);

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
