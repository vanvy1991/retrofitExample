package com.example.vynv.retrofitfinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.vynv.retrofitfinal.adapter.ImageAdapter;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    Button btnWeather, btnImage,btnToActor;
    ImageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnImage = (Button) findViewById(R.id.btnImage);
        btnImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setClickShowListImage();

            }
        });
        btnWeather = (Button) findViewById(R.id.btnWeather);
        btnWeather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setClick();
            }
        });

        btnToActor = (Button) findViewById(R.id.btnToActor);
        btnToActor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setClickToActor();
            }
        });
    }

    private void setClickShowListImage() {
        intent = new Intent(this, ImageActivity.class);
        startActivity(intent);
    }

    private void setClick() {
        intent = new Intent(this, WeatherActivity.class);
        startActivity(intent);
    }
    private void setClickToActor(){
        intent = new Intent(this, ActorActivity.class);
        startActivity(intent);
    }
}
