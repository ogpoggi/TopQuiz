package com.ponroy.florian.topquiz.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ponroy.florian.topquiz.R;
import com.ponroy.florian.topquiz.model.User;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ScoreActivity extends AppCompatActivity{

    ArrayList<User> userList;
    SharedPreferences sharedPreferences;
    private ListView lv_user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        lv_user = (ListView) findViewById(R.id.lv_user);

        Gson gson = new Gson();
        String json = sharedPreferences.getString("userLi", "");
        Type type = new TypeToken<ArrayList<User>>(){}.getType();
        userList = gson.fromJson(json, type);
        for(User u : userList){
            Log.i("name",u.getFirstname());
            Log.i("score", String.valueOf(u.getScore()));
        }
    }
}