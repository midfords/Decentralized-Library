package comp4020.buchbook.utils;

/**
 * Created by jeff on 15-03-11.
 */
import android.os.Bundle;

public class Data {

    //
    // Book data
    //

    private static final String[] titles = new String[] {
            "Dresden Files Skin Game",
            "Watchmen",
            "V For Vendetta",
            "V For Vendetta1",
            "V For Vendetta2",
            "V For Vendetta3",
            "V For Vendetta4",
            "V For Vendetta5",
            "V For Vendetta6"
    };

    private static final String[] authors = new String[] {
            "Jim Butcher",
            "Alan Moore",
            "Alan Moore",
            "Alan Moore",
            "Alan Moore",
            "Alan Moore",
            "Alan Moore",
            "Alan Moore",
            "Alan Moore"
    };

    private static final String[] covers = new String[] {
            "djskalfj",
            "huerdiop",
            "jowlkcui",
            "jowlkcui",
            "jowlkcui",
            "jowlkcui",
            "jowlkcui",
            "jowlkcui",
            "jowlkcui"
    };

    private static final String[] genres = new String[] {
            "Fantasy",
            "Comic",
            "Genre",
            "Genre",
            "Genre",
            "Genre",
            "Genre",
            "Genre",
            "Genre"
    };

    private static final String[] years = new String[] {
            "2014",
            "1986",
            "Year",
            "Year",
            "Year",
            "Year",
            "Year",
            "Year",
            "Year"
    };

    private static final String[] publishers = new String[] {
            "Publisher",
            "DC Comics",
            "Publisher",
            "Publisher",
            "Publisher",
            "Publisher",
            "Publisher",
            "Publisher",
            "Publisher"
    };

    private static final String[] synopsiss = new String[] {
            "Harry Dresden, Chicago’s only professional wizard, is about to have a very bad day….\n" +
                    "\n" +
                    "Because as Winter Knight to the Queen of Air and Darkness, Harry never knows what the scheming Mab might want him to do. Usually, it’s something awful.\n" +
                    "\n" +
                    "He doesn’t know the half of it….\n" +
                    "\n" +
                    "Mab has just traded Harry’s skills to pay off one of her debts. And now he must help a group of supernatural villains—led by one of Harry’s most dreaded and despised enemies, Nicodemus Archleone—to break into the highest-security vault in town so that they can then access the highest-security vault in the Nevernever.\n" +
                    "\n" +
                    "It’s a smash-and-grab job to recover the literal Holy Grail from the vaults of the greatest treasure hoard in the supernatural world—which belongs to the one and only Hades, Lord of the freaking Underworld and generally unpleasant character. Worse, Dresden suspects that there is another game afoot that no one is talking about. And he’s dead certain that Nicodemus has no intention of allowing any of his crew to survive the experience. Especially Harry.\n" +
                    "\n" +
                    "Dresden’s always been tricky, but he’s going to have to up his backstabbing game to survive this mess—assuming his own allies don’t end up killing him before his enemies get the chance….",
            "\"Watchmen\" is set in an alternate 1985 America in which costumed superheroes are part of the fabric of everyday society, and the \"Doomsday Clock\" -- which charts the USA's tension with the Soviet Union -- is permanently set at five minutes to midnight. When one of his former colleagues is murdered, the masked vigilante Rorschach, washed up but determined, sets out to uncover a plot to kill and discredit all past and present superheroes. As he reconnects with his former crime-fighting legion -- a ragtag group of retired superheroes, only one of whom has true powers -- Rorschach glimpses a wide-ranging and disturbing conspiracy with links to their shared past and catastrophic consequences for the future. Their mission is to watch over humanity... but who is watching the Watchmen?",
            "Synopsis",
            "Synopsis",
            "Synopsis",
            "Synopsis",
            "Synopsis",
            "Synopsis",
            "Synopsis"
    };

    // Statusses are not final because we will change them as lending actions happen
    private static String[] statuss = new String[] {
            "On Shelf",
            "Lent",
            "Lent",
            "On Shelf",
            "On Shelf",
            "On Shelf",
            "On Shelf",
            "On Shelf",
            "On Shelf"
    };

    //
    // Owner and friends data
    //

    private static final String[] owners = new String[] {
            "Sean",
            "Sean",
            "Sean",
            "Gerald",
            "Gerald",
            "Harriet",
            "Harriet",
            "Harriet",
            "Billy Joe"
    };

    // TODO: This can be removed since friendsLibrary contains length info
    //  leave in for now.
    private static final int[] numBooks = new int[] {
            3, 6, 2, 7, 8, 3, 6, 4, 1
    };

    // Too much work to write separate libraries for all friends. Instead books are referenced by id
    //  (array position)
    private static int[][] friendLibrary = new int[][] {
            {5, 7, 3},
            {1, 3, 5, 4, 7, 8},
            {2, 3},
            {0, 8, 5, 4, 2, 6, 5},
            {4, 3, 6, 5, 7, 8, 2, 0},
            {1, 0, 5},
            {5, 7, 6, 8, 4, 3, 2},
            {3, 8, 0, 7},
            {0}
    };

    public static String getOwnersName(int i) {
        return owners[i];
    }

    // Return a bundle array containing string array of book info
    public static Bundle getFriendsLibraryBundle(int friendIndex)
    {
        Bundle friendsLibraryBundle = new Bundle();
        String[] friendTitles = new String[friendLibrary[friendIndex].length];
        String[] friendAuthors = new String[friendLibrary[friendIndex].length];
        String[] friendCovers = new String[friendLibrary[friendIndex].length];

        for(int i = 0; i < friendLibrary[friendIndex].length; i++)
        {
            friendTitles[i] = titles[friendLibrary[friendIndex][i]];
            friendAuthors[i] = authors[friendLibrary[friendIndex][i]];
            friendCovers[i] = covers[friendLibrary[friendIndex][i]];
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
        b.putString("bookOwner", owners[i]);
        b.putString("bookDescription", synopsiss[i]);
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

    public static String[] getOwners() {
        return owners;
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