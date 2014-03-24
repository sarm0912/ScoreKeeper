package com.shanel.scorekeeper;




import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;

public class DiceActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dice_activity);
    }
    
    // this method will generate a random number between 1-4 to simulate a 4 sided dice roll
    public void Four_onClick(View view){
    	
    	int x;
    	x= 1 + (int)(Math.random() * ((4 - 1) + 1));
      	
    	String value=Integer.toString(x);
    	
    	TextView numberResult= (TextView)findViewById(R.id.dice_1);
 
    	numberResult.setText(value);
    	
    }
 // this method will generate a random number between 1-6 to simulate a 6 sided dice roll  
 public void Six_onClick(View view){
    	
    	int x;
    	x= 1 + (int)(Math.random() * ((6 - 1) + 1));
      	
    	String value=Integer.toString(x);
    	
    	TextView numberResult= (TextView)findViewById(R.id.dice_2);
 
    	numberResult.setText(value);
    	
    }
//this method will generate a random number between 1-8 to simulate a 8 sided dice roll
 public void Eight_onClick(View view){
 	
 	int x;
 	x= 1 + (int)(Math.random() * ((8 - 1) + 1));
   	
 	String value=Integer.toString(x);
 	
 	TextView numberResult= (TextView)findViewById(R.id.dice_3);

 	numberResult.setText(value);
 	
 }
//this method will generate a random number between 1-10 to simulate a 10 sided dice roll
 public void Ten_onClick(View view){
	 	
	 	int x;
	 	x= 1 + (int)(Math.random() * ((10 - 1) + 1));
	   	
	 	String value=Integer.toString(x);
	 	
	 	TextView numberResult= (TextView)findViewById(R.id.dice_4);

	 	numberResult.setText(value);
	 	
	 }
//this method will generate a random number between 1-12 to simulate a 12 sided dice roll
 public void Twelve_onClick(View view){
	 	
	 	int x;
	 	x= 1 + (int)(Math.random() * ((12 - 1) + 1));
	   	
	 	String value=Integer.toString(x);
	 	
	 	TextView numberResult= (TextView)findViewById(R.id.dice_5);

	 	numberResult.setText(value);
	 	
	 }
//this method will generate a random number between 1-20 to simulate a 20 sided dice roll
 public void Twenty_onClick(View view){
	 	
	 	int x;
	 	x= 1 + (int)(Math.random() * ((20 - 1) + 1));
	   	
	 	String value=Integer.toString(x);
	 	
	 	TextView numberResult= (TextView)findViewById(R.id.dice_6);

	 	numberResult.setText(value);
	 	
	 }
 // this method will roll all of the dice options 
 public void All_onClick(View view){
	
	 // D4 ROLL
	 int D4;
	 	D4= 1 + (int)(Math.random() * ((4 - 1) + 1));
	   	
	 	String D4value=Integer.toString(D4);
	 	
	 	TextView D4Result= (TextView)findViewById(R.id.dice_1);

	 	D4Result.setText(D4value);
	 	
	 	
	 //D6 ROLL
	 	int D6;
	 	D6= 1 + (int)(Math.random() * ((6 - 1) + 1));
	   	
	 	String D6value=Integer.toString(D6);
	 	
	 	TextView D6Result= (TextView)findViewById(R.id.dice_2);

	 	D6Result.setText(D6value);
	 	
	 //D8 ROLL
		int D8;
	 	D8= 1 + (int)(Math.random() * ((8 - 1) + 1));
	   	
	 	String D8value=Integer.toString(D8);
	 	
	 	TextView D8Result= (TextView)findViewById(R.id.dice_3);

	 	D8Result.setText(D8value);
	 	
	 //D10 ROLL
	 	int D10;
	 	D10= 1 + (int)(Math.random() * ((10 - 1) + 1));
	   	
	 	String D10value=Integer.toString(D10);
	 	
	 	TextView D10Result= (TextView)findViewById(R.id.dice_4);

	 	D10Result.setText(D10value);
	 	
	 //D12 ROLL
		int D12;
	 	D12= 1 + (int)(Math.random() * ((12 - 1) + 1));
	   	
	 	String D12value=Integer.toString(D12);
	 	
	 	TextView D12Result= (TextView)findViewById(R.id.dice_5);

	 	D12Result.setText(D12value);
	 	
	 //D20 ROLL
		int D20;
	 	D20= 1 + (int)(Math.random() * ((20 - 1) + 1));
	   	
	 	String D20value=Integer.toString(D20);
	 	
	 	TextView D20Result= (TextView)findViewById(R.id.dice_6);

	 	D20Result.setText(D20value);

	 }
 
}