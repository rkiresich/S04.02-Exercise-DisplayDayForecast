package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    private TextView mWeatherDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // TODO (2) Display the weather forecast that was passed from MainActivity
        //COMPLETE
        mWeatherDisplay = (TextView) findViewById(R.id.weather_text);

        Intent intent= getIntent();
        if(intent != null) {
            if (intent.hasExtra(intent.EXTRA_TEXT)) {
                mWeatherDisplay.setText(intent.getStringExtra(intent.EXTRA_TEXT));
            }
        }
    }
}