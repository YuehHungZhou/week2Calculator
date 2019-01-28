package com.topdsr2.week2calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageButton number0,number1,number2,number3,number4,number5,number6,number7,number8,number9,
            button_dot,button_equal,button_add,button_less,button_cross,button_divil,button_percent,button_add_less,button_clean;
    private TextView show_text,answer_text;
    private float answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        number0 = (ImageButton) findViewById(R.id.number0);
        number1 = (ImageButton) findViewById(R.id.number1);
        number2 = (ImageButton) findViewById(R.id.number2);
        number3 = (ImageButton) findViewById(R.id.number3);
        number4 = (ImageButton) findViewById(R.id.number4);
        number5 = (ImageButton) findViewById(R.id.number5);
        number6 = (ImageButton) findViewById(R.id.number6);
        number7 = (ImageButton) findViewById(R.id.number7);
        number8 = (ImageButton) findViewById(R.id.number8);
        number9 = (ImageButton) findViewById(R.id.number9);
        button_dot = (ImageButton) findViewById(R.id.button_dot);
        button_equal = (ImageButton) findViewById(R.id.button_equal);
        button_add = (ImageButton) findViewById(R.id.button_add);
        button_less = (ImageButton) findViewById(R.id.button_less);
        button_cross = (ImageButton) findViewById(R.id.button_cross);
        button_divil = (ImageButton) findViewById(R.id.button_divil);
        button_percent = (ImageButton) findViewById(R.id.button_percent);
        button_add_less = (ImageButton) findViewById(R.id.button_add_less);
        button_clean = (ImageButton) findViewById(R.id.button_clean);

        show_text = (TextView) findViewById(R.id.show_text);
        answer_text = (TextView) findViewById(R.id.answer_text);




        number0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_text.setText(show_text.getText()+"0");
            }
        });

        number1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_text.setText(show_text.getText()+"1");
            }
        });

        number2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_text.setText(show_text.getText()+"2");
            }
        });

        number3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_text.setText(show_text.getText()+"3");
            }
        });

        number4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_text.setText(show_text.getText()+"4");
            }
        });

        number5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_text.setText(show_text.getText()+"5");
            }
        });

        number6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_text.setText(show_text.getText()+"6");
            }
        });

        number7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_text.setText(show_text.getText()+"7");
            }
        });

        number8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_text.setText(show_text.getText()+"8");
            }
        });

        number9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_text.setText(show_text.getText()+"9");
            }
        });

        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_text.setText(show_text.getText()+"+");
            }
        });

        button_less.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_text.setText(show_text.getText()+"-");
            }
        });

        button_cross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_text.setText(show_text.getText()+"*");
            }
        });

        button_divil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_text.setText(show_text.getText()+"/");
            }
        });

        button_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_text.setText(show_text.getText()+".");
            }
        });

        button_clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_text.setText("");
                answer_text.setText("");
            }
        });

        button_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double sum_add=0.0;
                Double sum_less=0.0;
                Double sum_cross=1.0;
                Double sum_divil=1.0;

            String[] a = show_text.getText().toString().split("[+]");

                for(int i=0;i<a.length;i++) {

                    if(a[i].contains("-")||a[i].contains("*")||a[i].contains("/")) {

                        String[] b=a[i].split("[-]");
                        //sum_less=Integer.parseInt(b[0]);
                        for(int j=0;j<b.length;j++) {
                           if(b[j].contains("*")||a[i].contains("/")){
                                String[] c=b[j].split("[*]");
                                for(int k=0;k<c.length;k++){
                                    if(c[k].contains("/")){
                                        String[] d=c[k].split("[/]");

                                        for (int l=0;l<d.length;l++){

                                            Double count4=Double.parseDouble(d[l]);
                                            sum_divil = sum_divil/count4;
                                        }
                                        sum_divil=Double.parseDouble(d[0])*Double.parseDouble(d[0])*sum_divil;
                                     c[k]=Double.toString(sum_divil);
                                    }
                                Double count3=Double.parseDouble(c[k]);
                                 sum_cross*=count3;
                                }
                             b[j]=Double.toString(sum_cross);
                            }
                            Double count2=Double.parseDouble(b[j]);
                            sum_less-=count2;
                        }
                        sum_less=Double.parseDouble(b[0])*2+sum_less;
                        a[i]=Double.toString(sum_less);
                    }
                Double count=Double.parseDouble(a[i]);
                sum_add +=count;
                }
                answer_text.setText(Double.toString(sum_add));


            }
        });

    }
}
