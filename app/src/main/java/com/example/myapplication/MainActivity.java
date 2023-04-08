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
    int sum=0;
    int sub=0;
    int mul=0;
    int div=0;
    int flag=0;
    int x=0;
    int y=0;
    int justclicked=0;
    int result;

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

       try {
           b1.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   if(flag==0){
                       x=x*10+1;
                       t1.setText(String.valueOf(x));
                   }
                   if(flag==1){
                       y=y*10+1;
                       if(sum==1){
                           t1.setText(String.valueOf(x)+"+"+String.valueOf(y));
                       }
                       if(sub==1){
                           t1.setText(String.valueOf(x)+"-"+String.valueOf(y));
                       }
                       if(mul==1){
                           t1.setText(String.valueOf(x)+"x"+String.valueOf(y));
                       }
                       if(div==1){
                           t1.setText(String.valueOf(x)+"%"+String.valueOf(y));
                       }
                   }
               }
           });
           b2.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   if(flag==0){
                       x=x*10+2;
                       t1.setText(String.valueOf(x));
                   }
                   if(flag==1){
                       y=y*10+2;
                       if(sum==1){
                           t1.setText(String.valueOf(x)+"+"+String.valueOf(y));
                       }
                       if(sub==1){
                           t1.setText(String.valueOf(x)+"-"+String.valueOf(y));
                       }
                       if(mul==1){
                           t1.setText(String.valueOf(x)+"x"+String.valueOf(y));
                       }
                       if(div==1){
                           t1.setText(String.valueOf(x)+"%"+String.valueOf(y));
                       }
                   }
               }
           });
           b3.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   if(flag==0){
                       x=x*10+3;
                       t1.setText(String.valueOf(x));
                   }
                   if(flag==1){
                       y=y*10+3;
                       if(sum==1){
                           t1.setText(String.valueOf(x)+"+"+String.valueOf(y));
                       }
                       if(sub==1){
                           t1.setText(String.valueOf(x)+"-"+String.valueOf(y));
                       }
                       if(mul==1){
                           t1.setText(String.valueOf(x)+"x"+String.valueOf(y));
                       }
                       if(div==1){
                           t1.setText(String.valueOf(x)+"%"+String.valueOf(y));
                       }
                   }
               }
           });
           b4.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   if(flag==0){
                       x=x*10+4;
                       t1.setText(String.valueOf(x));
                   }
                   if(flag==1){
                       y=y*10+4;
                       if(sum==1){
                           t1.setText(String.valueOf(x)+"+"+String.valueOf(y));
                       }
                       if(sub==1){
                           t1.setText(String.valueOf(x)+"-"+String.valueOf(y));
                       }
                       if(mul==1){
                           t1.setText(String.valueOf(x)+"x"+String.valueOf(y));
                       }
                       if(div==1){
                           t1.setText(String.valueOf(x)+"%"+String.valueOf(y));
                       }
                   }
               }
           });
           b5.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   if(flag==0){
                       x=x*10+5;
                       t1.setText(String.valueOf(x));
                   }
                   if(flag==1){
                       y=y*10+5;
                       if(sum==1){
                           t1.setText(String.valueOf(x)+"+"+String.valueOf(y));
                       }
                       if(sub==1){
                           t1.setText(String.valueOf(x)+"-"+String.valueOf(y));
                       }
                       if(mul==1){
                           t1.setText(String.valueOf(x)+"x"+String.valueOf(y));
                       }
                       if(div==1){
                           t1.setText(String.valueOf(x)+"%"+String.valueOf(y));
                       }
                   }
               }
           });
           b6.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   if(flag==0){
                       x=x*10+6;
                       t1.setText(String.valueOf(x));
                   }
                   if(flag==1){
                       y=y*10+6;
                       if(sum==1){
                           t1.setText(String.valueOf(x)+"+"+String.valueOf(y));
                       }
                       if(sub==1){
                           t1.setText(String.valueOf(x)+"-"+String.valueOf(y));
                       }
                       if(mul==1){
                           t1.setText(String.valueOf(x)+"x"+String.valueOf(y));
                       }
                       if(div==1){
                           t1.setText(String.valueOf(x)+"%"+String.valueOf(y));
                       }
                   }
               }
           });
           b7.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   if(flag==0){
                       x=x*10+7;
                       t1.setText(String.valueOf(x));
                   }
                   if(flag==1){
                       y=y*10+7;
                       if(sum==1){
                           t1.setText(String.valueOf(x)+"+"+String.valueOf(y));
                       }
                       if(sub==1){
                           t1.setText(String.valueOf(x)+"-"+String.valueOf(y));
                       }
                       if(mul==1){
                           t1.setText(String.valueOf(x)+"x"+String.valueOf(y));
                       }
                       if(div==1){
                           t1.setText(String.valueOf(x)+"%"+String.valueOf(y));
                       }
                   }
               }
           });
           b8.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   if(flag==0){
                       x=x*10+8;
                       t1.setText(String.valueOf(x));
                   }
                   if(flag==1){
                       y=y*10+8;
                       if(sum==1){
                           t1.setText(String.valueOf(x)+"+"+String.valueOf(y));
                       }
                       if(sub==1){
                           t1.setText(String.valueOf(x)+"-"+String.valueOf(y));
                       }
                       if(mul==1){
                           t1.setText(String.valueOf(x)+"x"+String.valueOf(y));
                       }
                       if(div==1){
                           t1.setText(String.valueOf(x)+"%"+String.valueOf(y));
                       }
                   }
               }
           });
           b9.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   if(flag==0){
                       x=x*10+9;
                       t1.setText(String.valueOf(x));
                   }
                   if(flag==1){
                       y=y*10+9;
                       if(sum==1){
                           t1.setText(String.valueOf(x)+"+"+String.valueOf(y));
                       }
                       if(sub==1){
                           t1.setText(String.valueOf(x)+"-"+String.valueOf(y));
                       }
                       if(mul==1){
                           t1.setText(String.valueOf(x)+"x"+String.valueOf(y));
                       }
                       if(div==1){
                           t1.setText(String.valueOf(x)+"%"+String.valueOf(y));
                       }
                   }
               }
           });
           b0.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   if(flag==0){
                       x=x*10;
                       t1.setText(String.valueOf(x));
                   }
                   if(flag==1){
                       y=y*10;
                       if(sum==1){
                           t1.setText(String.valueOf(x)+"+"+String.valueOf(y));
                       }
                       if(sub==1){
                           t1.setText(String.valueOf(x)+"-"+String.valueOf(y));
                       }
                       if(mul==1){
                           t1.setText(String.valueOf(x)+"x"+String.valueOf(y));
                       }
                       if(div==1){
                           t1.setText(String.valueOf(x)+"%"+String.valueOf(y));
                       }
                   }
               }
           });
           bsum.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                       flag = 1;
                       sum = 1;

                   t1.setText(String.valueOf(x)+"+");

               }
           });
           bsub.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {

                       flag=1;
                       sub=1;
                       t1.setText(String.valueOf(x)+"-");


               }
           });
           bmult.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   flag=1;
                   mul=1;
                   t1.setText(String.valueOf(x)+"x");
               }
           });
           bdiv.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   flag=1;
                   div=1;
                   t1.setText(String.valueOf(x)+"%");
               }
           });
           bequal.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   if(flag==1){
                       flag=0;
                   }
                   if(sum==1){
                       result=x+y;
                       t1.setText(String.valueOf(result));
                       sum=0;
                   }
                   if(sub==1){
                       result=x-y;
                       t1.setText(String.valueOf(result));
                       sub=0;
                   }
                   if(mul==1){
                       result=x*y;
                       t1.setText(String.valueOf(result));
                       mul=0;
                   }
                   if(div==1){
                       result=x/y;
                       t1.setText(String.valueOf(result));
                       div=0;
                   }
               }
           });
           bclear.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   t1.setText("0");
                   flag=0;
                   sum=0;
                   sub=0;
                   mul=0;
                   div=0;
                   x=0;
                   y=0;
               }


           });

       }catch (NullPointerException ex){
           ex.printStackTrace();
       }
    }
}