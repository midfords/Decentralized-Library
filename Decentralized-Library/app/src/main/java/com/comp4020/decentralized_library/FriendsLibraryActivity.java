package com.comp4020.decentralized_library;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.comp4020.fragments.LibraryGridFragment;
import com.comp4020.fragments.LibraryListFragment;
import com.comp4020.utils.BookStatus;
import com.comp4020.utils.Data;
import com.comp4020.utils.Globals;
import com.comp4020.utils.Logger;


public  class       FriendsLibraryActivity
        extends     Activity
        implements LibraryListFragment.LibraryListFragmentCallbacks,
        LibraryGridFragment.LibraryGridFragmentCallbacks {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends_library);

        Bundle b = getIntent().getExtras();
        int bookOwnerPosition = b.getInt("bookOwnerPosition");
        String name = Data.getFriendsName(bookOwnerPosition);
        getActionBar().setTitle(name + "'s Library");

        Bundle friendsLibrary = Data.getFriendsLibraryBundle(bookOwnerPosition);
        String[] friendLibraryTitles = friendsLibrary.getStringArray("titles");
        String[] friendLibraryAuthors = friendsLibrary.getStringArray("authors");
        String[] friendLibraryCovers = friendsLibrary.getStringArray("covers");

        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        if (!Globals.gridViewType) {
            LibraryListFragment libraryListFragment = LibraryListFragment.newInstance(friendLibraryTitles,
                    friendLibraryAuthors, friendLibraryCovers);
            fragmentTransaction.replace(R.id.container, libraryListFragment);
            fragmentTransaction.commit();
        } else {
            LibraryGridFragment libraryGridFragment = LibraryGridFragment.newInstance(friendLibraryTitles,
                    friendLibraryAuthors, friendLibraryCovers);
            fragmentTransaction.replace(R.id.container, libraryGridFragment);
            fragmentTransaction.commit();
        }

        Log.i("xpmt", "Friends Library: "+name);
    }

    public void requestClicked(View view) {
        View parent = (View) view.getParent();
        Button requestButton = (Button) parent.findViewById(R.id.requestButton);
        TextView title = (TextView) parent.findViewById(R.id.bookLayout_BookTitle);
        String bookTitle = title.getText().toString();
        BookStatus status = Data.getStatus(bookTitle);

        switch (status)
        {
            case MyLibrary:
                Data.addLent(Data.getBookID(bookTitle));
                status = Data.getStatus(bookTitle);
                Log.i("xpmt", "Friend's Library lend book button clicked: "+bookTitle);
                Data.setButtonText(status, requestButton);
                break;
            case OnShelf:
                Intent i = new Intent(FriendsLibraryActivity.this, RequestActivity.class);
//                View parent = (View) view.getParent();
                TextView tv = (TextView) parent.findViewById(R.id.bookLayout_BookTitle);
                Bundle b = Data.getBookBundle(tv.getText().toString());
                i.putExtras(b);
                Log.i("xpmt", "Friend's Library: book button clicked: " + tv.getText().toString());
                FriendsLibraryActivity.this.startActivity(i);
                break;
            case InRequests:
                Data.acceptRequest(Data.getBookID(bookTitle));
                status = Data.getStatus(bookTitle);
                Log.i("xpmt", "Friend's Library accept request book button clicked: "+bookTitle);
                Data.setButtonText(status, requestButton);
                break;
            case Requested:
                Data.cancelRequested(Data.getBookID(bookTitle));
                status = Data.getStatus(bookTitle);
                Log.i("xpmt", "Friend's Library cancel requested book button clicked: "+bookTitle);
                Data.setButtonText(status, requestButton);
                break;
            case Borrowed:
                break;
            case Lent:
                Data.unLend(Data.getBookID(bookTitle));
                status = Data.getStatus(bookTitle);
                Log.i("xpmt", "Friend's Library unlend book button clicked: "+bookTitle);
                Data.setButtonText(status, requestButton);
                break;
        }
    }

    public void listItemClicked(View view) {
        Intent i = new Intent(view.getContext(), DetailsActivity.class);
        String title = ((TextView)(view.findViewById(R.id.bookLayout_BookTitle))).getText().toString();
        Bundle b = Data.getBookBundle(title);
        i.putExtras(b);
        Log.i("xpmt", "Friends Library: book listItem selected: "+title);
        startActivity(i);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.i("xpmt", "Back Pressed");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_friends_library, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onLibraryListFragmentInteraction(Uri uri) {

        // Do something

        Log.i("xpmt", "List Entry - My Library. <" + uri.toString() + ">");
    }

    @Override
    public void onLibraryGridFragmentInteraction(Uri uri) {

        // Do something

        Log.i("xpmt", "Grid Entry - My Library. <" + uri.toString() + ">");
    }
}
