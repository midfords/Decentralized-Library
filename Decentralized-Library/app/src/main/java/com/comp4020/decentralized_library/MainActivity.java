package com.comp4020.decentralized_library;

//TODO create activities for dummy help and about us pages. link through nav drawer

import android.app.Activity;

import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
<<<<<<< HEAD
import android.view.*;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.comp4020.adapters.LibraryListArrayAdapter;
=======
import android.util.Log;
import android.view.*;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.TextView;

import com.comp4020.adapters.LibraryListArrayAdapter;
import com.comp4020.fragments.AboutUsFragment;
>>>>>>> origin/Development
import com.comp4020.fragments.ExchangesFragment;
import com.comp4020.fragments.FriendsFragment;
import com.comp4020.fragments.HelpFragment;
import com.comp4020.fragments.LibraryGridFragment;
import com.comp4020.fragments.LibraryListFragment;
import com.comp4020.fragments.NavigationDrawerFragment;
import com.comp4020.fragments.SettingsFragment;
import com.comp4020.utils.BookStatus;
import com.comp4020.utils.Data;
import com.comp4020.utils.Globals;
import com.comp4020.utils.Logger;

public  class       MainActivity
        extends     Activity
        implements  NavigationDrawerFragment.NavigationDrawerCallbacks,
        LibraryListFragment.LibraryListFragmentCallbacks,
        LibraryGridFragment.LibraryGridFragmentCallbacks,
        FriendsFragment.FriendsFragmentCallbacks,
        ExchangesFragment.BorrowingFragmentCallbacks,
<<<<<<< HEAD
        SettingsFragment.SettingsFragmentCallbacks {
=======
        SettingsFragment.SettingsFragmentCallbacks,
        HelpFragment.OnFragmentInteractionListener,
        AboutUsFragment.OnFragmentInteractionListener {
>>>>>>> origin/Development

    private NavigationDrawerFragment mNavigationDrawerFragment;
    private Fragment mViewFragment = null;

    /**
     * Used to store the last screen title. For use in {@link #restoreActionBar()}.
     */
    private CharSequence mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getFragmentManager().findFragmentById(R.id.navigation_drawer);
        mTitle = getTitle();

        // Set up the drawer.
        mNavigationDrawerFragment.setUp(
                R.id.navigation_drawer,
                (DrawerLayout) findViewById(R.id.drawer_layout));
    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {
        // update the main content by replacing fragments
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        if (mViewFragment != null)
            fragmentTransaction.remove(mViewFragment);

        switch(position) {
            case 0: // My Library
                Bundle usersLibrary = Data.getUsersLibraryBundle();
                String[] userLibraryTitles = usersLibrary.getStringArray("titles");
                String[] userLibraryAuthors = usersLibrary.getStringArray("authors");
                String[] userLibraryCovers = usersLibrary.getStringArray("covers");
<<<<<<< HEAD
                String[] userLibraryStatuss = usersLibrary.getStringArray("statuss");

                if (!Globals.gridViewType) {
                    LibraryListFragment libraryListFragment = LibraryListFragment.newInstance(
                            userLibraryTitles, userLibraryAuthors, userLibraryCovers, userLibraryStatuss);
=======

                if (!Globals.gridViewType) {
                    LibraryListFragment libraryListFragment = LibraryListFragment.newInstance(
                            userLibraryTitles, userLibraryAuthors, userLibraryCovers);
>>>>>>> origin/Development
                    mViewFragment = libraryListFragment;
                    fragmentTransaction.replace(R.id.container, libraryListFragment);
                    fragmentTransaction.commit();
                } else {
                    LibraryGridFragment libraryGridFragment = LibraryGridFragment.newInstance(
                            userLibraryTitles, userLibraryAuthors, userLibraryCovers);
                    mViewFragment = libraryGridFragment;
                    fragmentTransaction.replace(R.id.container, libraryGridFragment);
                    fragmentTransaction.commit();
                }

                Log.i("xpmt", "Nav Drawer to My Library");

                break;
            case 1: // Friends

                FriendsFragment friendsFragment = FriendsFragment.newInstance(Data.getFriends());
                mViewFragment = friendsFragment;
                fragmentTransaction.replace(R.id.container, friendsFragment);
                fragmentTransaction.commit();
                Log.i("xpmt", "Nav Drawer to Friends List");

                break;
            case 2: // Borrowing

                ExchangesFragment borrowingFragment = ExchangesFragment.newInstance();
                mViewFragment = borrowingFragment;
                fragmentTransaction.replace(R.id.container, borrowingFragment);
                fragmentTransaction.commit();

                Log.i("xpmt", "Nav Drawer to Borrowing");;

                break;
            case 3: // Settings

                SettingsFragment settingsFragment = SettingsFragment.newInstance();
                mViewFragment = settingsFragment;
                fragmentTransaction.replace(R.id.container, settingsFragment);
                fragmentTransaction.commit();

                Log.i("xpmt", "Nav Drawer to Settings");

                break;
            case 4: // Help
                HelpFragment hf = HelpFragment.newInstance();
                mViewFragment = hf;
                fragmentTransaction.replace(R.id.container, hf);
                fragmentTransaction.commit();

                Log.i("xpmt", "Nav Drawer to Help");

                break;
            case 5: // About Us

                AboutUsFragment auf = AboutUsFragment.newInstance();
                mViewFragment = auf;
                fragmentTransaction.replace(R.id.container, auf);
                fragmentTransaction.commit();

                Log.i("xpmt", "Nav Drawer to About Us");

                break;
        }
    }

    public void onSectionAttached(int number) {

        switch (number) {
            case 1:
                mTitle = getString(R.string.title_section1);
                break;
            case 2:
                mTitle = getString(R.string.title_section2);
                break;
            case 3:
                mTitle = getString(R.string.title_section3);
                break;
            case 4:
                mTitle = getString(R.string.title_section4);
                break;
            case 5:
                mTitle = getString(R.string.title_section5);
                break;
            case 6:
                mTitle = getString(R.string.title_section6);
                break;
        }
    }

    public void restoreActionBar() {
        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(mTitle);
    }

    public void requestsJumpClicked(View view) {
        exchangeSectionJump("Requests");
    }

    public void requestedJumpClicked(View view) {
        exchangeSectionJump("Requested");
    }

    public void borrowedJumpClicked(View view) {
        exchangeSectionJump("Borrowed");
    }

    public void lentJumpClicked(View view) {
        exchangeSectionJump("Lent");
    }

    public void exchangeSectionJump(String section) {
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        ExchangesFragment borrowingFragment = ExchangesFragment.newInstance(section);
        mViewFragment = borrowingFragment;
        fragmentTransaction.replace(R.id.container, borrowingFragment);
        fragmentTransaction.commit();

<<<<<<< HEAD
        Logger.log("Exchanges Section Jump to "+section);
    }

    public void requestClicked(View view) {
        Intent i = new Intent(MainActivity.this, RequestActivity.class);
        View parent = (View) view.getParent();
        TextView tv = (TextView) parent.findViewById(R.id.bookLayout_BookTitle);
        Bundle b = Data.getBookBundle(tv.getText().toString());
        i.putExtras(b);
        MainActivity.this.startActivity(i);
=======
        Log.i("xpmt", "Exchanges Section Jump to: " + section);
    }

    public void requestClicked(View view) {
        View parent = (View) view.getParent();
        final Button requestButton = (Button) parent.findViewById(R.id.requestButton);
        TextView title = (TextView) parent.findViewById(R.id.bookLayout_BookTitle);
        final String bookTitle = title.getText().toString();
        BookStatus status = Data.getStatus(bookTitle);

        switch (status)
        {
            case MyLibrary:
                Data.addLent(Data.getBookID(bookTitle));
                status = Data.getStatus(bookTitle);
                Log.i("xpmt", "My Library lend book button clicked: "+bookTitle);
                Data.setButtonText(status, requestButton);
                break;
            case OnShelf:
                Intent i = new Intent(MainActivity.this, RequestActivity.class);
                Bundle b = Data.getBookBundle(bookTitle);
                i.putExtras(b);
                Log.i("xpmt", "My Library Book Button Clicked: "+bookTitle);
                MainActivity.this.startActivity(i);
                break;
            case InRequests:
                PopupMenu acceptOrReject = new PopupMenu(MainActivity.this, view);
                acceptOrReject.inflate(R.menu.menu_accept_or_reject);
                acceptOrReject.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        String clicked = item.getTitle().toString();

                        if(clicked.equals(getString(R.string.acceptRequest))) {
                            Data.acceptRequest(Data.getBookID(bookTitle));
                            Log.i("xpmt", "Request accepted");
                        }
                        else if(clicked.equals(getString(R.string.rejectRequest))) {
                            Data.rejectRequest(Data.getBookID(bookTitle));
                            Log.i("xpmt", "Request rejected");
                        }

                        Data.setButtonText(Data.getStatus(bookTitle), requestButton);
                        return false;
                    }
                });
                acceptOrReject.show();

                status = Data.getStatus(bookTitle);
                Data.setButtonText(status, requestButton);
                Log.i("xpmt", "My Library accept or reject request book button clicked: "+bookTitle);
                break;
            case Requested:
                Data.cancelRequested(Data.getBookID(bookTitle));
                status = Data.getStatus(bookTitle);
                Log.i("xpmt", "My Library cancel requested book button clicked: "+bookTitle);
                Data.setButtonText(status, requestButton);
                break;
            case Borrowed:
                break;
            case Lent:
                Data.unLend(Data.getBookID(bookTitle));
                status = Data.getStatus(bookTitle);
                Log.i("xpmt", "My Library unlend book button clicked: "+bookTitle);
                Data.setButtonText(status, requestButton);
                break;
        }
>>>>>>> origin/Development
    }

    public void listItemClicked(View view) {
        Intent i = new Intent(view.getContext(), DetailsActivity.class);
        String title = ((TextView)(view.findViewById(R.id.bookLayout_BookTitle))).getText().toString();
        Bundle b = Data.getBookBundle(title);
        i.putExtras(b);
<<<<<<< HEAD

        startActivity(i);
    }

=======
        Log.i("xpmt", "My Library ListItem Clicked: " + title);
        startActivity(i);
    }

    public void lengthSwitched(View view)
    {
        Globals.longLists = !Globals.longLists;
        Log.i("xpmt", "List Length Switched to: " + Globals.longLists);
    }

    public void viewSwitched(View view)
    {
        Globals.gridViewType = !Globals.gridViewType;
        Log.i("xpmt", "View Type Switched to: " + Globals.gridViewType);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.i("xpmt", "Back Pressed");
    }

>>>>>>> origin/Development
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!mNavigationDrawerFragment.isDrawerOpen()) {
            // Only show items in the action bar relevant to this screen
            // if the drawer is not showing. Otherwise, let the drawer
            // decide what to show in the action bar.
            getMenuInflater().inflate(R.menu.main, menu);
            restoreActionBar();
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBorrowingFragmentInteraction(Uri uri) {

        // Do something
        Log.i("xpmt", "List Entry - Borrowing. <" + uri.toString() + ">");
    }

    @Override
    public void onFriendsFragmentInteraction(Uri uri) {

        // Do something

        Log.i("xpmt", "List Entry - Friends. <" + uri.toString() + ">");
    }

    @Override
    public void onLibraryListFragmentInteraction(Uri uri) {

        // Do something

        Log.i("xpmt", "List Entry - My Library. <" + uri.toString() + ">");
    }

    @Override
    public void onSettingsFragmentInteraction(Uri uri) {

        // Do something

        Log.i("xpmt", "List Entry - Settings. <" + uri.toString() + ">");
    }

    @Override
    public void onLibraryGridFragmentInteraction(Uri uri) {
        Log.i("xpmt", "onLibraryGridFragmentInteraction (What is this?)");
    }

    @Override
    public void onFragmentInteraction(Uri uri) {
        Log.i("xpmt", "About us or Help");
    }
}
