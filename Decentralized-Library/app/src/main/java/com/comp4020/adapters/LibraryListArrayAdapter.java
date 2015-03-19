package com.comp4020.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.comp4020.decentralized_library.R;
import com.comp4020.utils.Data;

public class LibraryListArrayAdapter extends ArrayAdapter<String> {

    private final Context context;
    private final String[] titles;
    private final String[] authors;
    private final String[] covers;
    private final String[] statuss;
    private final int row_layout_book_id;

    public LibraryListArrayAdapter(Context context, int id, String[] titles,
                                   String[] authors, String[] covers, String[] statuss) {
        super(context, id, titles);
        this.row_layout_book_id = id;
        this.context = context;
        this.titles = titles;
        this.authors = authors;
        this.covers = covers;
        if(statuss != null)
            this.statuss = statuss;
        else
            this.statuss = null;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(row_layout_book_id, parent, false);

        TextView textViewTitle = (TextView) rowView.findViewById(R.id.bookLayout_BookTitle);
        TextView textViewAuthor = (TextView) rowView.findViewById(R.id.bookLayout_BookAuthor);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.bookLayout_BookCover);
        Button requestButton = (Button) rowView.findViewById(R.id.requestButton);

        textViewTitle.setText(titles[position]);
        textViewAuthor.setText(authors[position]);
        String bookStatus;
        if(this.statuss == null) {
            requestButton.setVisibility(View.INVISIBLE);
            bookStatus = null;
        }
        else
            bookStatus = this.statuss[position];

        if(bookStatus == null || bookStatus.equals("My Shelf"))
            requestButton.setVisibility(View.INVISIBLE);
        else if(bookStatus.equals("My Lent"))
            requestButton.setText("Set To Returned");
        else if(bookStatus.equals("Lent"))
        {
            requestButton.setText(bookStatus);
            requestButton.setEnabled(false);
        }
        else if(bookStatus.equals("On Shelf"))
            requestButton.setText("Request");

        int resID = context.getResources().getIdentifier(covers[position],
                "drawable", context.getPackageName());
        imageView.setImageResource(resID);

        return rowView;
    }
}