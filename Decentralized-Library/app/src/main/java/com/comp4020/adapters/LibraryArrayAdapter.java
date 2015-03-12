package com.comp4020.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.comp4020.decentralized_library.R;
import com.comp4020.utils.Data;

public class LibraryArrayAdapter extends ArrayAdapter<String> {

    private final Context context;
    private final String[] titles;
    private final String[] authors;
    private final String[] covers;
    private final int row_layout_book_id;

    public LibraryArrayAdapter(Context context, int id, Data data) {
        super(context, id, data.getTitles());
        this.row_layout_book_id = id;
        this.context = context;
        this.titles = data.getTitles();
        this.authors = data.getAuthors();
        this.covers = data.getCovers();
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