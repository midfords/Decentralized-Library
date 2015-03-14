package com.comp4020.utils;

/**
 * Created by jeff on 15-03-11.
 */
import android.os.Bundle;

public class Data {

    //
    // Book data
    //

    private static final String[] titles = new String[] {
            "Academ's Fury",
            "Agents of Light and Darkness",
            "A Hat Full of Sky",
            "A Walk on the Nightside",
            "Beyond the Blue Moon",
            "Blood and Honour",
            "Blue Moon Rising",
            "Captain's Fury",
            "Carpe Jugulum",
            "Changes",
            "Cinder Spires 1",
            "Cold Days",
            "Cursor's Fury",
            "Dead Beat",
            "Death Masks",
            "Deathstalker",
            "Deathstalker Coda",
            "Deathstalker Destiny",
            "Deathstalker Honour",
            "Deathstalker Legacy",
            "Deathstalker Rebelion",
            "Deathstalker Return",
            "Deathstalker War",
            "Down Among the Dead Men",
            "Drinking Midnight Wine",
            "Equal Rites",
            "Feet of Clay",
            "First Lord's Fury",
            "Furies of Calderon",
            "Ghost Story",
            "Ghostworld",
            "Going Postal",
            "Good Omens",
            "Grave Peril",
            "Guards! Guards!",
            "Guards of Haven",
            "Haunting the Nightside",
            "Haven of Lost Souls",
            "Hello to Pay",
            "Helloworld",
            "Hex and the City",
            "Hogfather",
            "Jingo",
            "Just Another Judgement Day",
            "Lords and Ladies",
            "Maskerade",
            "Mean Streets",
            "Men at Arms",
            "Mort",
            "Moving Pictures",
            "My Big Fat Supernatural Honeymoon",
            "Nightingale's Lament",
            "Night Watch",
            "Princep's Fury",
            "Pyramids",
            "Reaper Man",
            "Shadows Fall",
            "Sharper Than A Serpent's Tooth",
            "Skin Game",
            "Small Favor",
            "Small Gods",
            "Snuff",
            "Something from the Nightside",
            "Soul Music",
            "Sourcery",
            "Storm Front",
            "Summer Knight",
            "Swords of Haven",
            "The Carpet People",
            "The Colour of Magic",
            "The Dark Heart of the Nightside",
            "The Dark Side of the Sun",
            "The God Killer",
            "The Light Fantastic",
            "The Spy Who Haunted Me",
            "The Unnatural Inquirer",
            "Thief of Time",
            "Truckers",
            "Turn Coat",
            "Welcome to the Jungle",
            "Wintersmith",
            "Witches Abroad",
            "Wyrd Sisters",
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

    private static final String[] covers = new String[] {

            "academsfury",
            "agentsoflightanddarkness",
            "ahatfullofsky",
            "awalkonthenightside",
            "beyondthebluemoon",
            "bloodandhonour",
            "bluemoonrising",
            "captainsfury",
            "carpejugulum",
            "changes",
            "cinderspires1",
            "colddays",
            "cursorsfury",
            "deadbeat",
            "deathmasks",
            "deathstalker",
            "deathstalkercoda",
            "deathstalkerdestiny",
            "deathstalkerhonour",
            "deathstalkerlegacy",
            "deathstalkerrebelion",
            "deathstalkerreturn",
            "deathstalkerwar",
            "downamongthedeadmen",
            "drinkingmidnightwine",
            "equalrites",
            "feetofclay",
            "firstlordsfury",
            "furiesofcalderon",
            "ghoststory",
            "ghostworld",
            "goingpostal",
            "goodomens",
            "graveperil",
            "guardsguards",
            "guardsofhaven",
            "hauntingthenightside",
            "havenoflostsouls",
            "hellotopay",
            "helloworld",
            "hexandthecity",
            "hogfather",
            "jingo",
            "justanotherjudgementday",
            "lordsandladies",
            "maskerade",
            "meanstreets",
            "menatarms",
            "mort",
            "movingpictures",
            "mybigfatsupernaturalhoneymoon",
            "nightingaleslament",
            "nightwatch",
            "princepsfury",
            "pyramids",
            "reaperman",
            "shadowsfall",
            "shaperthanaserpentstooth",
            "skingame",
            "smallfavor",
            "smallgods",
            "snuff",
            "somethingfromthenightside",
            "soulmusic",
            "sourcery",
            "stormfront",
            "summerknight",
            "swordsofhaven",
            "thecarpetpeople",
            "thecolourofmagic",
            "thedarkheartofthenightside",
            "thedarksideofthesun",
            "thegodkiller",
            "thelightfantastic",
            "thespywhohauntedme",
            "theunnaturalinquirer",
            "thiefoftime",
            "truckers",
            "turncoat",
            "welcometothejungle",
            "wintersmith",
            "witchesabroad",
            "wyrdsisters"
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
    private static final int[] myLibrary = new int[] {0, 15};

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
    private static final int[] numBooks = new int[] { 15, 25 };

    // Too much work to write separate libraries for all friends. Instead books are referenced by id
    //  (array position). the two values are the start and end of each friend's book list
    private static int[][] friendLibrary = new int[][] {
            {16, 31},
            {33, 58},
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