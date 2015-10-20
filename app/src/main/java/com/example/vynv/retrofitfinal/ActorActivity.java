package com.example.vynv.retrofitfinal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.vynv.retrofitfinal.Model.Actor.ModelActors;
import com.example.vynv.retrofitfinal.adapter.ActorAdapter;
import com.example.vynv.retrofitfinal.api.Actor.ApiActor;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class ActorActivity extends AppCompatActivity {
    String urls = "http://microblogging.wingnity.com/JSONParsingTutorial";
    Button btnActor;
    ActorAdapter actorAdapter;
    ListView lvActor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actor);
        btnActor = (Button) findViewById(R.id.btnActor);
        btnActor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setClicktoActor();
            }
        });
        lvActor = (ListView) findViewById(R.id.lvActor);
    }

    private void setClicktoActor() {
        RestAdapter restAdapter = new RestAdapter.Builder().setLogLevel(RestAdapter.LogLevel.FULL).setEndpoint(urls).build();
        ApiActor api = restAdapter.create(ApiActor.class);
        api.getActor(new Callback<ModelActors>() {
            @Override
            public void success(ModelActors modelActorses, Response response) {
                Log.d("xxx", "ok: " + modelActorses.getActors().size());
                actorAdapter = new ActorAdapter(ActorActivity.this, modelActorses);
                lvActor.setAdapter(actorAdapter);
                actorAdapter.notifyDataSetChanged();
            }
            @Override
            public void failure(RetrofitError error) {
                Log.d("xxx", "error" + error);
            }
        });
    }
}
