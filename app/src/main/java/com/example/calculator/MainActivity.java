package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b0, b1, b2, b3, b4, b5, b6,
            b7, b8, b9, bA, bS, bD,
            bM, b10, bC, bE;
    TextView t1;

    float ValueOne, ValueTwo;

    boolean Add, Sub, Multi, Div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            b0 = (Button) findViewById(R.id.btn0);
            b1 = (Button) findViewById(R.id.btn1);
            b2 = (Button) findViewById(R.id.btn2);
            b3 = (Button) findViewById(R.id.btn3);
            b4 = (Button) findViewById(R.id.btn4);
            b5 = (Button) findViewById(R.id.btn5);
            b6 = (Button) findViewById(R.id.btn6);
            b7 = (Button) findViewById(R.id.btn7);
            b8 = (Button) findViewById(R.id.btn8);
            b9 = (Button) findViewById(R.id.btn9);
            b10 = (Button) findViewById(R.id.btn10);
            bA = (Button) findViewById(R.id.btnA);
            bS = (Button) findViewById(R.id.btnS);
            bM = (Button) findViewById(R.id.btnM);
            bD = (Button) findViewById(R.id.btnD);
            bC = (Button) findViewById(R.id.btnC);
            bE = (Button) findViewById(R.id.btnE);

            t1 = (TextView) findViewById(R.id.textView1);


            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    t1.setText(t1.getText() + "1");
                }
            });

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    t1.setText(t1.getText() + "2");
                }
            });

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    t1.setText(t1.getText() + "3");
                }
            });

            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    t1.setText(t1.getText() + "4");
                }
            });

            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    t1.setText(t1.getText() + "5");
                }
            });

            b6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    t1.setText(t1.getText() + "6");
                }
            });

            b7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    t1.setText(t1.getText() + "7");
                }
            });

            b8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    t1.setText(t1.getText() + "8");
                }
            });

            b9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    t1.setText(t1.getText() + "9");
                }
            });

            b0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    t1.setText(t1.getText() + "0");
                }
            });

            bA.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (t1 == null) {
                        t1.setText("");
                    } else {
                        ValueOne = Float.parseFloat(t1.getText() + "");
                        Add = true;
                        t1.setText(null);
                    }
                }
            });

            bS.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ValueOne = Float.parseFloat(t1.getText() + "");
                    Sub = true;
                    t1.setText(null);
                }
            });

            bM.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ValueOne = Float.parseFloat(t1.getText() + "");
                    Multi = true;
                    t1.setText(null);
                }
            });

            bD.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ValueOne = Float.parseFloat(t1.getText() + "");
                    Div = true;
                    t1.setText(null);
                }
            });

            bE.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ValueTwo = Float.parseFloat(t1.getText() + "");

                    if (Add == true) {
                        t1.setText(ValueOne + ValueTwo + "");
                        Add = false;
                    }

                    if (Sub == true) {
                        t1.setText(ValueOne - ValueTwo + "");
                        Sub = false;
                    }

                    if (Multi == true) {
                        t1.setText(ValueOne * ValueTwo + "");
                        Multi = false;
                    }

                    if (Div == true) {
                        t1.setText(ValueOne / ValueTwo + "");
                        Div = false;
                    }
                }
            });

            bC.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    t1.setText("");
                }
            });

            b10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    t1.setText(t1.getText() + ".");
                }
            });
        }

    }

