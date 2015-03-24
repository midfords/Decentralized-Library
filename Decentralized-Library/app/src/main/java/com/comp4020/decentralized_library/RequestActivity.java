package com.comp4020.decentralized_library;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.comp4020.utils.Data;


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
        int resID = getResources().getIdentifier(bookCover, "drawable", getPackageName());
        coverImage.setImageResource(resID);
    }

    //TODO make this store requests properly so they can be accessed from borrowing section
    public void requestOK(View view) {
        View parent = (View) view.getParent().getParent();
        TextView title = (TextView) parent.findViewById(R.id.requestTitleLabel);
        EditText tLocation = (EditText) parent.findViewById(R.id.locationEditText);
        EditText tDate = (EditText) parent.findViewById(R.id.dateEditText);
        EditText tMessage = (EditText) parent.findViewById(R.id.messageEditText);

        Data.addRequested(title.getText().toString(), tLocation.getText().toString(),
                tDate.getText().toString(), tMessage.getText().toString());

        Log.i("xpmt", "RequestOK clicked: "+title.getText().toString()+
                "; Location: "+tLocation.getText().toString()+
                ", Date: "+tDate.getText().toString()+
                ", Message: "+tMessage.getText().toString());
        finish();
    }

    public void requestCancel(View view) {
        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.i("xpmt", "Back Pressed");
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
