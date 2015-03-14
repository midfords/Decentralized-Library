package com.comp4020.decentralized_library;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


public class RequestActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);


        Bundle b = getIntent().getExtras();
        String bookTitle = b.getString("bookTitle");
        String bookAuthor = b.getString("bookAuthor");
        String bookCover = b.getString("bookCover");

        TextView titleLabel = (TextView) findViewById(R.id.requestTitleLabel);
        TextView authorLabel = (TextView) findViewById(R.id.requestAuthorLabel);
        ImageView coverImage = (ImageView) findViewById(R.id.requestImageView);

        titleLabel.setText(bookTitle);
        authorLabel.setText(bookAuthor);
        int resID = getResources().getIdentifier(bookCover,
                "drawable", getPackageName());
        coverImage.setImageResource(resID);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_request, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
