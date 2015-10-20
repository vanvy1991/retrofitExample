package com.example.vynv.retrofitfinal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.vynv.retrofitfinal.Model.Image.Model;
import com.example.vynv.retrofitfinal.adapter.ImageAdapter;
import com.example.vynv.retrofitfinal.api.RestInterface;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class ImageActivity extends AppCompatActivity {
    String urls = "http://api.androidhive.info/json";
    ListView lvImage;
    Button btnRequest;
    ImageAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        lvImage = (ListView) findViewById(R.id.lvImage);
        btnRequest = (Button) findViewById(R.id.btnRequest);
        btnRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setCLick();
            }
        });
    }
    private void setCLick() {
        RestAdapter restAdapter=new RestAdapter.Builder().setLogLevel(RestAdapter.LogLevel.FULL).setEndpoint(urls).build();
        RestInterface restInterface=restAdapter.create(RestInterface.class);
        restInterface.getImage(new Callback<List<Model>>() {
            @Override
            public void success(List<Model> models, Response response) {
                Log.d("xxx", "error" + models.size());
                adapter = new ImageAdapter(ImageActivity.this, models);
                lvImage.setAdapter(adapter);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void failure(RetrofitError error) {
                Log.d("xxx", "error" + error.getMessage());
            }
        });
    }
}
