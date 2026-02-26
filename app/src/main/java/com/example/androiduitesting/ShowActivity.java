package com.example.androiduitesting;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {
    public static String ExtraCity = "city_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        String cityName = getIntent().getStringExtra(ExtraCity);
        TextView tv = findViewById(R.id.text_city_name);
        tv.setText(cityName);

        Button btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(v -> finish());
    }
}
