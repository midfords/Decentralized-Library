package com.comp4020.decentralized_library;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


public class DetailsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        // Setup details info

        Bundle b = getIntent().getExtras();
        String bookTitle = b.getString("bookTitle");
        String bookAuthor = b.getString("bookAuthor");
        String bookCover = b.getString("bookCover");
        String bookOwner = b.getString("bookOwner");
        String bookDetails = b.getString("bookDetails");

        TextView titleLabel = (TextView) findViewById(R.id.detailTitleLabel);
        TextView authorLabel = (TextView) findViewById(R.id.detailAuthorLabel);
        TextView ownerLabel = (TextView) findViewById(R.id.detailOwnerLabel);
        TextView detailsLabel = (TextView) findViewById(R.id.detailDetailsLabel);
        ImageView coverImage = (ImageView) findViewById(R.id.detailImageView);

        titleLabel.setText(bookTitle);
        authorLabel.setText(bookAuthor);
        ownerLabel.setText(bookOwner);
        detailsLabel.setText(bookDetails);

        int resID = getResources().getIdentifier(bookCover,
                "drawable", getPackageName());
        coverImage.setImageResource(resID);

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
