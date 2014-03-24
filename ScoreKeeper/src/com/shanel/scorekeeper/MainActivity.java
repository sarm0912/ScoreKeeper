package com.shanel.scorekeeper;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//on button click this activity will send player to score keeping activity    
    public void Score_onClick(View view){
    	Intent intent = new Intent(com.shanel.scorekeeper.MainActivity.this,ScoreActivity.class);
    	startActivity(intent);
    }
 //on buton click this activity will send player to dice rolling activity
    public void Dice_onClick(View view){
    	Intent intent = new Intent(com.shanel.scorekeeper.MainActivity.this,DiceActivity.class);
    	startActivity(intent);
    }

// on button click this activity will send player to timer activity 
    public void Timer_onClick(View view){
    	Intent intent = new Intent(com.shanel.scorekeeper.MainActivity.this,TimerActivity.class);
    	startActivity(intent);
    }
    
    public void Test_onClick(View view){
    	
    
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
