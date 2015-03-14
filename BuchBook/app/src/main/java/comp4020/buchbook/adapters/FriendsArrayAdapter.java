package comp4020.buchbook.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import comp4020.buchbook.R;
import comp4020.buchbook.utils.Data;

public class FriendsArrayAdapter extends ArrayAdapter<String> {

    private final Context context;
    private final String[] names;
    private final int[] numBooks;
    private final int row_layout_friend_id;

    public FriendsArrayAdapter(Context context, int id) {
        super(context, id, Data.getOwners());

        this.row_layout_friend_id = id;
        this.context = context;
        this.names = Data.getOwners();
        this.numBooks = Data.getNumBooks();
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