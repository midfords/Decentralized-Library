package com.comp4020.decentralized_library;

import android.app.Activity;

import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import android.view.MenuItem;
import com.comp4020.fragments.BorrowingFragment;
import com.comp4020.fragments.FriendsFragment;
import com.comp4020.fragments.LibraryFragment;
import com.comp4020.fragments.NavigationDrawerFragment;
import com.comp4020.fragments.SettingsFragment;
import com.comp4020.utils.Data;
import com.comp4020.utils.Logger;

public  class       MainActivity
        extends     Activity
        implements  NavigationDrawerFragment.NavigationDrawerCallbacks,
        LibraryFragment.LibraryFragmentCallbacks,
        FriendsFragment.FriendsFragmentCallbacks,
        BorrowingFragment.BorrowingFragmentCallbacks,
        SettingsFragment.SettingsFragmentCallbacks {

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
        Data data = new Data();

        switch(position) {
            case 0: // My Library


                LibraryFragment libraryFragment = LibraryFragment.newInstance(data);
                mViewFragment = libraryFragment;
                fragmentTransaction.replace(R.id.container, libraryFragment);
                fragmentTransaction.commit();

                try {
                    Logger.log("Navigation Drawer - My Library");
                } catch (Exception e) {
                    System.out.println("Failed to write to EventLogger.");
                }

                break;
            case 1: // Friends

                FriendsFragment friendsFragment = FriendsFragment.newInstance(data);
                mViewFragment = friendsFragment;
                fragmentTransaction.replace(R.id.container, friendsFragment);
                fragmentTransaction.commit();

                try {
                    Logger.log("Navigation Drawer - Friends");
                } catch (Exception e) {
                    System.out.println("Failed to write to EventLogger.");
                }

                break;
            case 2: // Borrowing

                BorrowingFragment borrowingFragment = BorrowingFragment.newInstance();
                mViewFragment = borrowingFragment;
                fragmentTransaction.replace(R.id.container, borrowingFragment);
                fragmentTransaction.commit();

                try {
                    Logger.log("Navigation Drawer - Borrowing");
                } catch (Exception e) {
                    System.out.println("Failed to write to EventLogger.");
                }

                break;
            case 3: // Settings

                SettingsFragment settingsFragment = SettingsFragment.newInstance();
                mViewFragment = settingsFragment;
                fragmentTransaction.replace(R.id.container, settingsFragment);
                fragmentTransaction.commit();

                try {
                    Logger.log("Navigation Drawer - Settings");
                } catch (Exception e) {
                    System.out.println("Failed to write to EventLogger.");
                }

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
        }
    }

    public void restoreActionBar() {
        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(mTitle);
    }

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

        try {
            Logger.log("List Entry - Borrowing. <" + uri.toString() + ">");
        } catch (Exception e) {
            System.out.println("Failed to write to EventLogger.");
        }

    }

    @Override
    public void onFriendsFragmentInteraction(Uri uri) {

        // Do something

        try {
            Logger.log("List Entry - Friends. <" + uri.toString() + ">");
        } catch (Exception e) {
            System.out.println("Failed to write to EventLogger.");
        }

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

    @Override
    public void onSettingsFragmentInteraction(Uri uri) {

        // Do something

        try {
            Logger.log("List Entry - Settings. <" + uri.toString() + ">");
        } catch (Exception e) {
            System.out.println("Failed to write to EventLogger.");
        }

    }
}
