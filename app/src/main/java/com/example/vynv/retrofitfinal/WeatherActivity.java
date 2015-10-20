package com.example.vynv.retrofitfinal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.vynv.retrofitfinal.Model.Weather.ModelWeather;
import com.example.vynv.retrofitfinal.api.Weather.weather;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class WeatherActivity extends AppCompatActivity {

    String url="http://api.openweathermap.org/data/2.5";
    TextView tvCountry;
    TextView tvLongLat;
    TextView tvMain;
    EditText edtAddress;
    Button btnSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        tvCountry=(TextView)findViewById(R.id.tvCountry);
        tvLongLat=(TextView)findViewById(R.id.tvLongLat);
        tvMain=(TextView)findViewById(R.id.tvMain);
        edtAddress =(EditText)findViewById(R.id.edtAddress);
        btnSearch=(Button)findViewById(R.id.btnSearch);
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSearchClick();
            }
        });
    }
    private void setSearchClick(){
        RestAdapter restAdapter= new RestAdapter.Builder().setLogLevel(RestAdapter.LogLevel.FULL).setEndpoint(url).build();
        weather api=restAdapter.create(weather.class);
        api.getAddress(edtAddress.getText().toString(),"bd82977b86bf27fb59a04b61b657fb6f", new Callback<ModelWeather>() {
            @Override
            public void success(ModelWeather modelWeathers, Response response) {
                Log.d("xxx","ok");
                tvCountry.setText(modelWeathers.getName());
                tvMain.setText(modelWeathers.getMain().getTemp()+"");
                tvLongLat.setText(""+modelWeathers.getCoord().getLat()+"-"+modelWeathers.getCoord().getLon());
            }

            @Override
            public void failure(RetrofitError error) {
                Log.d("xxx","error"+error.getMessage());
            }
        });
    }
}
