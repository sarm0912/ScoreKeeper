package com.shanel.scorekeeper;

import java.util.HashMap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EditPlayer extends Activity{
	
	EditText playerName;
	EditText playerScore;
	
	DBTools dbTools = new DBTools(this);
	
	public void onCreate(Bundle savedInstanceState){
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.edit_player);
		
		playerName= (EditText)findViewById(R.id.playerNameEdit2);
		playerScore=(EditText)findViewById(R.id.playerScoreEdit2);
		
		Intent theIntent = getIntent();
		
		String playerId= theIntent.getStringExtra("playerId");
		
		HashMap<String, String> playerList= dbTools.getPlayerInfo(playerId);
		
		if (playerList.size()!=0){
			
			playerName.setText(playerList.get("playerName"));
			playerScore.setText(playerList.get("playerScore"));
			
		}
				
	}

	public void edit_player (View view){
		
		HashMap<String, String> queryValuesMap= new HashMap <String,String>();
		
		
	}
	
	public void remove_player(View view){
		
		
	}

}
