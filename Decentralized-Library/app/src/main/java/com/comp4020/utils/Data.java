package com.comp4020.utils;

/**
 * Created by jeff on 15-03-11.
 */
import android.os.Bundle;
import java.util.*;

public class Data {

    //
    // Book data
    //

    private static final String[] titles = new String[] {
            "1984",
            "Academ's Fury",
            "Across the Universe",
            "Agents of Light and Darkness",
            "Alas, Babylon",
            "Altered Carbon",
            "American Gods",
            "Angelfall",
            "Animal Farm",
            "Anthem",
            "Armor",
            "Atlas Shrugged",
            "A Clockwork Orange",
            "A Deepness in the Sky",
            "A Hat Full of Sky",
            "A Scanner Darkly",
            "A Storm of Swords",
            "A Walk on the Nightside",
            "A Wizard of EarthSea",
            "A Wrinkle in Time",
            "Barrayar",
            "Battle Royale",
            "Beyond the Blue Moon",
            "Birthmarked",
            "Blindness",
            "Blindsight",
            "Blood and Honour",
            "Blood Music",
            "Blood Red Road",
            "Blue Moon Rising",
            "Brave New World",
            "Breakfast Of Champions",
            "Burning Chrome",
            "Captain's Fury",
            "Carpe Jugulum",
            "Catching Fire",
            "Cat's Cradle",
            "Cell",
            "Changes",
            "Chasm City",
            "Cinder",
            "Cinder Spires 1",
            "Citizen of the Galaxy",
            "Cloud Atlas",
            "Cold Days",
            "Consider Phlebas",
            "Count Zero",
            "Cursor's Fury",
            "Dangerous Visions",
            "Dark Force Rising",
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
            "Defiance",
            "Delirium",
            "Dhalgren",
            "Diamond Eyes",
            "Divergent",
            "Double Star",
            "Downbelow Station",
            "Down Among the Dead Men",
            "Do Androids Dream of Electric Sheep?",
            "Dracula",
            "Dragonquest",
            "Dragonsinger",
            "Drinking Midnight Wine",
            "Dune",
            "Dust",
            "Earth Abides",
            "Emperor of Thorns",
            "Enclave",
            "Ender's Game",
            "Endymion",
            "Equal Rites",
            "Fahrenheit 451",
            "Fargoer",
            "Feed",
            "Feet of Clay",
            "First Lord's Fury",
            "Footfall",
            //"Forged by Fate",
            "Fortress Frontier",
            "Foundation",
            "Foundation and Earth",
            "Frankenstein",
            "Friday",
            "Frost Burned",
            "Furies of Calderon",
            "Galapagos",
            "Ghost Story",
            "Ghostworld",
            "Glitch",
            "Going Postal",
            "Gone",
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
            "V for Vendetta",
            "Welcome to the Jungle",
            "Wintersmith",
            "Witches Abroad",
            "Wyrd Sisters"
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
            "Terry Pratchett","Terry Pratchett",
            "Terry Pratchett","Terry Pratchett","Terry Pratchett","Terry Pratchett",
            "Terry Pratchett","Terry Pratchett","Terry Pratchett","Terry Pratchett",
            "Terry Pratchett","Terry Pratchett","Terry Pratchett","Terry Pratchett",
            "Terry Pratchett","Terry Pratchett","Terry Pratchett","Terry Pratchett",
            "Terry Pratchett","Terry Pratchett","Terry Pratchett","Terry Pratchett",
            "Terry Pratchett","Terry Pratchett",
            "Terry Pratchett","Terry Pratchett","Terry Pratchett","Terry Pratchett",
            "Terry Pratchett","Terry Pratchett","Terry Pratchett","Terry Pratchett",
            "Terry Pratchett","Terry Pratchett","Terry Pratchett","Terry Pratchett",
            "Terry Pratchett","Terry Pratchett","Terry Pratchett","Terry Pratchett",
            "Terry Pratchett","Terry Pratchett","Terry Pratchett","Terry Pratchett",
            "Terry Pratchett","Terry Pratchett",
            "Terry Pratchett","Terry Pratchett","Terry Pratchett","Terry Pratchett",
            "Terry Pratchett","Terry Pratchett","Terry Pratchett","Terry Pratchett",
            "Terry Pratchett","Terry Pratchett","Terry Pratchett","Terry Pratchett",
            "Terry Pratchett","Terry Pratchett","Terry Pratchett","Terry Pratchett",
            "Terry Pratchett","Terry Pratchett","Terry Pratchett","Terry Pratchett",
            "Terry Pratchett","Terry Pratchett",
            "Terry Pratchett","Terry Pratchett","Terry Pratchett","Terry Pratchett",
            "Terry Pratchett","Terry Pratchett","Terry Pratchett","Terry Pratchett",
            "Terry Pratchett","Terry Pratchett","Terry Pratchett","Terry Pratchett",
            "Terry Pratchett","Terry Pratchett","Terry Pratchett","Terry Pratchett",
            "Terry Pratchett","Terry Pratchett","Terry Pratchett","Terry Pratchett",
            "Terry Pratchett","Terry Pratchett",
    };

    private static final String[] covers = new String[] {

            "a1984",
            "academsfury",
            "acrosstheuniverse",
            "agentsoflightanddarkness",
            "alasbabylon",
            "alteredcarbon",
            "americangods",
            "angelfall",
            "animalfarm",
            "anthem",
            "armor",
            "atlasshrugged",
            "aclockworkorange",
            "adeepnessinthesky",
            "ahatfullofsky",
            "ascannerdarkly",
            "astormofswords",
            "awalkonthenightside",
            "awizardofearthsea",
            "awrinkleintime",
            "barrayar",
            "battleroyale",
            "beyondthebluemoon",
            "birthmarked",
            "blindness",
            "blindsight",
            "bloodandhonour",
            "bloodmusic",
            "bloodredroad",
            "bluemoonrising",
            "bravenewworld",
            "breakfastofchampions",
            "burningchrome",
            "captainsfury",
            "carpejugulum",
            "catchingfire",
            "catscradle",
            "cell",
            "changes",
            "chasmcity",
            "cinder",
            "cinderspires1",
            "citizenofthegalaxy",
            "cloudatlas",
            "colddays",
            "considerphlebas",
            "countzero",
            "cursorsfury",
            "dangerousvisions",
            "darkforcerising",
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
            "defiance",
            "delirium",
            "dhalgren",
            "diamondeyes",
            "divergent",
            "doandroidsdreamofelectricsheep",
            "doublestar",
            "downamongthedeadmen",
            "downbelowstation",
            "dracula",
            "dragonquest",
            "dragonsinger",
            "drinkingmidnightwine",
            "dune",
            "dust",
            "earthabides",
            "emperorofthorns",
            "enclave",
            "endersgame",
            "endymion",
            "equalrites",
            "fahrenheit451",
            "fargoer",
            "feed",
            "feetofclay",
            "firstlordsfury",
            "footfall",
            "fortressfrontier",
            "foundation",
            "foundationandearth",
            "frankenstein",
            "friday",
            "frostburned",
            "furiesofcalderon",
            "galapagos",
            "ghoststory",
            "ghostworld",
            "glitch",
            "goingpostal",
            "gone",
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
            "vforvendetta",
            "welcometothejungle",
            "wintersmith",
            "witchesabroad",
            "wyrdsisters",
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
            "Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy",
            "Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy",
            "Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy",
            "Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy",
            "Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy","Fantasy",
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
    //statusses are On Shelf and Lent
    private static String[] statuss = new String[] {
            "On Shelf","Lent","Lent","On Shelf","On Shelf","Lent","Lent","On Shelf","Lent",
            "On Shelf","Lent","Lent","On Shelf","On Shelf","Lent","Lent","On Shelf","Lent",
            "On Shelf","Lent","Lent","On Shelf","On Shelf","Lent","Lent","On Shelf","Lent",
            "On Shelf","Lent","Lent","On Shelf","On Shelf","Lent","Lent","On Shelf","Lent",
            "On Shelf","Lent","Lent","On Shelf","On Shelf","Lent","Lent","On Shelf","Lent",
            "On Shelf","Lent","Lent","On Shelf","On Shelf","Lent","Lent","On Shelf","Lent",
            "On Shelf","Lent","Lent","On Shelf","On Shelf","Lent","Lent","On Shelf","Lent",
            "On Shelf","Lent","Lent","On Shelf","On Shelf","Lent","Lent","On Shelf","Lent",
            "On Shelf","Lent","Lent","On Shelf","On Shelf","Lent","Lent","On Shelf","Lent",
            "On Shelf","Lent","Lent","On Shelf","On Shelf","Lent","Lent","On Shelf","Lent",
            "On Shelf","Lent","Lent","On Shelf","On Shelf","Lent","Lent","On Shelf","Lent",
            "On Shelf","Lent","Lent","On Shelf","On Shelf","Lent","Lent","On Shelf","Lent",
            "On Shelf","Lent","Lent","On Shelf","On Shelf","Lent","Lent","On Shelf","Lent",
            "On Shelf","Lent","Lent","On Shelf","On Shelf","Lent","Lent","On Shelf","Lent",
            "On Shelf","Lent","Lent","On Shelf","On Shelf","Lent","Lent","On Shelf","Lent",
            "On Shelf","Lent","Lent","On Shelf","On Shelf","Lent","Lent","On Shelf","Lent",
            "On Shelf","Lent","Lent","On Shelf","On Shelf","Lent","Lent","On Shelf","Lent",
            "On Shelf","Lent","Lent","On Shelf","On Shelf","Lent","Lent","On Shelf","Lent",
            "On Shelf","Lent","Lent","On Shelf","On Shelf","Lent","Lent","On Shelf","Lent",
            "On Shelf","Lent","Lent","On Shelf","On Shelf","Lent","Lent","On Shelf","Lent",
            "On Shelf","Lent","Lent","On Shelf","On Shelf","Lent","Lent","On Shelf","Lent",
            "On Shelf","Lent","Lent","On Shelf","On Shelf","Lent","Lent","On Shelf","Lent",
            "On Shelf","Lent","Lent","On Shelf","On Shelf","Lent","Lent","On Shelf","Lent",
            "On Shelf","Lent","Lent","On Shelf","On Shelf","Lent","Lent","On Shelf","Lent",
            "On Shelf","Lent","Lent","On Shelf","On Shelf","Lent","Lent","On Shelf","Lent",
            "On Shelf","Lent","Lent","On Shelf","On Shelf","Lent","Lent","On Shelf","Lent",
    };

    //
    // Owner and friends data
    //

    //users library
    private static final int[] myLibrary = new int[] {0, 14};

    //users library status
    private static String[] myStatuss = new String[] {
            "On Shelf", "Lent", "On Shelf", "Requested", "Requested",
            "On Shelf","On Shelf","On Shelf","On Shelf","On Shelf",
            "On Shelf","Lent","On Shelf","On Shelf","On Shelf"
    };

    private static int[] myRequestedBookIndex = new int[] {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    private static String[][] myRequestedDetails = new String[myRequestedBookIndex.length][3];

    private static int[] myBorrowed = new int[] {45, 65, 22, 47, 58, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    private static ArrayList<Integer> requests = new ArrayList<Integer>();
    private static ArrayList<Integer> requested = new ArrayList<Integer>();
    private static ArrayList<Integer> borrowed = new ArrayList<Integer>(Arrays.asList(45, 65, 22, 47, 58));
    private static ArrayList<Integer> lent = new ArrayList<Integer>();

    private static final String[] friends = new String[] {
            "Toquehead",
            "Sean",
    };

    // TODO: This can be removed since friendsLibrary contains length info
    //  leave in for now.
    private static final int[] numBooks = new int[] { 25, 50 }; //book list lengths

    private static int[] userLibrary = new int[] {0, 50};
    // Too much work to write separate libraries for all friends. Instead books are referenced by id
    //  (array position). the two values are the start and end of each friend's book list
    private static int[][] friendLibrary = new int[][] {
            {50, 100},
            {100, 150},
    };

    public static void addRequest(String title, String location, String date, String message) {

        int bookIndex = 0;
        int insertAt = 0;

        //find index values
        while(insertAt < myRequestedBookIndex.length && myRequestedBookIndex[insertAt] == -1) { insertAt++; }
        while(bookIndex < titles.length && !titles[bookIndex].equals(title)) { bookIndex++; }

        if(insertAt < myRequestedBookIndex.length && bookIndex < titles.length) {
            myRequestedBookIndex[insertAt] = bookIndex;
            myRequestedDetails[insertAt][0] = location;
            myRequestedDetails[insertAt][1] = date;
            myRequestedDetails[insertAt][2] = message;
        }
    }

    public static void addRequest(int index)
    {
        requests.add(index);
        Collections.sort(requests);
    }

    public static void acceptRequest(int index)
    {
        addLent(requests.get(index));
        requests.remove(index);
    }

    public static void rejectRequest(int index)
    {
        requests.remove(index);
    }

    public static void addRequested(int index)
    {
        requested.add(index);
        Collections.sort(requests);
    }

    public static void cancelRequested(int index)
    {
        requested.remove(index);
    }

    public static void addBorrowed(int index)
    {
        borrowed.add(index);
        Collections.sort(requests);
    }

    public static void addLent(int index)
    {
        lent.add(index);
        Collections.sort(requests);
    }

    public static void unLend(int index)
    {
        lent.remove(index);
    }

    public static Bundle getRequests() {
        Bundle b = new Bundle();
        String[] rTitles = new String[requests.size()];
        String[] rAuthors = new String[requests.size()];
        String[] rCovers = new String[requests.size()];

        for (int i=0;i<requests.size(); i++)
        {
            rTitles[i] = titles[requests.get(i)];
            rAuthors[i] = authors[requests.get(i)];
            rCovers[i] = covers[requests.get(i)];
        }

//        int num = 0;
//        int[] rIndex = new int[myLibrary.length];
//
//        for(int i=myLibrary[0]; i<myLibrary[1]; i++) {
//            if(myStatuss[i].equals("Requested")) {
//                rIndex[num] = i;
//                num++;
//            }
//        }
//        rTitles = new String[num];
//        rAuthors = new String[num];
//        rCovers = new String[num];
//
//        for(int i=0; i<num; i++) {
//            rTitles[i] = titles[rIndex[i]];
//            rAuthors[i] = authors[rIndex[i]];
//            rCovers[i] = covers[rIndex[i]];
//        }

        b.putStringArray("titles", rTitles);
        b.putStringArray("authors", rAuthors);
        b.putStringArray("covers", rCovers);
        return b;
    }

    public static Bundle getRequested() {
        Bundle b = new Bundle();
        String[] rTitles = new String[requested.size()];
        String[] rAuthors = new String[requested.size()];
        String[] rCovers = new String[requested.size()];

        for (int i=0;i<requests.size(); i++)
        {
            rTitles[i] = titles[requested.get(i)];
            rAuthors[i] = authors[requested.get(i)];
            rCovers[i] = covers[requested.get(i)];
        }

//        int i = 0;
//        while(i < myRequestedBookIndex.length && myRequestedBookIndex[i] != -1)
//        {
//            i++;
//        }
//
//        rTitles = new String[i];
//        rAuthors = new String[i];
//        rCovers = new String[i];
//
//        for(int j=0; j<i; j++) {
//            rTitles[j] = titles[myRequestedBookIndex[j]];
//            rAuthors[j] = authors[myRequestedBookIndex[j]];
//            rCovers[j] = covers[myRequestedBookIndex[j]];
//        }

        b.putStringArray("titles", rTitles);
        b.putStringArray("authors", rAuthors);
        b.putStringArray("covers", rCovers);
        return b;
    }

    public static Bundle getBorrowed() {
        Bundle b = new Bundle();
        String[] rTitles = new String[borrowed.size()];
        String[] rAuthors = new String[borrowed.size()];
        String[] rCovers = new String[borrowed.size()];

        for (int i=0;i<requests.size(); i++)
        {
            rTitles[i] = titles[borrowed.get(i)];
            rAuthors[i] = authors[borrowed.get(i)];
            rCovers[i] = covers[borrowed.get(i)];
        }

//        int i = 0;
//        while(i < myBorrowed.length && myBorrowed[i] != -1)
//        {
//            i++;
//        }
//
//        rTitles = new String[i];
//        rAuthors = new String[i];
//        rCovers = new String[i];
//
//        for(int j=0; j<i; j++) {
//            rTitles[j] = titles[myBorrowed[j]];
//            rAuthors[j] = authors[myBorrowed[j]];
//            rCovers[j] = covers[myBorrowed[j]];
//        }

        b.putStringArray("titles", rTitles);
        b.putStringArray("authors", rAuthors);
        b.putStringArray("covers", rCovers);
        return b;
    }

    public static Bundle getLent() {
        Bundle b = new Bundle();
        String[] rTitles = new String[lent.size()];
        String[] rAuthors = new String[lent.size()];
        String[] rCovers = new String[lent.size()];

        for (int i=0;i<requests.size(); i++)
        {
            rTitles[i] = titles[lent.get(i)];
            rAuthors[i] = authors[lent.get(i)];
            rCovers[i] = covers[lent.get(i)];
        }

//        int num = 0;
//        int[] rIndex = new int[myLibrary.length];
//
//        for(int i=myLibrary[0]; i<myLibrary[1]; i++) {
//            if(myStatuss[i].equals("Lent")) {
//                rIndex[num] = i;
//                num++;
//            }
//        }
//        rTitles = new String[num];
//        rAuthors = new String[num];
//        rCovers = new String[num];
//
//        for(int i=0; i<num; i++) {
//            rTitles[i] = titles[rIndex[i]];
//            rAuthors[i] = authors[rIndex[i]];
//            rCovers[i] = covers[rIndex[i]];
//        }

        b.putStringArray("titles", rTitles);
        b.putStringArray("authors", rAuthors);
        b.putStringArray("covers", rCovers);
        return b;
    }

    public static String getFriendsName(int i) {
        return friends[i];
    }

    public static Bundle getUsersLibraryBundle()
    {

        Bundle usersLibraryBundle = new Bundle();
        int length = userLibrary[1]-userLibrary[0];
        if (!Globals.longLists)
            length /= 2;
        String[] userTitles = new String[length];
        String[] userAuthors = new String[length];
        String[] userCovers = new String[length];
        String[] userStatuss = new String[length];

        for(int i = userLibrary[0]; i < userLibrary[0] + length; i++)
        {
            userTitles[i-userLibrary[0]] = titles[i];
            userAuthors[i-userLibrary[0]] = authors[i];
            userCovers[i-userLibrary[0]] = covers[i];
            userStatuss[i-userLibrary[0]] = statuss[i];
        }

        usersLibraryBundle.putStringArray("titles", userTitles);
        usersLibraryBundle.putStringArray("authors", userAuthors);
        usersLibraryBundle.putStringArray("covers", userCovers);
        usersLibraryBundle.putStringArray("statuss", userStatuss);

        return usersLibraryBundle;
    }

    // Return a bundle array containing string array of book info
    public static Bundle getFriendsLibraryBundle(int friendIndex)
    {
        Bundle friendsLibraryBundle = new Bundle();
        int length = friendLibrary[friendIndex][1]-friendLibrary[friendIndex][0];
        if (!Globals.longLists)
            length /= 2;
        String[] friendTitles = new String[length];
        String[] friendAuthors = new String[length];
        String[] friendCovers = new String[length];
        String[] friendStatuss = new String[length];

        for(int i = friendLibrary[friendIndex][0]; i < friendLibrary[friendIndex][0] + length; i++)
        {
            friendTitles[i-friendLibrary[friendIndex][0]] = titles[i];
            friendAuthors[i-friendLibrary[friendIndex][0]] = authors[i];
            friendCovers[i-friendLibrary[friendIndex][0]] = covers[i];
            friendStatuss[i-friendLibrary[friendIndex][0]] = statuss[i];
        }

        friendsLibraryBundle.putStringArray("titles", friendTitles);
        friendsLibraryBundle.putStringArray("authors", friendAuthors);
        friendsLibraryBundle.putStringArray("covers", friendCovers);
        friendsLibraryBundle.putStringArray("statuss", friendStatuss);

        return friendsLibraryBundle;
    }

    // This is used to retrieve complete data for DetailActivity
    public static Bundle getBookBundle(int i)
    {
        Bundle b = new Bundle();
        b.putString("bookTitle", titles[i]);
        b.putString("bookAuthor", authors[i]);
        b.putString("bookCover", covers[i]);
        b.putString("bookDescription", synopsiss[i]);
        b.putString("bookStatus", statuss[i]);

        //get owner string
        for(int j=0; j<friendLibrary.length; j++)
        {
            if(friendLibrary[j][0] <= i && friendLibrary[j][1] >= i)
            {
                b.putString("bookOwner", friends[j]);
            }
        }
        return b;
    }

    public static Bundle getBookBundle(String title)
    {
        Bundle b = null;
        int i = 0;
        while(i < titles.length && !titles[i].equals(title)) { i++; }

        if(i < titles.length) {
            b = getBookBundle(i);
        }

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
        int[] numBooks = new int[friends.length];
        for (int i = 0; i < friends.length; i++)
        {
            numBooks[i] = friendLibrary[i][1]-friendLibrary[i][0];
            if (!Globals.longLists)
            {
                numBooks[i]/=2;
            }
        }
        return numBooks;
    }

    public static String[] getStatuss() {
        return statuss;
    }

    //public String[][] getListViewItems() { //Title Author Cover Status are needed for listview
    //    return new String[][]{titles, authors, covers, statuss};
    //}
}