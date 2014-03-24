package com.shanel.scorekeeper;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;


public class ScoreActivity extends ListActivity {
	
	
	Intent intent; 
	TextView playerId;
	
	DBTools dbTools= new DBTools(this);
	
	
	protected void onCreate(Bundle savedInstanceState){
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.score_activity);
		
		ArrayList <HashMap<String, String>> playerList= dbTools.getAllPlayers();
		
		dbTools.getAllPlayers();
		
		if (playerList.size()!=0){
			
			ListView listView = getListView();
			listView.setOnItemClickListener(new OnItemClickListener(){

				@Override
				public void onItemClick(AdapterView<?> arg0, View view,
						int arg2, long arg3) {
				
					playerId= (TextView) view.findViewById(R.id.playerId);
					
					String playerIdValue= playerId.getText().toString();
					
					Intent theIntent= new Intent(getApplication(),EditPlayer.class);
					
					theIntent.putExtra("playerId", playerIdValue);
					
					startActivity(theIntent);
					
				}
								
			});
			
			ListAdapter adapter = new SimpleAdapter( ScoreActivity.this,playerList, R.layout.player_entry, 
					new String[] { "playerId","playerName"}, new int[] {R.id.playerId, R.id.playerName});
			
			setListAdapter(adapter);
			
		}
	}
	
	public void addPlayer_btn(View view){
		
		Intent theIntent= new Intent(getApplication(), NewPlayer.class);
	}
}

 