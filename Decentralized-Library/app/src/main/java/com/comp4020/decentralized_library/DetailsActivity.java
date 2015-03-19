package com.comp4020.decentralized_library;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.comp4020.utils.Data;


public class DetailsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //TODO record parent activity so that user can go back one step instead of to root
        setContentView(R.layout.activity_details);

        // Setup details info

        Bundle b = getIntent().getExtras();
        String bookTitle = b.getString("bookTitle");
        String bookAuthor = b.getString("bookAuthor");
        String bookCover = b.getString("bookCover");
        String bookOwner = b.getString("bookOwner");
        String bookDetails = b.getString("bookDetails"); //TODO show the book synopsis on the detail page (I think bookDetails is the synopsis)
        String bookStatus = b.getString("bookStatus");

        TextView titleLabel = (TextView) findViewById(R.id.detailTitleLabel);
        TextView authorLabel = (TextView) findViewById(R.id.detailAuthorLabel);
        TextView ownerLabel = (TextView) findViewById(R.id.detailOwnerLabel);
        TextView detailsLabel = (TextView) findViewById(R.id.detailDetailsLabel);
        ImageView coverImage = (ImageView) findViewById(R.id.detailImageView);
        Button requestbutton = (Button) findViewById(R.id.detailStatusButton);

        //TODO test these conditions to make sure they work properly
        if(bookStatus == null || bookStatus.equals("My Shelf"))
            requestbutton.setVisibility(View.INVISIBLE);
        else if(bookStatus.equals("My Lent"))
            requestbutton.setText("Set To Returned");
        else if(bookStatus.equals("Lent"))
        {
            requestbutton.setText(bookStatus);
            requestbutton.setEnabled(false);
        }
        else if(bookStatus.equals("On Shelf"))
            requestbutton.setText("Request");

        titleLabel.setText(bookTitle);
        authorLabel.setText(bookAuthor);
        ownerLabel.setText(bookOwner);
        detailsLabel.setText(bookDetails);

        int resID = getResources().getIdentifier(bookCover,
                "drawable", getPackageName());
        coverImage.setImageResource(resID);

    }

    public void requestClicked(View view) {
        Intent i = new Intent(DetailsActivity.this, RequestActivity.class);
        View parent = (View) view.getParent().getParent();
        TextView tv = (TextView) parent.findViewById(R.id.detailTitleLabel);
        Bundle b = Data.getBookBundle(tv.getText().toString());
        i.putExtras(b);
        Log.i("xpmt", "Details book button clicked: "+tv.getText().toString());
        DetailsActivity.this.startActivity(i);
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_details, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
