package com.example.jimmy.guess100;

import android.app.Activity;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tx1;
    TextView tx2;
    int min=0;
    int max=100;
    int random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tx1 = (TextView)findViewById(R.id.secret);
        random = (int)(Math.random()*100+1);
        tx1.setText(String.valueOf(random));

        tx2 = (TextView)findViewById(R.id.number);
        //findViews();
    }
    /*public void findViews(){
        tx1 = (TextView)findViewById(R.id.secret);
        random = (int)(Math.random()*100+1);
        tx1.setText(String.valueOf(random));

        tx2 = (TextView)findViewById(R.id.number);
    }*/
    void reset(){
        min = 0;
        max = 100;
        random = (int)(Math.random()*100+1);
        tx1.setText(String.valueOf(random));
    }

    public void Guess(View view){
        EditText guessnumber = (EditText)findViewById(R.id.number);
        int guess = Integer.parseInt(guessnumber.getText().toString());
        if(guess > random){
            max = guess;
            new AlertDialog.Builder(MainActivity.this).setMessage(min+" to "+max).setPositiveButton("OK!",null).show();
        }
        else if(guess<random){
            min =guess;
            new AlertDialog.Builder(MainActivity.this).setMessage(min+" to "+max).setPositiveButton("OK!",null).show();
        }
        else{
            new AlertDialog.Builder(MainActivity.this).setMessage("You're right!").setPositiveButton("OK!",null).show();
            reset();
        }

    }
}
