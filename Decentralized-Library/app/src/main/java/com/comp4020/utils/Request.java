package com.comp4020.utils;

/**
 * Created by Giygas on 19/03/2015.
 */
public class Request implements Comparable {
    public int bookIndex;
    public String requester;
    public String location;
    public String date;
    public String message;

    public Request(int bookIndex, String requester, String location, String date, String message)
    {
        this.bookIndex = bookIndex;
        this.requester = requester;
        this.location = location;
        this.date = date;
        this.message = message;
    }

    @Override
    public int compareTo(Object another) {
        if (another instanceof Request)
            return ((Request)another).bookIndex - bookIndex;
        return 0;
    }
}
