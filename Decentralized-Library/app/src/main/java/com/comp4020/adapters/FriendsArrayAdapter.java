package com.comp4020.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.comp4020.utils.Data;
import com.comp4020.decentralized_library.R;

public class FriendsArrayAdapter extends ArrayAdapter<String> {

    private final Context context;
    private final String[] names;
    private final int[] numBooks;
    private final int row_layout_friend_id;

    public FriendsArrayAdapter(Context context, int id, Data data) {
        super(context, id, data.getOwners());
        this.row_layout_friend_id = id;
        this.context = context;
        this.names = data.getOwners();
        this.numBooks = data.getNumBooks();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(row_layout_friend_id, parent, false);

        TextView textViewTitle = (TextView) rowView.findViewById(R.id.friendLayout_BookOwner);
        TextView textViewNumBooks = (TextView) rowView.findViewById(R.id.friendLayout_BookNumBooks);

        textViewTitle.setText(names[position]);
        textViewNumBooks.setText(numBooks[position] + " Books");

        return rowView;
    }
}