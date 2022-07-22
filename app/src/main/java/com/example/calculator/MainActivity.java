package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayDeque;
import java.util.Queue;


public class MainActivity extends AppCompatActivity {

    private String first = "";
    private int parameter = 0; //四則演算を分類するため
    private int judge = 0; //入力を分ける
    private String sumS = ""; //合計の数字の文字列
    private int sum = 0;
    private Queue<String> queue = new ArrayDeque<>(); //キューの作成

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onButton_one(View view){
        String st1 = "1";
        StringBuilder buf = new StringBuilder();
        buf.append(first); //元々入っていた文字列
        buf.append(st1); // 押されたボタンの数字
        first = buf.toString(); //元々入っていた文字列の後ろに押された文字列を追加

        //テキストを表示
        ((TextView)findViewById(R.id.TextView)).setText(first);
    }

    public void onButton_two(View view){
        String st1 = "2";
        StringBuilder buf = new StringBuilder();
        buf.append(first); //元々入っていた文字列
        buf.append(st1); // 押されたボタンの数字
        first = buf.toString(); //元々入っていた文字列の後ろに押された文字列を追加

        //テキストを表示
        ((TextView)findViewById(R.id.TextView)).setText(first);
    }

    public void onButton_three(View view){
        String st1 = "3";
        StringBuilder buf = new StringBuilder();
        buf.append(first); //元々入っていた文字列
        buf.append(st1); // 押されたボタンの数字
        first = buf.toString(); //元々入っていた文字列の後ろに押された文字列を追加

        //テキストを表示
        ((TextView)findViewById(R.id.TextView)).setText(first);
    }

    public void onButton_four(View view){
        String st1 = "4";
        StringBuilder buf = new StringBuilder();
        buf.append(first); //元々入っていた文字列
        buf.append(st1); // 押されたボタンの数字
        first = buf.toString(); //元々入っていた文字列の後ろに押された文字列を追加

        //テキストを表示
        ((TextView)findViewById(R.id.TextView)).setText(first);
    }

    public void onButton_five(View view){
        String st1 = "5";
        StringBuilder buf = new StringBuilder();
        buf.append(first); //元々入っていた文字列
        buf.append(st1); // 押されたボタンの数字
        first = buf.toString(); //元々入っていた文字列の後ろに押された文字列を追加

        //テキストを表示
        ((TextView)findViewById(R.id.TextView)).setText(first);
    }

    public void onButton_six(View view){
        String st1 = "6";
        StringBuilder buf = new StringBuilder();
        buf.append(first); //元々入っていた文字列
        buf.append(st1); // 押されたボタンの数字
        first = buf.toString(); //元々入っていた文字列の後ろに押された文字列を追加

        //テキストを表示
        ((TextView)findViewById(R.id.TextView)).setText(first);
    }

    public void onButton_seven(View view){
        String st1 = "7";
        StringBuilder buf = new StringBuilder();
        buf.append(first); //元々入っていた文字列
        buf.append(st1); // 押されたボタンの数字
        first = buf.toString(); //元々入っていた文字列の後ろに押された文字列を追加

        //テキストを表示
        ((TextView)findViewById(R.id.TextView)).setText(first);
    }

    public void onButton_eight(View view){
        String st1 = "8";
        StringBuilder buf = new StringBuilder();
        buf.append(first); //元々入っていた文字列
        buf.append(st1); // 押されたボタンの数字
        first = buf.toString(); //元々入っていた文字列の後ろに押された文字列を追加

        //テキストを表示
        ((TextView)findViewById(R.id.TextView)).setText(first);
    }

    public void onButton_nine(View view){
        String st1 = "9";
        StringBuilder buf = new StringBuilder();
        buf.append(first); //元々入っていた文字列
        buf.append(st1); // 押されたボタンの数字
        first = buf.toString(); //元々入っていた文字列の後ろに押された文字列を追加

        //テキストを表示
        ((TextView)findViewById(R.id.TextView)).setText(first);
    }

    public void onButton_zero(View view){
        String st1 = "0";
        StringBuilder buf = new StringBuilder();
        buf.append(first); //元々入っていた文字列
        buf.append(st1); // 押されたボタンの数字
        first = buf.toString(); //元々入っていた文字列の後ろに押された文字列を追加

        //テキストを表示
        ((TextView)findViewById(R.id.TextView)).setText(first);
    }

    public void onButton_dot(View view){
        String st1 = ".";
        StringBuilder buf = new StringBuilder();
        buf.append(first); //元々入っていた文字列
        buf.append(st1); // 押されたボタンの数字
        first = buf.toString(); //元々入っていた文字列の後ろに押された文字列を追加

        //テキストを表示
        ((TextView)findViewById(R.id.TextView)).setText(first);
    }

    //足し算
    public void onButton_plus(View view){
        //入力された文字列をキューに追加
        queue.add(first);
        System.out.println(queue.peek());
        first = "";
        if (queue.size() == 1) {
            //足し算であることをパラメータに教える
            parameter = 1;
        } else {
            if (parameter == 1) { //押された記号が＋の場合
                //キューから取り出す
                String str1 = queue.poll();
                String str2 = queue.poll();
                //取り出した文字列を数値に変換
                int num1 = Integer.parseInt(str1);
                int num2 = Integer.parseInt(str2);
                //計算
                sum = num1 + num2;
                sumS = String.valueOf(sum);
                ((TextView) findViewById(R.id.TextView)).setText(sumS);
                //キューに追加
                queue.add(sumS);
                parameter = 1;
            }
            if (parameter == 2) { //押された記号が-の場合
                //キューから取り出す
                String str1 = queue.poll();
                String str2 = queue.poll();
                //取り出した文字列を数値に変換
                int num1 = Integer.parseInt(str1);
                int num2 = Integer.parseInt(str2);
                //計算
                sum = num1 - num2;
                sumS = String.valueOf(sum);
                ((TextView) findViewById(R.id.TextView)).setText(sumS);
                //キューに追加
                queue.add(sumS);
                parameter = 1;
            }
            if (parameter == 3) { //押された記号が×の場合
                //キューから取り出す
                String str1 = queue.poll();
                String str2 = queue.poll();
                //取り出した文字列を数値に変換
                int num1 = Integer.parseInt(str1);
                int num2 = Integer.parseInt(str2);
                //計算
                sum = num1 * num2;
                sumS = String.valueOf(sum);
                ((TextView) findViewById(R.id.TextView)).setText(sumS);
                //キューに追加
                queue.add(sumS);
                parameter = 1;
            }
            if (parameter == 4) { //押された記号が÷の場合
                //キューから取り出す
                String str1 = queue.poll();
                String str2 = queue.poll();
                //取り出した文字列を数値に変換
                int num1 = Integer.parseInt(str1);
                int num2 = Integer.parseInt(str2);
                //計算
                if (num2 == 0){
                    ((TextView) findViewById(R.id.TextView)).setText("Error");
                }
                else{
                    sum = num1 / num2;
                    sumS = String.valueOf(sum);
                    ((TextView) findViewById(R.id.TextView)).setText(sumS);
                    //キューに追加
                    queue.add(sumS);
                    parameter = 1;
                }
            }
//            if (parameter == 5){ //押された記号が=の場合
//                ((TextView) findViewById(R.id.TextView)).setText(sumS);
//                parameter = 1;
//            }
        }
    }

    //引き算
    public void onButton_sub(View view){
        //入力された文字列をキューに追加
        queue.add(first);
        System.out.println(queue.peek());
        first = "";
        if (queue.size() == 1) {
            //引き算であることをパラメータに教える
            parameter = 2;
        } else {
            if (parameter == 1) { //押された記号が＋の場合
                //キューから取り出す
                String str1 = queue.poll();
                String str2 = queue.poll();
                //取り出した文字列を数値に変換
                int num1 = Integer.parseInt(str1);
                int num2 = Integer.parseInt(str2);
                //計算
                sum = num1 + num2;
                sumS = String.valueOf(sum);
                ((TextView) findViewById(R.id.TextView)).setText(sumS);
                //キューに追加
                queue.add(sumS);
                parameter = 2;
            }
            if (parameter == 2) { //押された記号が-の場合
                //キューから取り出す
                String str1 = queue.poll();
                String str2 = queue.poll();
                //取り出した文字列を数値に変換
                int num1 = Integer.parseInt(str1);
                int num2 = Integer.parseInt(str2);
                //計算
                sum = num1 - num2;
                sumS = String.valueOf(sum);
                ((TextView) findViewById(R.id.TextView)).setText(sumS);
                //キューに追加
                queue.add(sumS);
                parameter = 2;
            }
            if (parameter == 3) { //押された記号が×の場合
                //キューから取り出す
                String str1 = queue.poll();
                String str2 = queue.poll();
                //取り出した文字列を数値に変換
                int num1 = Integer.parseInt(str1);
                int num2 = Integer.parseInt(str2);
                //計算
                sum = num1 * num2;
                sumS = String.valueOf(sum);
                ((TextView) findViewById(R.id.TextView)).setText(sumS);
                //キューに追加
                queue.add(sumS);
                parameter = 2;
            }
            if (parameter == 4) { //押された記号が÷の場合
                //キューから取り出す
                String str1 = queue.poll();
                String str2 = queue.poll();
                //取り出した文字列を数値に変換
                int num1 = Integer.parseInt(str1);
                int num2 = Integer.parseInt(str2);
                //計算
                if (num2 == 0){
                    ((TextView) findViewById(R.id.TextView)).setText("Error");
                }
                else{
                    sum = num1 / num2;
                    sumS = String.valueOf(sum);
                    ((TextView) findViewById(R.id.TextView)).setText(sumS);
                    //キューに追加
                    queue.add(sumS);
                    parameter = 2;
                }
            }
            /*if (parameter == 5){ //押された記号が=の場合
                ((TextView) findViewById(R.id.TextView)).setText(sumS);
                parameter = 2;
            }*/
        }
    }

    //かけ算
    public void onButton_multi(View view){
        //入力された文字列をキューに追加
        queue.add(first);
        //System.out.println(queue.peek());
        first = "";
        if (queue.size() == 1) {
            //引き算であることをパラメータに教える
            parameter = 3;
        } else {
            if (parameter == 1) { //押された記号が＋の場合
                //キューから取り出す
                String str1 = queue.poll();
                String str2 = queue.poll();
                //取り出した文字列を数値に変換
                int num1 = Integer.parseInt(str1);
                int num2 = Integer.parseInt(str2);
                //計算
                sum = num1 + num2;
                sumS = String.valueOf(sum);
                ((TextView) findViewById(R.id.TextView)).setText(sumS);
                //キューに追加
                queue.add(sumS);
                parameter = 3;
            }
            if (parameter == 2) { //押された記号が-の場合
                //キューから取り出す
                String str1 = queue.poll();
                String str2 = queue.poll();
                //取り出した文字列を数値に変換
                int num1 = Integer.parseInt(str1);
                int num2 = Integer.parseInt(str2);
                //計算
                sum = num1 - num2;
                sumS = String.valueOf(sum);
                ((TextView) findViewById(R.id.TextView)).setText(sumS);
                //キューに追加
                queue.add(sumS);
                parameter = 3;
            }
            if (parameter == 3) { //押された記号が×の場合
                //キューから取り出す
                String str1 = queue.poll();
                String str2 = queue.poll();
                //取り出した文字列を数値に変換
                int num1 = Integer.parseInt(str1);
                int num2 = Integer.parseInt(str2);
                //計算
                sum = num1 * num2;
                sumS = String.valueOf(sum);
                ((TextView) findViewById(R.id.TextView)).setText(sumS);
                //キューに追加
                queue.add(sumS);
                parameter = 3;
            }
            if (parameter == 4) { //押された記号が÷の場合
                //キューから取り出す
                String str1 = queue.poll();
                String str2 = queue.poll();
                //取り出した文字列を数値に変換
                int num1 = Integer.parseInt(str1);
                int num2 = Integer.parseInt(str2);
                //計算
                if (num2 == 0){
                    ((TextView) findViewById(R.id.TextView)).setText("Error");
                }
                else{
                    sum = num1 / num2;
                    sumS = String.valueOf(sum);
                    ((TextView) findViewById(R.id.TextView)).setText(sumS);
                    //キューに追加
                    queue.add(sumS);
                    parameter = 3;
                }
            }
//            if (parameter == 5){ //押された記号が=の場合
//                ((TextView) findViewById(R.id.TextView)).setText(sumS);
//                parameter = 3;
//            }
        }
    }

    //わり算
    public void onButton_divide(View view){
        //入力された文字列をキューに追加
        queue.add(first);
        //System.out.println(queue.peek());
        first = "";
        if (queue.size() == 1) {
            //引き算であることをパラメータに教える
            parameter = 4;
        } else {
            if (parameter == 1) { //押された記号が＋の場合
                //キューから取り出す
                String str1 = queue.poll();
                String str2 = queue.poll();
                //取り出した文字列を数値に変換
                int num1 = Integer.parseInt(str1);
                int num2 = Integer.parseInt(str2);
                //計算
                sum = num1 + num2;
                sumS = String.valueOf(sum);
                ((TextView) findViewById(R.id.TextView)).setText(sumS);
                //キューに追加
                queue.add(sumS);
                parameter = 4;
            }
            if (parameter == 2) { //押された記号が-の場合
                //キューから取り出す
                String str1 = queue.poll();
                String str2 = queue.poll();
                //取り出した文字列を数値に変換
                int num1 = Integer.parseInt(str1);
                int num2 = Integer.parseInt(str2);
                //計算
                sum = num1 - num2;
                sumS = String.valueOf(sum);
                ((TextView) findViewById(R.id.TextView)).setText(sumS);
                //キューに追加
                queue.add(sumS);
                parameter = 4;
            }
            if (parameter == 3) { //押された記号が×の場合
                //キューから取り出す
                String str1 = queue.poll();
                String str2 = queue.poll();
                //取り出した文字列を数値に変換
                int num1 = Integer.parseInt(str1);
                int num2 = Integer.parseInt(str2);
                //計算
                sum = num1 * num2;
                sumS = String.valueOf(sum);
                ((TextView) findViewById(R.id.TextView)).setText(sumS);
                //キューに追加
                queue.add(sumS);
                parameter = 4;
            }
            if (parameter == 4) { //押された記号が÷の場合
                //キューから取り出す
                String str1 = queue.poll();
                String str2 = queue.poll();
                //取り出した文字列を数値に変換
                int num1 = Integer.parseInt(str1);
                int num2 = Integer.parseInt(str2);
                //計算
                if (num2 == 0){
                    ((TextView) findViewById(R.id.TextView)).setText("Error");
                }
                else{
                    sum = num1 / num2;
                    sumS = String.valueOf(sum);
                    ((TextView) findViewById(R.id.TextView)).setText(sumS);
                    //キューに追加
                    queue.add(sumS);
                    parameter = 4;
                }
            }
//            if (parameter == 5){
//                ((TextView) findViewById(R.id.TextView)).setText(sumS);
//                parameter = 4;
//            }
        }
    }

    public void onButton_equal(View view){
        //入力された文字列をキューに追加
        queue.add(first);
        //System.out.println(queue.peek());
        first = "";
        if (queue.size() == 1) {
            //イコールであることをパラメータに教える
            parameter = 5;
        } else {
            if (parameter == 1) { //押された記号が＋の場合
                //キューから取り出す
                String str1 = queue.poll();
                String str2 = queue.poll();
                //取り出した文字列を数値に変換
                int num1 = Integer.parseInt(str1);
                int num2 = Integer.parseInt(str2);
                //計算
                sum = num1 + num2;
                sumS = String.valueOf(sum);
                ((TextView) findViewById(R.id.TextView)).setText(sumS);
                //キューに追加
                queue.add(sumS);
                parameter = 5;
            }
            if (parameter == 2) { //押された記号が-の場合
                //キューから取り出す
                String str1 = queue.poll();
                String str2 = queue.poll();
                //取り出した文字列を数値に変換
                int num1 = Integer.parseInt(str1);
                int num2 = Integer.parseInt(str2);
                //計算
                sum = num1 - num2;
                sumS = String.valueOf(sum);
                ((TextView) findViewById(R.id.TextView)).setText(sumS);
                //キューに追加
                queue.add(sumS);
                parameter = 5;
            }
            if (parameter == 3) { //押された記号が×の場合
                //キューから取り出す
                String str1 = queue.poll();
                String str2 = queue.poll();
                //取り出した文字列を数値に変換
                int num1 = Integer.parseInt(str1);
                int num2 = Integer.parseInt(str2);
                //計算
                sum = num1 * num2;
                sumS = String.valueOf(sum);
                ((TextView) findViewById(R.id.TextView)).setText(sumS);
                //キューに追加
                queue.add(sumS);
                parameter = 5;
            }
            if (parameter == 4) { //押された記号が÷の場合
                //キューから取り出す
                String str1 = queue.poll();
                String str2 = queue.poll();
                //取り出した文字列を数値に変換
                int num1 = Integer.parseInt(str1);
                int num2 = Integer.parseInt(str2);
                //計算
                if (num2 == 0){
                    ((TextView) findViewById(R.id.TextView)).setText("Error");
                }
                else{
                    sum = num1 / num2;
                    sumS = String.valueOf(sum);
                    ((TextView) findViewById(R.id.TextView)).setText(sumS);
                    //キューに追加
                    queue.add(sumS);
                    parameter = 5;
                }
            }
//            if (parameter == 5){
//                ((TextView) findViewById(R.id.TextView)).setText(sumS);
//                parameter = 5;
//            }
        }
    }
}