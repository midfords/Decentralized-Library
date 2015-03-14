package com.comp4020.decentralized_library;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.comp4020.fragments.LibraryListFragment;
import com.comp4020.utils.Data;
import com.comp4020.utils.Logger;


public  class       FriendsLibraryActivity
        extends     Activity
        implements LibraryListFragment.LibraryListFragmentCallbacks {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends_library);

        Bundle b = getIntent().getExtras();
        int bookOwnerPosition = b.getInt("bookOwnerPosition");
        getActionBar().setTitle(Data.getFriendsName(bookOwnerPosition) + "'s Library");

        Data data = new Data();
        Bundle friendsLibrary = data.getFriendsLibraryBundle(bookOwnerPosition);
        String[] friendLibraryTitles = friendsLibrary.getStringArray("titles");
        String[] friendLibraryAuthors = friendsLibrary.getStringArray("authors");
        String[] friendLibraryCovers = friendsLibrary.getStringArray("covers");

        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        LibraryListFragment libraryListFragment = LibraryListFragment.newInstance(friendLibraryTitles,
                friendLibraryAuthors, friendLibraryCovers);
        fragmentTransaction.replace(R.id.container, libraryListFragment);
        fragmentTransaction.commit();
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

        Logger.log("List Entry - My Library. <" + uri.toString() + ">");
    }
}
