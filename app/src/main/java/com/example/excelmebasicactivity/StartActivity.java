
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		excelme_design
	 *	@date 		1622296263840
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package com.example.excelmebasicactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class StartActivity extends Activity {

	
	private View _bg__main0;
	private ImageView background_1;
	private View rectangle_29;
	private View rectangle_30;
	private ImageView logotextg_2;
	private TextView start;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start);

		
		_bg__main0 = (View) findViewById(R.id._bg__main0);
		background_1 = (ImageView) findViewById(R.id.background_1);
		rectangle_29 = (View) findViewById(R.id.rectangle_29);
		rectangle_30 = (View) findViewById(R.id.rectangle_30);
		logotextg_2 = (ImageView) findViewById(R.id.logotextg_2);
		start = (TextView) findViewById(R.id.start);
	
		
		//custom code goes here
	
	}

	public void Start(View view) {
		Intent intent = new Intent(this, SignUp.class);
		startActivity(intent);
	}
}
	
	