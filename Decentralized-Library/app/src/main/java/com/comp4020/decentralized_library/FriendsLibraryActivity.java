package com.comp4020.decentralized_library;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.comp4020.fragments.LibraryFragment;
import com.comp4020.utils.Data;
import com.comp4020.utils.Logger;


public  class       FriendsLibraryActivity
        extends     Activity
        implements  LibraryFragment.LibraryFragmentCallbacks {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends_library);

        Bundle b = getIntent().getExtras();
        int bookOwnerPosition = b.getInt("bookOwnerPosition");
        getActionBar().setTitle(Data.getOwnersName(bookOwnerPosition) + "'s Library");

        Data data = new Data();
        Bundle friendsLibrary = data.getFriendsLibraryBundle(bookOwnerPosition);
        String[] friendLibraryTitles = friendsLibrary.getStringArray("titles");
        String[] friendLibraryAuthors = friendsLibrary.getStringArray("authors");
        String[] friendLibraryCovers = friendsLibrary.getStringArray("covers");

        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        LibraryFragment libraryFragment = LibraryFragment.newInstance(friendLibraryTitles,
                friendLibraryAuthors, friendLibraryCovers);
        fragmentTransaction.replace(R.id.container, libraryFragment);
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
    public void onLibraryFragmentInteraction(Uri uri) {

        // Do something

        try {
            Logger.log("List Entry - My Library. <" + uri.toString() + ">");
        } catch (Exception e) {
            System.out.println("Failed to write to EventLogger.");
        }

    }
}
