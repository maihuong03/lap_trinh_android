package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView convertCurrency,afterCurrency,titileFrom,titileTo;

    boolean isFromKRW;
    boolean isFromJPY;
    boolean isFromVND;
    boolean isFromCNY;
    boolean isFromUSD;
    boolean isFromEUR;
    boolean isToKRW;
    boolean isToJPY;
    boolean isToVND;
    boolean isToCNY;
    boolean isToUSD;
    boolean isToEUR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        convertCurrency=findViewById(R.id.presentCurrencyEditText);
        afterCurrency=findViewById(R.id.afterCurrencyEditText);
        titileFrom=findViewById(R.id.presentCurrency);
        titileTo=findViewById(R.id.afterCurrency);
        setValue();
        setTitle();


        convertCurrency.addTextChangedListener(
                new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                        double result=Double.parseDouble(convertCurrency.getText().toString())*24000;
                        afterCurrency.setText(String.valueOf(result));
                    }

                    @Override
                    public void afterTextChanged(Editable editable) {

                    }
                }
        );
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        // check if the request code is same as what is passed  here it is 2
        if(requestCode==1)
        {
            setTitle();
        }
    }
    public void convertActivity(View view) {
        double result=Double.parseDouble(convertCurrency.getText().toString())*24000;
        afterCurrency.setText(String.valueOf(result));
    }

    public void clearActivity(View view) {
        convertCurrency.setText("");
        afterCurrency.setText("");
    }

    public void changeCurrencyActivity(View view) {
        Intent intent=new Intent(this,CurrencyCoverterType.class);
        startActivity(intent);
    }

    public void setTitle(){
        if(isFromCNY==true){
            titileFrom.setText("From: CNY");
        }
        if(isFromKRW==true){
            titileFrom.setText("From: KRW");
        }
        if(isFromVND==true){
            titileFrom.setText("From: VND");
        }
        if(isFromUSD==true){
            titileFrom.setText("From: USA");
        }
        if(isFromEUR==true){
            titileFrom.setText("From: EUR");
        }
        if(isFromJPY==true){
            titileFrom.setText("From: JPY");
        }
        if(isToVND==true){
            titileTo.setText("To: VND");
        }
        if(isToUSD==true){
            titileTo.setText("To: USA");
        }
        if(isToKRW==true){
            titileTo.setText("To: KRW");
        }
        if(isToEUR==true){
            titileTo.setText("To: EUR");
        }
        if(isToJPY==true){
            titileTo.setText("To: JPY");
        }
        if(isToCNY==true){
            titileTo.setText("To: CNY");
        }
    }
    public void setValue(){
        Intent intent=getIntent();
        isFromUSD=intent.getBooleanExtra("fromUSD",true);
        isFromVND=intent.getBooleanExtra("fromVND",false);
        isFromEUR=intent.getBooleanExtra("fromEUR",false);
        isFromJPY=intent.getBooleanExtra("fromJPY",false);
        isFromKRW=intent.getBooleanExtra("fromKRW",false);
        isFromCNY=intent.getBooleanExtra("fromCNY",false);
        isToVND=intent.getBooleanExtra("toVND",true);
        isToUSD=intent.getBooleanExtra("toUSD",false);
        isToCNY=intent.getBooleanExtra("toCNY",false);
        isToJPY=intent.getBooleanExtra("toJPY",false);
        isToEUR=intent.getBooleanExtra("toEUR",false);
        isToKRW=intent.getBooleanExtra("toKRW",false);
    }

}