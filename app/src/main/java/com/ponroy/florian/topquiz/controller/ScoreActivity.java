package com.ponroy.florian.topquiz.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.ponroy.florian.topquiz.R;
import com.ponroy.florian.topquiz.model.User;

import java.util.ArrayList;

public class ScoreActivity extends AppCompatActivity {

    private ListView lv_user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        afficherListeUsers();
    }


    private ArrayList<User> genererUser(){
        ArrayList<User> users = new ArrayList<User>();
        //addUser
        return users;
    }

    private void afficherListeUsers(){
        ArrayList<User> users = genererUser();
        UserAdapter adapter = new UserAdapter(ScoreActivity.this, users);
        lv_user.setAdapter(adapter);
    }
}