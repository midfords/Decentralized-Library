package com.comp4020.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.comp4020.data_classes.*;

import com.comp4020.decentralized_library.R;

public class MyLibraryArrayAdapter extends ArrayAdapter<String> {

    private final Context context;
    private final String[] titles;
    private final String[] authors;
    private final String[] covers;
    private final int row_layout_book_id;

    public MyLibraryArrayAdapter(Context context, int id, String[] titles, Library library) {
        super(context, id, titles);
        this.row_layout_book_id = id;
        this.context = context;
        this.titles = titles;
        this.authors = library.authors;
        this.covers = library.covers;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(row_layout_book_id, parent, false);

        TextView textViewTitle = (TextView) rowView.findViewById(R.id.bookLayout_BookTitle);
        TextView textViewAuthor = (TextView) rowView.findViewById(R.id.bookLayout_BookAuthor);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.bookLayout_BookCover);

        textViewTitle.setText(titles[position]);
        textViewAuthor.setText(authors[position]);

        int resID = context.getResources().getIdentifier(covers[position],
                "drawable", context.getPackageName());
        imageView.setImageResource(resID);

        return rowView;
    }
}