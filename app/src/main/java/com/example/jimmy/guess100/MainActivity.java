package com.example.jimmy.guess100;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tx1;
    TextView tx2;
    Button send;
    int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }
    public void findViews(){
        tx1 = (TextView)findViewById(R.id.secret);
        int a = (int)(Math.random()*100+1);
        tx1.setText(String.valueOf(a).toString());

        tx2 = (TextView)findViewById(R.id.number);
        send = (Button)findViewById(R.id.send);
    }
    public void Guess(View view){

    }
}
