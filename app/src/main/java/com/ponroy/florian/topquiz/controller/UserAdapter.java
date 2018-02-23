package com.ponroy.florian.topquiz.controller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.ponroy.florian.topquiz.R;
import com.ponroy.florian.topquiz.model.User;

import java.util.ArrayList;

/**
 * Created by INNAX on 23/02/2018.
 */

public class UserAdapter extends ArrayAdapter<User> {

    public UserAdapter(Context context, ArrayList<User> users) {
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_score_item,parent, false);
        }

        TweetViewHolder viewHolder = (TweetViewHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new TweetViewHolder();
            viewHolder.nomUser = (TextView) convertView.findViewById(R.id.tv_nomUser);
            viewHolder.scoreUser = (TextView) convertView.findViewById(R.id.tv_scoreUser);
            convertView.setTag(viewHolder);
        }

        //getItem(position) va récupérer l'item [position] de la List<Tweet> tweets
        User user = getItem(position);
        viewHolder.nomUser.setText(user.getFirstname());
        viewHolder.scoreUser.setText(user.getScore());

        return convertView;
    }

    private class TweetViewHolder{
        public TextView nomUser;
        public TextView scoreUser;
    }
}
