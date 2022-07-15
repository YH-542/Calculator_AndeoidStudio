package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Objects;


public class MainActivity extends AppCompatActivity {

    private String first = "";
    private String second = "";
    private int parameter = 0; //四則演算を分類するため
    private int judge = 0; //入力を分ける
    private String sumS = ""; //合計の数字の文字列
    private int sum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButton_one(View view){
        String st1 = "1";
        StringBuilder buf = new StringBuilder();
        if (judge == 0){
            buf.append(first);
            buf.append(st1);
            first = buf.toString();
            ((TextView)findViewById(R.id.TextView)).setText(first);
        } else {
            buf.append(second);
            buf.append(st1);
            second = buf.toString();
            ((TextView)findViewById(R.id.TextView)).setText(second);
        }
    }

    public void onButton_two(View view){
        String st1 = "2";
        StringBuilder buf = new StringBuilder();
        if (judge == 0){
            buf.append(first);
            buf.append(st1);
            first = buf.toString();
            ((TextView)findViewById(R.id.TextView)).setText(first);
        } else {
            buf.append(second);
            buf.append(st1);
            second = buf.toString();
            ((TextView)findViewById(R.id.TextView)).setText(second);
        }
    }

    public void onButton_three(View view){
        String st1 = "3";
        StringBuilder buf = new StringBuilder();
        if (judge == 0){
            buf.append(first);
            buf.append(st1);
            first = buf.toString();
            ((TextView)findViewById(R.id.TextView)).setText(first);
        } else {
            buf.append(second);
            buf.append(st1);
            second = buf.toString();
            ((TextView)findViewById(R.id.TextView)).setText(second);
        }
    }

    public void onButton_four(View view){
        String st1 = "4";
        StringBuilder buf = new StringBuilder();
        if (judge == 0){
            buf.append(first);
            buf.append(st1);
            first = buf.toString();
            ((TextView)findViewById(R.id.TextView)).setText(first);
        } else {
            buf.append(second);
            buf.append(st1);
            second = buf.toString();
            ((TextView)findViewById(R.id.TextView)).setText(second);
        }
    }

    public void onButton_five(View view){
        String st1 = "5";
        StringBuilder buf = new StringBuilder();
        if (judge == 0){
            buf.append(first);
            buf.append(st1);
            first = buf.toString();
            ((TextView)findViewById(R.id.TextView)).setText(first);
        } else {
            buf.append(second);
            buf.append(st1);
            second = buf.toString();
            ((TextView)findViewById(R.id.TextView)).setText(second);
        }
    }

    public void onButton_six(View view){
        String st1 = "6";
        StringBuilder buf = new StringBuilder();
        if (judge == 0){
            buf.append(first);
            buf.append(st1);
            first = buf.toString();
            ((TextView)findViewById(R.id.TextView)).setText(first);
        } else {
            buf.append(second);
            buf.append(st1);
            second = buf.toString();
            ((TextView)findViewById(R.id.TextView)).setText(second);
        }
    }

    public void onButton_seven(View view){
        String st1 = "7";
        StringBuilder buf = new StringBuilder();
        if (judge == 0){
            buf.append(first);
            buf.append(st1);
            first = buf.toString();
            ((TextView)findViewById(R.id.TextView)).setText(first);
        } else {
            buf.append(second);
            buf.append(st1);
            second = buf.toString();
            ((TextView)findViewById(R.id.TextView)).setText(second);
        }
    }

    public void onButton_eight(View view){
        String st1 = "8";
        StringBuilder buf = new StringBuilder();
        if (judge == 0){
            buf.append(first);
            buf.append(st1);
            first = buf.toString();
            ((TextView)findViewById(R.id.TextView)).setText(first);
        } else {
            buf.append(second);
            buf.append(st1);
            second = buf.toString();
            ((TextView)findViewById(R.id.TextView)).setText(second);
        }
    }

    public void onButton_nine(View view){
        String st1 = "9";
        StringBuilder buf = new StringBuilder();
        if (judge == 0){
            buf.append(first);
            buf.append(st1);
            first = buf.toString();
            ((TextView)findViewById(R.id.TextView)).setText(first);
        } else {
            buf.append(second);
            buf.append(st1);
            second = buf.toString();
            ((TextView)findViewById(R.id.TextView)).setText(second);
        }
    }

    public void onButton_zero(View view){
        String st1 = "0";
        StringBuilder buf = new StringBuilder();
        if (judge == 0){
            buf.append(first);
            buf.append(st1);
            first = buf.toString();
            ((TextView)findViewById(R.id.TextView)).setText(first);
        } else {
            buf.append(second);
            buf.append(st1);
            second = buf.toString();
            ((TextView)findViewById(R.id.TextView)).setText(second);
        }
    }

    public void onButton_dot(View view){
        String st1 = ".";
        StringBuilder buf = new StringBuilder();
        if (judge == 0){
            buf.append(first);
            buf.append(st1);
            first = buf.toString();
            ((TextView)findViewById(R.id.TextView)).setText(first);
        } else {
            buf.append(second);
            buf.append(st1);
            second = buf.toString();
            ((TextView)findViewById(R.id.TextView)).setText(second);
        }
    }

    public void onButton_plus(View view){
        //足し算であることをパラメータに教える
        parameter = 1;

        //数字を入れる配列の変更
        if (judge == 0) {
            judge = 1;
        } else {
            int num1 = Integer.parseInt(first);
            int num2 = Integer.parseInt(second);
            sum = num1 + num2;
            sumS = String.valueOf(sum);
            judge = 0;
        }
        if (sumS != "") {
            ((TextView)findViewById(R.id.TextView)).setText(sumS);
        }
    }
}