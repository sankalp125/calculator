package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t1;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b0;
    Button bsum;
    Button bsub;
    Button bmult;
    Button bequal;
    Button bdiv;
    Button bclear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.textView);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        b0=findViewById(R.id.b0);
        bsum=findViewById(R.id.bsum);
        bsub=findViewById(R.id.bsub);
       bmult=findViewById(R.id.bmult);
       bdiv=findViewById(R.id.bdiv);
       bequal=findViewById(R.id.bequal);
       bclear=findViewById(R.id.bclear);
       int sum=0;
       int sub=0;
       int mul=0;
       int div=0;
       int flag=0;
       int x=0;
       int y=0;
       try {
           b1.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {


               }
           });
       }catch (NullPointerException ex){
           ex.printStackTrace();
       }
    }
}