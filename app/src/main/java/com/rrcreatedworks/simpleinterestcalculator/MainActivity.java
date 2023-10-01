package com.rrcreatedworks.simpleinterestcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.*;


public class MainActivity extends AppCompatActivity {
    TextView tv1, tv2, tv3, tv4, tv5, tv6,tv11,tv22,tv33,tv44,tv55;
    EditText et1, et2, et3, et4,et11, et22, et33;
    Button btn,btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);
        tv5 = (TextView) findViewById(R.id.tv5);
        tv6 = (TextView) findViewById(R.id.tv6);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);
        et4 = (EditText) findViewById(R.id.et4);
        tv11 = (TextView) findViewById(R.id.tv11);
        tv22 = (TextView) findViewById(R.id.tv22);
        tv33 = (TextView) findViewById(R.id.tv33);
        tv55 = (TextView) findViewById(R.id.tv55);
        et11 = (EditText) findViewById(R.id.et11);
        et22= (EditText) findViewById(R.id.et22);
        et33 = (EditText) findViewById(R.id.et33);
        btn = (Button) findViewById(R.id.btn);
        btn1 = (Button) findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!et1.getText().toString().isEmpty() && !et2.getText().toString().isEmpty() &&
                        !et3.getText().toString().isEmpty() && !et4.getText().toString().isEmpty())  {
                    float a=Float.parseFloat(et1.getText().toString());
                    float b=Float.parseFloat(et2.getText().toString());
                    float c=Float.parseFloat(et3.getText().toString());
                    float d=Float.parseFloat(et4.getText().toString());
                    float result=(a*b*d/100);
                    float result1=(a*d/100);
                    float result2=result1/30;
                    float result3=result2*c;
                    float result4=result3+result;
                    float tot=result4+a;
                    tv5.setText(String.valueOf(("Simple Interest:"+result4)));
                    tv6.setText(String.valueOf("Total Amount:"+tot));
                }
                else {
                    Toast toast=Toast.makeText(MainActivity.this, "please mention all fields", Toast.LENGTH_LONG);
                    toast.show();

                }


            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!et11.getText().toString().isEmpty() && !et22.getText().toString().isEmpty() &&
                        !et33.getText().toString().isEmpty()) {
                    float p = Float.parseFloat(et11.getText().toString());
                    float r = Float.parseFloat(et22.getText().toString());
                    float t = Float.parseFloat(et33.getText().toString());
                    float ci= (float) (p*(Math.pow((1+r/100),t))-p);
                    float A=ci+p;
                    tv55.setText(String.valueOf(("compound Interest:" + ci)));
                }
                else{
                    Toast toast=Toast.makeText(MainActivity.this, "please mention all fields", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

    }

    @Override
    public void onBackPressed() {
        myAlert(MainActivity.this);
    }

    public void myAlert(Context mContext){
        new AlertDialog.Builder(mContext)
                .setIcon(R.mipmap.ic_launcher)
                .setTitle("Exit?")
                .setMessage("Do you want to exit application?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        System.exit(0);

                    }
                })
                .setNegativeButton("No",null)
                .show();

    }

    }
