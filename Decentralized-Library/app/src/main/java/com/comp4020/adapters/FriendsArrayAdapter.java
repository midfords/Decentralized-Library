package com.comp4020.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.comp4020.decentralized_library.R;
import com.comp4020.data_classes.*;

public class FriendsArrayAdapter extends ArrayAdapter<String> {

    private final Context context;
    private final int row_layout_friend_id;
    private Friends friends;

    public FriendsArrayAdapter(Context context, int id, Friends friends) {
        super(context, id, friends.names);
        this.row_layout_friend_id = id;
        this.context = context;
        this.friends = friends;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(row_layout_friend_id, parent, false);

        TextView textViewTitle = (TextView) rowView.findViewById(R.id.friendLayout_BookTitle);
        TextView textViewAuthor = (TextView) rowView.findViewById(R.id.friendLayout_BookOwner);

        textViewTitle.setText(friends.names[position]);
        textViewAuthor.setText(friends.numBooks[position] + " Books");

        return rowView;
    }
}