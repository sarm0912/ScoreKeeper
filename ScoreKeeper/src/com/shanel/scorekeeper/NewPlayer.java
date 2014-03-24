package com.shanel.scorekeeper;

import java.util.HashMap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NewPlayer extends Activity{

	EditText playerName;
	EditText playerScore;
	
	DBTools dbTools= new DBTools(this);
	
	public void onCreate(Bundle savedInstanceState){
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_new_player);
		
		playerName=  (EditText) findViewById(R.id.playerNameEdit1);
		playerScore= (EditText)findViewById(R.id.playerScoreEdit1);
	}
	
	/*this method will call upon the DBTools class and save a players name and score 
	 * values via a HashMap using SQLite*/
	public void addNew_player(View view){
		
		HashMap<String, String> queryValuesMap= new HashMap<String, String>();
		
		queryValuesMap.put("playerName", playerName.getText().toString());
		queryValuesMap.put("playerScore", playerScore.getText().toString());
		
		
		dbTools.insertPlayer(queryValuesMap);
		
		this.callScoreActivity(view);
	}
//will send the player back to the score activity class after saving player info
	public void callScoreActivity(View view) {
		
		Intent theIntent= new Intent(getApplication(), ScoreActivity.class);
		
		startActivity(theIntent);
		
	}
}
