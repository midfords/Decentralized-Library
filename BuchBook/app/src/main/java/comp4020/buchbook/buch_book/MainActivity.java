package comp4020.buchbook.buch_book;

import android.app.Activity;

import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import android.view.MenuItem;
import comp4020.buchbook.R;
import comp4020.buchbook.fragments.BorrowingFragment;
import comp4020.buchbook.fragments.FriendsFragment;
import comp4020.buchbook.fragments.LibraryGridFragment;
import comp4020.buchbook.fragments.LibraryListFragment;
import comp4020.buchbook.fragments.NavigationDrawerFragment;
import comp4020.buchbook.fragments.SettingsFragment;
import comp4020.buchbook.utils.Data;
import comp4020.buchbook.utils.Globals;
import comp4020.buchbook.utils.Logger;

public  class       MainActivity
        extends     Activity
        implements  NavigationDrawerFragment.NavigationDrawerCallbacks,
        LibraryListFragment.LibraryListFragmentCallbacks,
        LibraryGridFragment.LibraryGridFragmentCallbacks,
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

        switch(position) {
            case 0: // My Library
                if (!Globals.gridViewType) {
                    LibraryListFragment libraryListFragment = LibraryListFragment.newInstance(
                            Data.getTitles(), Data.getAuthors(), Data.getCovers());
                    mViewFragment = libraryListFragment;
                    fragmentTransaction.replace(R.id.container, libraryListFragment);
                    fragmentTransaction.commit();
                } else {
                    LibraryGridFragment libraryGridFragment = LibraryGridFragment.newInstance(
                            Data.getTitles(), Data.getAuthors(), Data.getCovers());
                    mViewFragment = libraryGridFragment;
                    fragmentTransaction.replace(R.id.container, libraryGridFragment);
                    fragmentTransaction.commit();
                }

                Logger.log("Navigation Drawer - My Library");

                break;
            case 1: // Friends

                FriendsFragment friendsFragment = FriendsFragment.newInstance(Data.getOwners());
                mViewFragment = friendsFragment;
                fragmentTransaction.replace(R.id.container, friendsFragment);
                fragmentTransaction.commit();

                Logger.log("Navigation Drawer - Friends");

                break;
            case 2: // Borrowing

                BorrowingFragment borrowingFragment = BorrowingFragment.newInstance();
                mViewFragment = borrowingFragment;
                fragmentTransaction.replace(R.id.container, borrowingFragment);
                fragmentTransaction.commit();

                Logger.log("Navigation Drawer - Borrowing");

                break;
            case 3: // Settings

                SettingsFragment settingsFragment = SettingsFragment.newInstance();
                mViewFragment = settingsFragment;
                fragmentTransaction.replace(R.id.container, settingsFragment);
                fragmentTransaction.commit();

                Logger.log("Navigation Drawer - Settings");

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

        Logger.log("List Entry - Borrowing. <" + uri.toString() + ">");
    }

    @Override
    public void onFriendsFragmentInteraction(Uri uri) {

        // Do something

        Logger.log("List Entry - Friends. <" + uri.toString() + ">");
    }

    @Override
    public void onLibraryListFragmentInteraction(Uri uri) {

        // Do something

        Logger.log("List Entry - My Library. <" + uri.toString() + ">");
    }

    @Override
    public void onSettingsFragmentInteraction(Uri uri) {

        // Do something

        Logger.log("List Entry - Settings. <" + uri.toString() + ">");
    }

    @Override
    public void onLibraryGridFragmentInteraction(Uri uri) {

    }
}
