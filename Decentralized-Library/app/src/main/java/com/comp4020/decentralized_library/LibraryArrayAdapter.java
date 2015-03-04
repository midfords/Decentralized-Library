package com.comp4020.decentralized_library;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class LibraryArrayAdapter extends ArrayAdapter<String> {

    private final Context context;
    private final String[] titles;
    private final String[] authors;
    private final String[] covers;
    private final int rowId;

    public LibraryArrayAdapter(Context context, int id, String[] titles, String[] authors,
                               String[] covers) {
        super(context, id, titles);
        this.rowId = id;
        this.context = context;
        this.titles = titles;
        this.authors = authors;
        this.covers = covers;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(rowId, parent, false);

        TextView textViewTitle = (TextView) rowView.findViewById(R.id.bookTitle);
        TextView textViewAuthor = (TextView) rowView.findViewById(R.id.bookAuthor);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.bookCover);

        textViewTitle.setText(titles[position]);
        textViewAuthor.setText(authors[position]);

        int resID = context.getResources().getIdentifier(covers[position], "drawable", context.getPackageName());
        imageView.setImageResource(resID);

        return rowView;
    }
}