package com.comp4020.utils;

/**
 * Created by jeff on 15-03-11.
 */
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.*;

public class Data {

    //
    // Book data
    //

<<<<<<< HEAD
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
=======
    private static final String[] titles = new String[]{
            "1984",
            "Academ's Fury",
            "A Clockwork Orange",
            "Across the Universe",
            "A Deepness in the Sky",
            "Agents of Light and Darkness",
            "A Hat Full of Sky",
            "Alas, Babylon",
            "Altered Carbon",
            "American Gods",
            "Angelfall",
            "Animal Farm",
            "Anthem",
            "Armor",
            "A Scanner Darkly",
            "A Storm of Swords",
            "Atlas Shrugged",
            "A Walk on the Nightside",
            "A Wizard of EarthSea",
            "A Wrinkle in Time",
            "Barrayar",
            "Battle Royale",
            "Beyond the Blue Moon",
            "Birthmarked",
            "Blindness",//end of short list
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
            "Dark Force Rising",//end of long list
>>>>>>> origin/Development
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
<<<<<<< HEAD
            "Down Among the Dead Men",
            "Drinking Midnight Wine",
            "Equal Rites",
            "Feet of Clay",
            "First Lord's Fury",
            "Furies of Calderon",
            "Ghost Story",
            "Ghostworld",
            "Going Postal",
=======
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
            "Dust",//end of short list
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
            "Gone",//end of long list
>>>>>>> origin/Development
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
<<<<<<< HEAD
            "Shadows Fall",
=======
            "Shadows Fall",// end of short list
>>>>>>> origin/Development
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
<<<<<<< HEAD
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
=======
            "V for Vendetta",
            "Welcome to the Jungle",
            "Wintersmith",//end of long list
            "Witches Abroad",
            "Wyrd Sisters"
    };

    private static final String[] authors = new String[]{
            "Simon R. Greene", "Simon R. Greene", "Simon R. Greene", "Simon R. Greene",
            "Simon R. Greene", "Simon R. Greene", "Simon R. Greene", "Simon R. Greene",
            "Simon R. Greene", "Simon R. Greene", "Simon R. Greene", "Simon R. Greene",
            "Simon R. Greene", "Simon R. Greene", "Simon R. Greene", "Simon R. Greene",
            "Simon R. Greene", "Simon R. Greene", "Simon R. Greene", "Simon R. Greene",
            "Simon R. Greene", "Simon R. Greene", "Simon R. Greene", "Simon R. Greene",
            "Simon R. Greene", "Simon R. Greene", "Simon R. Greene", "Simon R. Greene",
            "Simon R. Greene", "Simon R. Greene", "Simon R. Greene", "Simon R. Greene",
            "Simon R. Greene", "Simon R. Greene", "Simon R. Greene", "Simon R. Greene", //37, 24, 29 = 90 books
            "Simon R. Greene", "Jim Butcher", "Jim Butcher", "Jim Butcher", "Jim Butcher",
            "Jim Butcher", "Jim Butcher", "Jim Butcher", "Jim Butcher", "Jim Butcher", "Jim Butcher",
            "Jim Butcher", "Jim Butcher", "Jim Butcher", "Jim Butcher", "Jim Butcher", "Jim Butcher",
            "Jim Butcher", "Jim Butcher", "Jim Butcher", "Jim Butcher", "Jim Butcher", "Jim Butcher",
            "Jim Butcher", "Jim Butcher", "Terry Pratchett", "Terry Pratchett", "Terry Pratchett",
            "Terry Pratchett", "Terry Pratchett", "Terry Pratchett", "Terry Pratchett",
            "Terry Pratchett", "Terry Pratchett", "Terry Pratchett", "Terry Pratchett",
            "Terry Pratchett", "Terry Pratchett", "Terry Pratchett", "Terry Pratchett",
            "Terry Pratchett", "Terry Pratchett", "Terry Pratchett", "Terry Pratchett",
            "Terry Pratchett", "Terry Pratchett", "Terry Pratchett", "Terry Pratchett",
            "Terry Pratchett", "Terry Pratchett", "Terry Pratchett", "Terry Pratchett",
            "Terry Pratchett", "Terry Pratchett",
            "Terry Pratchett", "Terry Pratchett", "Terry Pratchett", "Terry Pratchett",
            "Terry Pratchett", "Terry Pratchett", "Terry Pratchett", "Terry Pratchett",
            "Terry Pratchett", "Terry Pratchett", "Terry Pratchett", "Terry Pratchett",
            "Terry Pratchett", "Terry Pratchett", "Terry Pratchett", "Terry Pratchett",
            "Terry Pratchett", "Terry Pratchett", "Terry Pratchett", "Terry Pratchett",
            "Terry Pratchett", "Terry Pratchett",
            "Terry Pratchett", "Terry Pratchett", "Terry Pratchett", "Terry Pratchett",
            "Terry Pratchett", "Terry Pratchett", "Terry Pratchett", "Terry Pratchett",
            "Terry Pratchett", "Terry Pratchett", "Terry Pratchett", "Terry Pratchett",
            "Terry Pratchett", "Terry Pratchett", "Terry Pratchett", "Terry Pratchett",
            "Terry Pratchett", "Terry Pratchett", "Terry Pratchett", "Terry Pratchett",
            "Terry Pratchett", "Terry Pratchett",
            "Terry Pratchett", "Terry Pratchett", "Terry Pratchett", "Terry Pratchett",
            "Terry Pratchett", "Terry Pratchett", "Terry Pratchett", "Terry Pratchett",
            "Terry Pratchett", "Terry Pratchett", "Terry Pratchett", "Terry Pratchett",
            "Terry Pratchett", "Terry Pratchett", "Terry Pratchett", "Terry Pratchett",
            "Terry Pratchett", "Terry Pratchett", "Terry Pratchett", "Terry Pratchett",
            "Terry Pratchett", "Terry Pratchett",
            "Terry Pratchett", "Terry Pratchett", "Terry Pratchett", "Terry Pratchett",
            "Terry Pratchett", "Terry Pratchett", "Terry Pratchett", "Terry Pratchett",
            "Terry Pratchett", "Terry Pratchett", "Terry Pratchett", "Terry Pratchett",
            "Terry Pratchett", "Terry Pratchett", "Terry Pratchett", "Terry Pratchett",
            "Terry Pratchett", "Terry Pratchett", "Terry Pratchett", "Terry Pratchett",
            "Terry Pratchett", "Terry Pratchett",
    };

    private static final String[] covers = new String[]{

            "a1984",
            "academsfury",
            "aclockworkorange",
            "acrosstheuniverse",
            "adeepnessinthesky",
            "agentsoflightanddarkness",
            "ahatfullofsky",
            "alasbabylon",
            "alteredcarbon",
            "americangods",
            "angelfall",
            "animalfarm",
            "anthem",
            "armor",
            "ascannerdarkly",
            "astormofswords",
            "atlasshrugged",
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

    private static final String[] genres = new String[]{
            "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy",
            "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy",
            "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy",
            "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy",
            "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy",
            "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy",
            "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy",
            "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy",
            "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy",
            "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy",
            "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy",
            "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy",
            "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy",
            "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy",
            "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy",
            "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy",
            "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy",
            "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy",
            "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy",
            "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy",
            "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy",
            "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy",
            "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy",
            "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy",
            "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy", "Fantasy",
    };

    private static final String[] years = new String[]{
            "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year",
            "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year",
            "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year",
            "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year",
            "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year",
            "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year",
            "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year",
            "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year",
            "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year",
            "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year",
            "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year",
            "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year",
            "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year",
            "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year",
            "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year",
            "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year",
            "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year",
            "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year",
            "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year",
            "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year",
            "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year",
            "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year",
            "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year",
            "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year",
            "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year",
            "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year", "Year",
    };

    private static final String[] publishers = new String[]{
            "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher",
            "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher",
            "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher",
            "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher",
            "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher",
            "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher",
            "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher",
            "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher",
            "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher",
            "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher",
            "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher",
            "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher",
            "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher",
            "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher",
            "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher",
            "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher",
            "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher",
            "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher",
            "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher",
            "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher",
            "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher",
            "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher",
            "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher",
            "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher",
            "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher",
            "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher",
            "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher",
            "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher",
            "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher",
            "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher", "Publisher",
    };

    private static final String[] synopsiss = new String[]{
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
>>>>>>> origin/Development
    };

    //
    // Owner and friends data
    //

<<<<<<< HEAD
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

    private static final String[] friends = new String[] {
            "Toquehead",
            "Sean",
    };

    // TODO: This can be removed since friendsLibrary contains length info
    //  leave in for now.
    private static final int[] numBooks = new int[] { 25, 50 }; //book list lengths

    private static int[] userLibrary = new int[] {1, 50};
    // Too much work to write separate libraries for all friends. Instead books are referenced by id
    //  (array position). the two values are the start and end of each friend's book list
    private static int[][] friendLibrary = new int[][] {
            {15, 40},
            {33, 83},
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

    public static Bundle getRequested() {
        Bundle b = new Bundle();
        String[] rTitles;
        String[] rAuthors;
        String[] rCovers;

        int i = 0;
        while(i < myRequestedBookIndex.length && myRequestedBookIndex[i] != -1)
        {
            i++;
        }

        rTitles = new String[i];
        rAuthors = new String[i];
        rCovers = new String[i];

        for(int j=0; j<i; j++) {
            rTitles[j] = titles[myRequestedBookIndex[j]];
            rAuthors[j] = authors[myRequestedBookIndex[j]];
            rCovers[j] = covers[myRequestedBookIndex[j]];
        }

        b.putStringArray("titles", rTitles);
        b.putStringArray("authors", rAuthors);
        b.putStringArray("covers", rCovers);
        return b;
    }

    public static Bundle getBorrowed() {
        Bundle b = new Bundle();
        String[] rTitles;
        String[] rAuthors;
        String[] rCovers;

        int i = 0;
        while(i < myBorrowed.length && myBorrowed[i] != -1)
        {
            i++;
        }

        rTitles = new String[i];
        rAuthors = new String[i];
        rCovers = new String[i];

        for(int j=0; j<i; j++) {
            rTitles[j] = titles[myBorrowed[j]];
            rAuthors[j] = authors[myBorrowed[j]];
            rCovers[j] = covers[myBorrowed[j]];
        }

        b.putStringArray("titles", rTitles);
        b.putStringArray("authors", rAuthors);
        b.putStringArray("covers", rCovers);
        return b;
    }

    public static Bundle getLent() {
        Bundle b = new Bundle();
        String[] rTitles;
        String[] rAuthors;
        String[] rCovers;
        int num = 0;
        int[] rIndex = new int[myLibrary.length];

        for(int i=myLibrary[0]; i<myLibrary[1]; i++) {
            if(myStatuss[i].equals("Lent")) {
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
=======
    //Requests according to PM3 Task Appendix
    private static ArrayList<Request> requests = new ArrayList<Request>(Arrays.asList(
            new Request(44, "Toquehead", "Ha", "Ho", "Hu"),
            new Request(14, "Toquehead", "Ha", "Ho", "Hu"),
            new Request(3, "Toquehead", "Ha", "Ho", "Hu"),
            new Request(17, "Toquehead", "Ha", "Ho", "Hu"), //TODO make location, date, and message data for requests
            new Request(22, "Sean", "Ha", "Ho", "Hu"),
            new Request(26, "Sean", "Ha", "Ho", "Hu"),
            new Request(29, "Sean", "Ha", "Ho", "Hu"),
            new Request(33, "Sean", "Ha", "Ho", "Hu"),
            new Request(50, "Toquehead", "Ha", "Ho", "Hu"),
            new Request(47, "Toquehead", "Ha", "Ho", "Hu"),
            new Request(41, "Sean", "Ha", "Ho", "Hu"),
            new Request(34, "Sean", "Ha", "Ho", "Hu")
    ));
    private static ArrayList<Request> requested = new ArrayList<Request>();
    private static ArrayList<Integer> borrowed = new ArrayList<Integer>(Arrays.asList(105, 65, 134));
    private static ArrayList<Integer> lent = new ArrayList<Integer>(Arrays.asList(0, 4));

    private static final String[] friends = new String[]{
            "Toquehead",
            "Sean",
    };

    private static int[] userLibrary = new int[]{0, 50};
    // Too much work to write separate libraries for all friends. Instead books are referenced by id
    //  (array position). the two values are the start and end of each friend's book list
    private static int[][] friendLibrary = new int[][]{ {50, 100}, {100, 150} };

    //
    // Book status identifiers
    //

    public static BookStatus getStatus(String title) {
        BookStatus status = BookStatus.OnShelf;

        if (isBookLent(title))
            status = BookStatus.Lent;
        else if (isBookBorrowed(title))
            status = BookStatus.Borrowed;
        else if (isBookRequested(title))
            status = BookStatus.Requested;
        else if (isBookInRequests(title))
            status = BookStatus.InRequests;
        else if (getBookID(title) < 50)
            status = BookStatus.MyLibrary;
        return status;
    }

    public static int getBookID(String title) {
        int bookIndex = 0;

        while (bookIndex < titles.length && !titles[bookIndex].equals(title)) {
            bookIndex++;
        }

        return bookIndex;
    }
>>>>>>> origin/Development

    public static boolean isBookInRequests(String title) {
        boolean isIt = false;
        Request compTo = new Request(getBookID(title), null, null, null, null);
        for(int i=0; i<requests.size() && !isIt; i++) {
            if(requests.get(i).compareTo(compTo) == 0)
                isIt = true;
        }
        return isIt;
    }

    public static boolean isBookRequested(String title) {
        boolean isIt = false;
        Request compTo = new Request(getBookID(title), null, null, null, null);
        for(int i=0; i<requested.size() && !isIt; i++) {
            if(requested.get(i).compareTo(compTo) == 0)
                isIt = true;
        }
        return isIt;
    }

    public static boolean isBookBorrowed(String title) {
        return borrowed.indexOf(getBookID(title)) != -1;
    }

    public static boolean isBookLent(String title) {
        return lent.indexOf(getBookID(title)) != -1;
    }

    public static void setButtonText(BookStatus status, Button requestButton) {
        switch (status) {
            case MyLibrary:
                requestButton.setText("Lend");
                break;
            case OnShelf:
                requestButton.setText("Request");
                break;
            case InRequests:
                requestButton.setText("Accept or Reject Request");
                break;
            case Requested:
                requestButton.setText("Cancel Request");
                break;
            case Borrowed:
                requestButton.setText("You are Borrowing");
                requestButton.setEnabled(false);
                break;
            case Lent:
                requestButton.setText("Unlend");
//                requestbutton.setEnabled(false);
                break;
        }
    }

    public static void addRequest(String title, String name, String location, String date, String message) {
        int bookIndex = getBookID(title);
        requests.add(new Request(bookIndex, name, location, date, message));
        Collections.sort(requests);
    }

    public static int getIndex(ArrayList<Request> arr, int index) {
        int result = -1;
        boolean done = false;
        for (int i = 0; i < arr.size() && !done; i++) {
            if (arr.get(i).bookIndex == index) {
                result = i;
                done = true;
            }
        }
        return result;
    }

    public static void acceptRequest(int index) {
        int i = getIndex(requests, index);
        addLent(requests.get(i).bookIndex);
        requests.remove(i);
    }

    public static void rejectRequest(int index) {
        requests.remove(getIndex(requests, index));
    }

    public static void addRequested(String title, String location, String date, String message) {
        int bookIndex = getBookID(title);
        if (bookIndex < titles.length)
            requested.add(new Request(bookIndex, "User", location, date, message));
        Collections.sort(requested);
    }

    public static void cancelRequested(int index) {
        requested.remove(getIndex(requested, index));
    }

    public static void addBorrowed(int index) {
        borrowed.add(index);
        Collections.sort(borrowed);
    }

    public static void addLent(int index) {
        lent.add(index);
        Collections.sort(lent);
    }

    public static void unLend(int index) {
        lent.remove(lent.indexOf(index));
    }

    public static Request getRequest(int index) {
        return requests.get(getIndex(requests, index));
    }

    public static Bundle getRequests() {
        Bundle b = new Bundle();
<<<<<<< HEAD
        b.putString("bookTitle", titles[i]);
        b.putString("bookAuthor", authors[i]);
        b.putString("bookCover", covers[i]);
        b.putString("bookDescription", synopsiss[i]);
        b.putString("bookStatus", statuss[i]);  //TODO implement status in book detail view

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

=======
        Collections.sort(requests);
        String[] rTitles = new String[requests.size()];
        String[] rAuthors = new String[requests.size()];
        String[] rRequesters = new String[requests.size()];
        String[] rCovers = new String[requests.size()];

        for (int i = 0; i < requests.size(); i++) {
            rTitles[i] = titles[requests.get(i).bookIndex];
            rAuthors[i] = authors[requests.get(i).bookIndex];
            rRequesters[i] = "Requested from: " + requests.get(i).requester;
            rCovers[i] = covers[requests.get(i).bookIndex];
        }

        b.putStringArray("titles", rTitles);
        b.putStringArray("authors", rAuthors);
        b.putStringArray("requestFrom", rRequesters);
        b.putStringArray("covers", rCovers);
>>>>>>> origin/Development
        return b;
    }

    public static Bundle getRequested() {
        Bundle b = new Bundle();
        String[] rTitles = new String[requested.size()];
        String[] rAuthors = new String[requested.size()];
        String[] rCovers = new String[requested.size()];

        for (int i = 0; i < requested.size(); i++) {
            rTitles[i] = titles[requested.get(i).bookIndex];
            rAuthors[i] = authors[requested.get(i).bookIndex];
            rCovers[i] = covers[requested.get(i).bookIndex];
        }

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

        for (int i = 0; i < borrowed.size(); i++) {
            rTitles[i] = titles[borrowed.get(i)];
            rAuthors[i] = authors[borrowed.get(i)];
            rCovers[i] = covers[borrowed.get(i)];
        }

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

        for (int i = 0; i < lent.size(); i++) {
            rTitles[i] = titles[lent.get(i)];
            rAuthors[i] = authors[lent.get(i)];
            rCovers[i] = covers[lent.get(i)];
        }

        b.putStringArray("titles", rTitles);
        b.putStringArray("authors", rAuthors);
        b.putStringArray("covers", rCovers);
        return b;
    }

    public static String getFriendsName(int i) {
        return friends[i];
    }

    public static Bundle getUsersLibraryBundle() {

        Bundle usersLibraryBundle = new Bundle();
        int length = userLibrary[1] - userLibrary[0];
        if (!Globals.longLists)
            length /= 2;
        String[] userTitles = new String[length];
        String[] userAuthors = new String[length];
        String[] userCovers = new String[length];
        String[] userStatuss = new String[length];

        for (int i = userLibrary[0]; i < userLibrary[0] + length; i++) {
            userTitles[i - userLibrary[0]] = titles[i];
            userAuthors[i - userLibrary[0]] = authors[i];
            userCovers[i - userLibrary[0]] = covers[i];
        }

        usersLibraryBundle.putStringArray("titles", userTitles);
        usersLibraryBundle.putStringArray("authors", userAuthors);
        usersLibraryBundle.putStringArray("covers", userCovers);
        usersLibraryBundle.putStringArray("statuss", userStatuss);

        return usersLibraryBundle;
    }

    // Return a bundle array containing string array of book info
    public static Bundle getFriendsLibraryBundle(int friendIndex) {
        Bundle friendsLibraryBundle = new Bundle();
        int length = friendLibrary[friendIndex][1] - friendLibrary[friendIndex][0];
        if (!Globals.longLists)
            length /= 2;
        String[] friendTitles = new String[length];
        String[] friendAuthors = new String[length];
        String[] friendCovers = new String[length];

        for (int i = friendLibrary[friendIndex][0]; i < friendLibrary[friendIndex][0] + length; i++) {
            friendTitles[i - friendLibrary[friendIndex][0]] = titles[i];
            friendAuthors[i - friendLibrary[friendIndex][0]] = authors[i];
            friendCovers[i - friendLibrary[friendIndex][0]] = covers[i];
        }

        friendsLibraryBundle.putStringArray("titles", friendTitles);
        friendsLibraryBundle.putStringArray("authors", friendAuthors);
        friendsLibraryBundle.putStringArray("covers", friendCovers);

        return friendsLibraryBundle;
    }

<<<<<<< HEAD
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
=======
    // This is used to retrieve complete data for DetailActivity
    public static Bundle getBookBundle(int i) {
        Bundle b = new Bundle();
        b.putString("bookTitle", titles[i]);
        b.putString("bookAuthor", authors[i]);
        b.putString("bookCover", covers[i]);
        b.putString("bookSynopsis", synopsiss[i]);

        //get owner string
        for (int j = 0; j < friendLibrary.length; j++) {
            if (friendLibrary[j][0] <= i && friendLibrary[j][1] >= i) {
                b.putString("bookOwner", friends[j]);
            }
        }
        return b;
    }

    public static Bundle getBookBundle(String title) {
        Bundle b = null;
        int i = 0;
        while (i < titles.length && !titles[i].equals(title)) {
            i++;
        }

        if (i < titles.length) {
            b = getBookBundle(i);
        }

        return b;
>>>>>>> origin/Development
    }

    public static String[] getFriends() {
        return friends;
    }

    public static int[] getNumBooks() {
        int[] numBooks = new int[friends.length];
        for (int i = 0; i < friends.length; i++) {
            numBooks[i] = friendLibrary[i][1] - friendLibrary[i][0];
            if (!Globals.longLists) {
                numBooks[i] /= 2;
            }
        }
        return numBooks;
    }
}