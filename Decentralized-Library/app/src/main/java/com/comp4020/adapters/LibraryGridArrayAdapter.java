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

public class LibraryGridArrayAdapter extends ArrayAdapter<String> {

    private final Context context;
    private final String[] covers;
    private final int row_layout_cover_id;

    public LibraryGridArrayAdapter(Context context, int id, String[] covers) {
        super(context, id, covers);
        this.row_layout_cover_id = id;
        this.context = context;
        this.covers = covers;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(row_layout_cover_id, parent, false);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.coverLayout_BookCover);

        int resID = context.getResources().getIdentifier(covers[position],
                "drawable", context.getPackageName());
        imageView.setImageResource(resID);

        return rowView;
    }
}