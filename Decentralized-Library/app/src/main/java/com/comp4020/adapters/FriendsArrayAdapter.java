package com.comp4020.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.comp4020.decentralized_library.R;
import com.comp4020.data_classes.Friends;

public class FriendsArrayAdapter extends ArrayAdapter<String> {

    private final Context context;
    private final String[] names;
    private final int[] numBooks;
    private final int row_layout_friend_id;

    public FriendsArrayAdapter(Context context, int id, Friends friends) {
        super(context, id, friends.names);
        this.row_layout_friend_id = id;
        this.context = context;
        this.names = friends.names;
        this.numBooks = friends.numBooks;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(row_layout_friend_id, parent, false);

        TextView textViewTitle = (TextView) rowView.findViewById(R.id.friendLayout_BookTitle);
        TextView textViewAuthor = (TextView) rowView.findViewById(R.id.friendLayout_BookOwner);

        textViewTitle.setText(names[position]);
        textViewAuthor.setText(numBooks[position] + " Books");

        return rowView;
    }
}