package com.shanel.scorekeeper;

import java.util.ArrayList;
import java.util.HashMap;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBTools extends SQLiteOpenHelper{
	
	public DBTools(Context applicaitonContext){
		
		super(applicaitonContext,"playerList.db", null,1);
		
	}

	@Override
	public void onCreate(SQLiteDatabase database) {
		// TODO Auto-generated method stub
		
		String query="CREATE TABLE players (playerId INTEGER PRIMARY KEY, playerName TEXT, playerScore INTEGER)";
		
		database.execSQL(query);
	}

	@Override
	public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
		String query="DROP TABLE IF EXISTS players";
		
		database.execSQL(query);
		onCreate(database);
		
	}

	
	public void insertPlayer(HashMap<String,String> queryValues){
		
		SQLiteDatabase database=this.getWritableDatabase();
		
		ContentValues values = new ContentValues();
		
		values.put("playerName",queryValues.get("playerName"));
		values.put("playerScore", queryValues.get("playerScore"));
		
		database.insert("players",null,values);
		database.close();
	}
	
	public int updatePlayer(HashMap<String,String> queryValues){
		
		SQLiteDatabase database=this.getWritableDatabase();
		
		ContentValues values = new ContentValues();
		
		values.put("playerName",queryValues.get("playerName"));
		values.put("playerScore", queryValues.get("playerScore"));
		
		return database.update("players", values, 
				"playerId" + "= ? ", new String[]{queryValues.get("playerId")});
	}
	
	public void deletePlayer(String id){
		
		SQLiteDatabase database=this.getWritableDatabase();
	
		String deleteQuery= "DELETE FROM players WHERE playerId='" +id+ "'";
		
		database.execSQL(deleteQuery);
		
	}
	
	public ArrayList<HashMap<String, String>> getAllPlayers(){
		
		ArrayList<HashMap<String, String>> playerArrayList=new ArrayList<HashMap<String, String>>();
		
		String selectQuery="SELECT* FROM players ORDER BY playerName";
		
		SQLiteDatabase database=this.getWritableDatabase();
		
		Cursor cursor= database.rawQuery(selectQuery, null);
		
		if (cursor.moveToFirst()){
			 
			do {
				HashMap<String,String> playerMap= new HashMap<String,String>();
				playerMap.put("playerId", cursor.getString(0));
				playerMap.put("playerName", cursor.getString(1));
				playerMap.put("playerScore", cursor.getString(2));
				
				playerArrayList.add(playerMap);
			} while (cursor.moveToNext());
			
		}
		
		return playerArrayList;
	}
	
	public HashMap<String, String> getPlayerInfo(String id) {
		
		HashMap<String, String> playerMap = new HashMap<String, String>();
				
		SQLiteDatabase database = this.getReadableDatabase();
		
		String selectQuery = "SELECT * FROM players WHERE playerId='"+id+"'";
		
		Cursor cursor = database.rawQuery(selectQuery, null);

		if (cursor.moveToFirst()) {
	        do {
	        	
	        	playerMap.put("playerId", cursor.getString(0));
				playerMap.put("playerName", cursor.getString(1));
				playerMap.put("playerScore", cursor.getString(2));
				
	        } while (cursor.moveToNext());
	    }				    
	return playerMap;
	}	
	
}
