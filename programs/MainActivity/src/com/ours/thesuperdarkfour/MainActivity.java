package com.ours.thesuperdarkfour;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {
	private static final String tag = "junfeng-debug";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.d(tag, "I'm in MainActivity's onCreate()");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

    private class ShowListener implements OnClickListener{
        public void onClick(View V){
    		Recorder r = new Recorder();
    		Power p = new Power();
    		r.record(p);
        } 
    }
    
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void showDimensions(View view) {
		Log.d(tag, "call showDimensions()");
		Intent dimIntent  = new Intent(this, DimensionsActivity.class);
		startActivity(dimIntent);
	}
}
