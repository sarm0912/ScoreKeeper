/* this is an alternate class for the dice rolling feature of the app. 
 * this class will allow the user to enter the number of dice sides before rolling */
package com.shanel.scorekeeper;




import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

public class Dice2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dice2_activity);
    }
    /*this method will take the user inputed number and generate a random between 1 and it 
     * to simulate a dice roll */
    public void Roll2_onClick(View view){
    	
    	EditText sides= (EditText)findViewById(R.id.Die_countText);
    	
    	String die= sides.getText().toString();
    	
    	int x= Integer.parseInt(die);
    	
    	int Roll = 1 + (int)(Math.random() * ((x - 1) + 1));
      	
    	String Rollvalue=Integer.toString(Roll);
    	
    	TextView numberResult= (TextView)findViewById(R.id.rollValue_text);
 
    	numberResult.setText(Rollvalue);
    	
    }
    
 
 
}