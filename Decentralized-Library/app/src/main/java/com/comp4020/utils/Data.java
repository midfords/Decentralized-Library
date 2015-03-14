package com.comp4020.utils;

/**
 * Created by jeff on 15-03-11.
 */
import android.os.Bundle;

public class Data {

    //
    // Book data
    //

    private static final String[] titles = new String[] {"Something from the Nightside",
            "The Man with the Golden Torc", "Blue Moon Rising", "Deathstalker War",
            "Agents of Light and Darkness", "Just Another Judgement Day", "The Unnatural Inquirer",
            "Deathstalker", "Drinking Midnight Wine", "Hex and the City", "Beyond the Blue Moon",
            "The Spy Who Haunted Me", "Nightingale's Lament", "Shaper Than A Serpent's Tooth",
            "Deathstalker Legacy", "Paths Not Taken", "Blood and Honour", "The God Killer",
            "Shadows Fall", "Deathstalker Rebelion", "Deathstalker Coda", "Deathstalker Return",
            "Deathstalker Destiny", "Deathstalker Honour", "Down Among the Dead Men",
            "Guards of Haven", "Ghostworld", "Helloworld", "Hello to Pay", "Swords of Haven",
            "Guard Against Dishonor", "A Walk on the Nightside", "Mean Streets",
            "The Dark Heart of the Nightside", "Haunting the Nightside", "Haven of Lost Souls",
            "Skin Game", "Storm Front", "Furies of Calderon", "Fool Moon", "First Lord's Fury",
            "Cold Days", "Academ's Fury", "Ghost Story", "Cursor's Fury", "Dead Beat",
            "Captain's Fury", "Grave Peril", "Princep's Fury", "Blood Rites", "White Night",
            "Death Masks", "Summer Knight", "Proven Guilty", "Turn Coat", "Small Favor",
            "Welcome to the Jungle", "My Big Fat Supernatural Honeymoon", "Cinder Spires 1",
            "Changes", "Mean Streets", "The Carpet People", "The Dark Side of the Sun",
            "The Colour of Magic", "The Light Fantastic", "Mort", "Equal Rites", "Wyrd Sisters",
            "Sourcery", "Guards! Guards!", "Pyramids", "Truckers", "Good Omens", "Moving Pictures",
            "Reaper Man", "Witches Abroad", "Small Gods", "Lords and Ladies", "Men at Arms",
            "Soul Music", "Maskerade", "Hogfather", "Feet of Clay", "Jingo", "Carpe Jugulum",
            "Thief of Time", "Night Watch", "Going Postal", "A Hat Full of Sky", "Wintersmith",
            "Snuff"
    };

    private static final String[] authors = new String[] {
            "Simon R. Greene","Simon R. Greene","Simon R. Greene","Simon R. Greene",
            "Simon R. Greene","Simon R. Greene","Simon R. Greene","Simon R. Greene",
            "Simon R. Greene","Simon R. Greene","Simon R. Greene","Simon R. Greene",
            "Simon R. Greene","Simon R. Greene","Simon R. Greene","Simon R. Greene",
            "Simon R. Greene","Simon R. Greene","Simon R. Greene","Simon R. Greene",
            "Simon R. Greene","Simon R. Greene","Simon R. Greene","Simon R. Greene",
            "Simon R. Greene","Simon R. Greene","Simon R. Greene","Simon R. Greene",
            "Simon R. Greene","Simon R. Greene","Simon R. Greene","Simon R. Greene",
            "Simon R. Greene","Simon R. Greene","Simon R. Greene","Simon R. Greene", //37, 24, 29 = 90 books
            "Simon R. Greene","Jim Butcher","Jim Butcher","Jim Butcher","Jim Butcher",
            "Jim Butcher","Jim Butcher","Jim Butcher","Jim Butcher","Jim Butcher","Jim Butcher",
            "Jim Butcher","Jim Butcher","Jim Butcher","Jim Butcher","Jim Butcher","Jim Butcher",
            "Jim Butcher","Jim Butcher","Jim Butcher","Jim Butcher","Jim Butcher","Jim Butcher",
            "Jim Butcher","Jim Butcher","Terry Pratchett","Terry Pratchett","Terry Pratchett",
            "Terry Pratchett","Terry Pratchett","Terry Pratchett","Terry Pratchett",
            "Terry Pratchett","Terry Pratchett","Terry Pratchett","Terry Pratchett",
            "Terry Pratchett","Terry Pratchett","Terry Pratchett","Terry Pratchett",
            "Terry Pratchett","Terry Pratchett","Terry Pratchett","Terry Pratchett",
            "Terry Pratchett","Terry Pratchett","Terry Pratchett","Terry Pratchett",
            "Terry Pratchett","Terry Pratchett","Terry Pratchett","Terry Pratchett",
            "Terry Pratchett","Terry Pratchett"
    };

    //TODO get .png files for all covers and name them according to this string array
    private static final String[] covers = new String[] {"Something from the Nightside",
            "The Man with the Golden Torc", "Blue Moon Rising", "Deathstalker War",
            "Agents of Light and Darkness", "Just Another Judgement Day", "The Unnatural Inquirer",
            "Deathstalker", "Drinking Midnight Wine", "Hex and the City", "Beyond the Blue Moon",
            "The Spy Who Haunted Me", "Nightingale's Lament", "Shaper Than A Serpent's Tooth",
            "Deathstalker Legacy", "Paths Not Taken", "Blood and Honour", "The God Killer",
            "Shadows Fall", "Deathstalker Rebelion", "Deathstalker Coda", "Deathstalker Return",
            "Deathstalker Destiny", "Deathstalker Honour", "Down Among the Dead Men",
            "Guards of Haven", "Ghostworld", "Helloworld", "Hello to Pay", "Swords of Haven",
            "Guard Against Dishonor", "A Walk on the Nightside", "Mean Streets",
            "The Dark Heart of the Nightside", "Haunting the Nightside", "Haven of Lost Souls",
            "Skin Game", "Storm Front", "Furies of Calderon", "Fool Moon", "First Lord's Fury",
            "Cold Days", "Academ's Fury", "Ghost Story", "Cursor's Fury", "Dead Beat",
            "Captain's Fury", "Grave Peril", "Princep's Fury", "Blood Rites", "White Night",
            "Death Masks", "Summer Knight", "Proven Guilty", "Turn Coat", "Small Favor",
            "Welcome to the Jungle", "My Big Fat Supernatural Honeymoon", "Cinder Spires 1",
            "Changes", "Mean Streets", "The Carpet People", "The Dark Side of the Sun",
            "The Colour of Magic", "The Light Fantastic", "Mort", "Equal Rites", "Wyrd Sisters",
            "Sourcery", "Guards! Guards!", "Pyramids", "Truckers", "Good Omens", "Moving Pictures",
            "Reaper Man", "Witches Abroad", "Small Gods", "Lords and Ladies", "Men at Arms",
            "Soul Music", "Maskerade", "Hogfather", "Feet of Clay", "Jingo", "Carpe Jugulum",
            "Thief of Time", "Night Watch", "Going Postal", "A Hat Full of Sky", "Wintersmith",
            "Snuff"
    };

    private static final String[] genres = new String[] {
            "Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy",
            "Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy",
            "Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy",
            "Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy",
            "Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy",
            "Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy",
            "Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy",
            "Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy",
            "Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy",
            "Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy",
            "Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy"
    };

    private static final String[] years = new String[] {
            "Year","Year","Year","Year","Year","Year","Year","Year","Year","Year",
            "Year","Year","Year","Year","Year","Year","Year","Year","Year","Year",
            "Year","Year","Year","Year","Year","Year","Year","Year","Year","Year",
            "Year","Year","Year","Year","Year","Year","Year","Year","Year","Year",
            "Year","Year","Year","Year","Year","Year","Year","Year","Year","Year",
            "Year","Year","Year","Year","Year","Year","Year","Year","Year","Year",
            "Year","Year","Year","Year","Year","Year","Year","Year","Year","Year",
            "Year","Year","Year","Year","Year","Year","Year","Year","Year","Year",
            "Year","Year","Year","Year","Year","Year","Year","Year","Year","Year",
            "Year","Year","Year","Year","Year","Year","Year","Year","Year","Year",
            "Year","Year","Year","Year","Year","Year","Year","Year","Year","Year",
    };

    private static final String[] publishers = new String[] {
            "Publisher","Publisher","Publisher","Publisher","Publisher","Publisher","Publisher",
            "Publisher","Publisher","Publisher","Publisher","Publisher","Publisher","Publisher",
            "Publisher","Publisher","Publisher","Publisher","Publisher","Publisher","Publisher",
            "Publisher","Publisher","Publisher","Publisher","Publisher","Publisher","Publisher",
            "Publisher","Publisher","Publisher","Publisher","Publisher","Publisher","Publisher",
            "Publisher","Publisher","Publisher","Publisher","Publisher","Publisher","Publisher",
            "Publisher","Publisher","Publisher","Publisher","Publisher","Publisher","Publisher",
            "Publisher","Publisher","Publisher","Publisher","Publisher","Publisher","Publisher",
            "Publisher","Publisher","Publisher","Publisher","Publisher","Publisher","Publisher",
            "Publisher","Publisher","Publisher","Publisher","Publisher","Publisher","Publisher",
            "Publisher","Publisher","Publisher","Publisher","Publisher","Publisher","Publisher",
            "Publisher","Publisher","Publisher","Publisher","Publisher","Publisher","Publisher",
            "Publisher","Publisher","Publisher","Publisher","Publisher","Publisher","Publisher",
            "Publisher","Publisher","Publisher","Publisher","Publisher","Publisher","Publisher",
    };

    private static final String[] synopsiss = new String[] {
            "Synopsis","Synopsis","Synopsis","Synopsis","Synopsis","Synopsis","Synopsis",
            "Synopsis","Synopsis","Synopsis","Synopsis","Synopsis","Synopsis","Synopsis",
            "Synopsis","Synopsis","Synopsis","Synopsis","Synopsis","Synopsis","Synopsis",
            "Synopsis","Synopsis","Synopsis","Synopsis","Synopsis","Synopsis","Synopsis",
            "Synopsis","Synopsis","Synopsis","Synopsis","Synopsis","Synopsis","Synopsis",
            "Synopsis","Synopsis","Synopsis","Synopsis","Synopsis","Synopsis","Synopsis",
            "Synopsis","Synopsis","Synopsis","Synopsis","Synopsis","Synopsis","Synopsis",
            "Synopsis","Synopsis","Synopsis","Synopsis","Synopsis","Synopsis","Synopsis",
            "Synopsis","Synopsis","Synopsis","Synopsis","Synopsis","Synopsis","Synopsis",
            "Synopsis","Synopsis","Synopsis","Synopsis","Synopsis","Synopsis","Synopsis",
            "Synopsis","Synopsis","Synopsis","Synopsis","Synopsis","Synopsis","Synopsis",
            "Synopsis","Synopsis","Synopsis","Synopsis","Synopsis","Synopsis","Synopsis",
            "Synopsis","Synopsis","Synopsis","Synopsis","Synopsis","Synopsis","Synopsis",
            "Synopsis","Synopsis","Synopsis","Synopsis","Synopsis","Synopsis","Synopsis",
    };

    // Statusses are not final because we will change them as lending actions happen
    //statusses are On shelf and Lent
    private static String[] statuss = new String[] {
            "On shelf","Lent","Lent","On shelf","On shelf","Lent","Lent","On shelf","Lent",
            "On shelf","Lent","Lent","On shelf","On shelf","Lent","Lent","On shelf","Lent",
            "On shelf","Lent","Lent","On shelf","On shelf","Lent","Lent","On shelf","Lent",
            "On shelf","Lent","Lent","On shelf","On shelf","Lent","Lent","On shelf","Lent",
            "On shelf","Lent","Lent","On shelf","On shelf","Lent","Lent","On shelf","Lent",
            "On shelf","Lent","Lent","On shelf","On shelf","Lent","Lent","On shelf","Lent",
            "On shelf","Lent","Lent","On shelf","On shelf","Lent","Lent","On shelf","Lent",
            "On shelf","Lent","Lent","On shelf","On shelf","Lent","Lent","On shelf","Lent",
            "On shelf","Lent","Lent","On shelf","On shelf","Lent","Lent","On shelf","Lent",
            "On shelf","Lent","Lent","On shelf","On shelf","Lent","Lent","On shelf","Lent",
    };

    //
    // Owner and friends data
    //

    //users library
    private static final int[] myLibrary = new int[] {0, 25};

    //users library status
    private static String[] myStatuss = new String[] {
            "On Shelf", "Lent", "On Shelf", "Requested", "Requested",
            "On Shelf","On Shelf","On Shelf","On Shelf","On Shelf",
            "On Shelf","Lent","On Shelf","On Shelf","On Shelf",
            "On Shelf","On Shelf","On Shelf","On Shelf","On Shelf",
            "On Shelf","On Shelf","On Shelf","Lent","On Shelf",
    };

    private static final String[] friends = new String[] {
            "Toquehead",
            "Sean",
    };

    // TODO: This can be removed since friendsLibrary contains length info
    //  leave in for now.
    private static final int[] numBooks = new int[] { 25, 50 };

    // Too much work to write separate libraries for all friends. Instead books are referenced by id
    //  (array position). the two values are the start and end of each friend's book list
    private static int[][] friendLibrary = new int[][] {
            {20, 45},
            {41, 90},
    };

    public static Bundle getRequests() {
        Bundle b = new Bundle();
        String[] rTitles;
        String[] rAuthors;
        String[] rCovers;
        int num = 0;
        int[] rIndex = new int[myLibrary.length];

        for(int i=myLibrary[0]; i<myLibrary[1]; i++) {
            if(myStatuss[i].equals("Requested")) {
                rIndex[num] = i;
                num++;
            }
        }
        rTitles = new String[num];
        rAuthors = new String[num];
        rCovers = new String[num];

        for(int i=0; i<num; i++) {
            rTitles[i] = titles[rIndex[i]];
            rAuthors[i] = authors[rIndex[i]];
            rCovers[i] = covers[rIndex[i]];
        }

        b.putStringArray("titles", rTitles);
        b.putStringArray("authors", rAuthors);
        b.putStringArray("covers", rCovers);
        return b;
    }

    public static String getFriendsName(int i) {
        return friends[i];
    }

    // Return a bundle array containing string array of book info
    public static Bundle getFriendsLibraryBundle(int friendIndex)
    {
        Bundle friendsLibraryBundle = new Bundle();
        int length = friendLibrary[friendIndex][1]-friendLibrary[friendIndex][0];
        String[] friendTitles = new String[length];
        String[] friendAuthors = new String[length];
        String[] friendCovers = new String[length];

        for(int i = friendLibrary[friendIndex][0]; i < friendLibrary[friendIndex][1]; i++)
        {
            friendTitles[i] = titles[i];
            friendAuthors[i] = authors[i];
            friendCovers[i] = covers[i];
        }

        friendsLibraryBundle.putStringArray("titles", friendTitles);
        friendsLibraryBundle.putStringArray("authors", friendAuthors);
        friendsLibraryBundle.putStringArray("covers", friendCovers);

        return friendsLibraryBundle;
    }

    // This is used to retrieve complete data for DetailActivity
    public static Bundle getBookBundle(int i)
    {
        Bundle b = new Bundle();
        b.putString("bookTitle", titles[i]);
        b.putString("bookAuthor", authors[i]);
        b.putString("bookCover", covers[i]);
        b.putString("bookOwner", friends[i]);
        b.putString("bookDescription", synopsiss[i]);
        b.putString("bookStatus", statuss[i]);  //TODO implement status in book detail view
        return b;
    }

    public static String[] getTitles() {
        return titles;
    }

    public static String[] getAuthors() {
        return authors;
    }

    public static String[] getCovers() {
        return covers;
    }

    public static String[] getGenres() {
        return genres;
    }

    public static String[] getYears() {
        return years;
    }

    public static String[] getPublishers() {
        return publishers;
    }

    public static String[] getSynopsiss() {
        return synopsiss;
    }

    public static String[] getFriends() {
        return friends;
    }

    public static int[] getNumBooks() {
        return numBooks;
    }

    public static String[] getStatuss() {
        return statuss;
    }

    //public String[][] getListViewItems() { //Title Author Cover Status are needed for listview
    //    return new String[][]{titles, authors, covers, statuss};
    //}
}