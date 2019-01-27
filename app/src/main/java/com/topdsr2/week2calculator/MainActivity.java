package com.topdsr2.week2calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private ImageButton number0,number1,number2,number3,number4,number5,number6,number7,number8,number9,
            button_dot,button_equal,button_add,button_less,button_cross,button_divil,button_percent,button_add_less,button_clean;
    private TextView show_text,answer_text;


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

    }
}
