package com.michi.home;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		final Button mybutton=(Button) findViewById(R.id.button);
		mybutton.setOnClickListener(new View.OnClickListener(){
			@Override
			
			public void onClick (View v){
				mybutton.setText("Das ist mein erster Test");
			}
		});
    }
}
