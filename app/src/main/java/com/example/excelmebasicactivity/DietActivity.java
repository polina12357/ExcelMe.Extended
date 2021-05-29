
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		excelme_design
	 *	@date 		1622297308143
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

public class DietActivity extends Activity {

	
	private View _bg__food;
	private ImageView background_1;
	private View rectangle_29;
	private View rectangle_30;
	private ImageView logotextg_1;
	private ImageView arrow_1;
	private TextView lunch;
	private ImageView lunch_1;
	private ImageView leg_1;
	private View rectangle_40;
	private ImageView foodg_3;
	private TextView breakfast;
	private ImageView egg_1;
	private TextView dinner;
	private ImageView salmon_1;
	private TextView snacks;
	private ImageView snacks_1;
	private ImageView sleepg_2;
	private ImageView habitg_3;
	private ImageView sportg_3;
	private TextView diet;
	private TextView daily_calories_1600;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_diet);

		
		_bg__food = (View) findViewById(R.id._bg__food);
		background_1 = (ImageView) findViewById(R.id.background_1);
		rectangle_29 = (View) findViewById(R.id.rectangle_29);
		rectangle_30 = (View) findViewById(R.id.rectangle_30);
		logotextg_1 = (ImageView) findViewById(R.id.logotextg_1);
		arrow_1 = (ImageView) findViewById(R.id.arrow_1);
		lunch = (TextView) findViewById(R.id.lunch);
		lunch_1 = (ImageView) findViewById(R.id.lunch_1);
		leg_1 = (ImageView) findViewById(R.id.leg_1);
		rectangle_40 = (View) findViewById(R.id.rectangle_40);
		foodg_3 = (ImageView) findViewById(R.id.foodg_3);
		breakfast = (TextView) findViewById(R.id.breakfast);
		egg_1 = (ImageView) findViewById(R.id.egg_1);
		dinner = (TextView) findViewById(R.id.dinner);
		salmon_1 = (ImageView) findViewById(R.id.salmon_1);
		snacks = (TextView) findViewById(R.id.snacks);
		snacks_1 = (ImageView) findViewById(R.id.snacks_1);
		sleepg_2 = (ImageView) findViewById(R.id.sleepg_2);
		habitg_3 = (ImageView) findViewById(R.id.habitg_3);
		sportg_3 = (ImageView) findViewById(R.id.sportg_3);
		diet = (TextView) findViewById(R.id.diet);
		daily_calories_1600 = (TextView) findViewById(R.id.daily_calories_1600);
	
		
		//custom code goes here
	
	}

	public void Back(View view) {
	}

	public void Lunch(View view) {
	}

	public void Sleep(View view) {
	}

	public void Habit(View view) {
	}

	public void Sport(View view) {
		Intent intent = new Intent(this, SportActivity.class);
	}

	public void Breakfast(View view) {
	}

	public void Dinner(View view) {
	}

	public void Snacks(View view) {
	}
}
	
	