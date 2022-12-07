package com.example.currencyconverter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class CurrencyCoverterType extends AppCompatActivity {
    RadioButton fromKRW,fromJPY,fromVND,fromUSD,fromCNY,fromEUR,toCNY,toVND,toUSD,toKRW,toEUR,toJPY;

    boolean isFromKRW=false;
    boolean isFromJPY=false;
    boolean isFromVND=false;
    boolean isFromCNY=false;
    boolean isFromUSD=true;
    boolean isFromEUR=false;
    boolean isToKRW=false;
    boolean isToJPY=false;
    boolean isToVND=true;
    boolean isToCNY=false;
    boolean isToUSD=false;
    boolean isToEUR=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_coverter_type);
        findButton();

    }

    public void cancelActivity(View view) {

        finish();
    }

    public void okActivity(View view) {
        Intent intent= new Intent(this,MainActivity.class);
        changeValue();
        intent.putExtra("fromCNY",isFromCNY);
        intent.putExtra("fromKRW",isFromKRW);
        intent.putExtra("fromUSD",isFromUSD);
        intent.putExtra("fromVND",isFromVND);
        intent.putExtra("fromEUR",isFromEUR);
        intent.putExtra("fromJPY",isFromJPY);
        intent.putExtra("toJPY",isToJPY);
        intent.putExtra("toKRW",isToKRW);
        intent.putExtra("toCNY",isToCNY);
        intent.putExtra("toUSD",isToUSD);
        intent.putExtra("toEUR",isToEUR);
        intent.putExtra("toVND",isToVND);
        startActivityForResult(intent,1);
        finish();







    }

    public void radioButtonCNY(View view) {
        if(fromCNY.isChecked()){
            fromVND.setClickable(false);
            fromKRW.setClickable(false);
            fromUSD.setClickable(false);
            fromEUR.setClickable(false);
            fromJPY.setClickable(false);
        }
        if(toCNY.isChecked()){
            toVND.setClickable(false);
            toKRW.setClickable(false);
            toUSD.setClickable(false);
            toEUR.setClickable(false);
            toJPY.setClickable(false);
        }
    }
    public void findButton(){
        fromCNY=findViewById(R.id.fromCNYButton);
        fromEUR=findViewById(R.id.fromEURButton);
        fromJPY=findViewById(R.id.fromJPYButton);
        fromKRW=findViewById(R.id.fromKRWButton);
        fromUSD=findViewById(R.id.fromUSDButton);
        fromVND=findViewById(R.id.fromVNDButton);
        toCNY=findViewById(R.id.toCNYButton);
        toEUR=findViewById(R.id.toEURButton);
        toJPY=findViewById(R.id.toJPYButton);
        toKRW=findViewById(R.id.toKRWButton);
        toVND=findViewById(R.id.toVNDButton);
        toUSD=findViewById(R.id.toUSAButton);
    }

    public void radioButtonKRW(View view) {
        if(fromKRW.isChecked()){
            fromVND.setClickable(false);
            fromCNY.setClickable(false);
            fromUSD.setClickable(false);
            fromEUR.setClickable(false);
            fromJPY.setClickable(false);
        }
        if(toKRW.isChecked()){
            toVND.setClickable(false);
            toCNY.setClickable(false);
            toUSD.setClickable(false);
            toEUR.setClickable(false);
            toJPY.setClickable(false);
        }
    }

    public void radioButtonEUR(View view) {
        if(fromEUR.isChecked()){
            fromVND.setClickable(false);
            fromKRW.setClickable(false);
            fromUSD.setClickable(false);
            fromCNY.setClickable(false);
            fromJPY.setClickable(false);
        }
        if(toEUR.isChecked()){
            toVND.setClickable(false);
            toKRW.setClickable(false);
            toUSD.setClickable(false);
            toCNY.setClickable(false);
            toJPY.setClickable(false);
        }
    }

    public void radioButtonUSD(View view) {
        if(fromUSD.isChecked()){
            fromVND.setClickable(false);
            fromKRW.setClickable(false);
            fromCNY.setClickable(false);
            fromEUR.setClickable(false);
            fromJPY.setClickable(false);
        }
        if(toUSD.isChecked()){
            toVND.setClickable(false);
            toKRW.setClickable(false);
            toCNY.setClickable(false);
            toEUR.setClickable(false);
            toJPY.setClickable(false);
        }
    }

    public void radioButtonJYP(View view) {
        if(fromJPY.isChecked()){
            fromVND.setClickable(false);
            fromKRW.setClickable(false);
            fromUSD.setClickable(false);
            fromEUR.setClickable(false);
            fromCNY.setClickable(false);
        }
        if(toJPY.isChecked()){
            toVND.setClickable(false);
            toKRW.setClickable(false);
            toUSD.setClickable(false);
            toEUR.setClickable(false);
            toCNY.setClickable(false);
        }
    }

    public void radioButtonVND(View view) {
        if(fromVND.isChecked()){
            fromCNY.setClickable(false);
            fromKRW.setClickable(false);
            fromUSD.setClickable(false);
            fromEUR.setClickable(false);
            fromJPY.setClickable(false);
        }
        if(toVND.isChecked()){
            toCNY.setClickable(false);
            toKRW.setClickable(false);
            toUSD.setClickable(false);
            toEUR.setClickable(false);
            toJPY.setClickable(false);
        }
    }
    public void changeValue(){
        if(fromVND.isChecked()){
            isFromVND=true;
            isFromEUR=false;
            isFromUSD=false;
            isFromCNY=false;
            isFromKRW=false;
            isFromJPY=false;
        }
        if(fromUSD.isChecked()){
            isFromVND=false;
            isFromEUR=false;
            isFromUSD=true;
            isFromCNY=false;
            isFromKRW=false;
            isFromJPY=false;
        }
        if(fromEUR.isChecked()){
            isFromVND=false;
            isFromEUR=true;
            isFromUSD=false;
            isFromCNY=false;
            isFromKRW=false;
            isFromJPY=false;
        }
        if(fromKRW.isChecked()){
            isFromVND=false;
            isFromEUR=false;
            isFromUSD=false;
            isFromCNY=false;
            isFromKRW=true;
            isFromJPY=false;
        }
        if(fromCNY.isChecked()){
            isFromVND=false;
            isFromEUR=false;
            isFromUSD=false;
            isFromCNY=true;
            isFromKRW=false;
            isFromJPY=false;
        }
        if(fromJPY.isChecked()){
            isFromVND=false;
            isFromEUR=false;
            isFromUSD=false;
            isFromCNY=false;
            isFromKRW=false;
            isFromJPY=true;
        }
        if(toCNY.isChecked()){
            isToCNY=true;
            isToJPY=false;
            isToEUR=false;
            isToUSD=false;
            isToVND=false;
            isToKRW=false;
        }
        if(toJPY.isChecked()){
            isToCNY=false;
            isToJPY=true;
            isToEUR=false;
            isToUSD=false;
            isToVND=false;
            isToKRW=false;
        }
        if(toEUR.isChecked()){
            isToCNY=false;
            isToJPY=false;
            isToEUR=true;
            isToUSD=false;
            isToVND=false;
            isToKRW=false;
        }
        if(toUSD.isChecked()){
            isToCNY=false;
            isToJPY=false;
            isToEUR=false;
            isToUSD=true;
            isToVND=false;
            isToKRW=false;
        }
        if(toVND.isChecked()){
            isToCNY=false;
            isToJPY=false;
            isToEUR=false;
            isToUSD=false;
            isToVND=true;
            isToKRW=false;
        }
        if(toKRW.isChecked()){
            isToCNY=false;
            isToJPY=false;
            isToEUR=false;
            isToUSD=false;
            isToVND=false;
            isToKRW=true;
        }

    }
}