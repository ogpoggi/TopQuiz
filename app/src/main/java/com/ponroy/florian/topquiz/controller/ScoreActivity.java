package com.ponroy.florian.topquiz.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.ponroy.florian.topquiz.R;
import com.ponroy.florian.topquiz.model.User;

import java.io.IOException;
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
        sharedPreferences = getSharedPreferences("myPrefs", Context.MODE_PRIVATE);
        lv_user = (ListView) findViewById(R.id.lv_user);
        /*ArrayList<User> users = ;

        //load preferences and add it to the userList

        UserAdapter adapter = new UserAdapter(ScoreActivity.this, users);
        lv_user.setAdapter(adapter);*/

    }
}