package com.comp4020.data_classes;

import com.comp4020.data_classes.Library;
/**
 * Created by jeff on 15-03-11.
 */
public class Friends {
    public final String[] names;
    public final int[] numBooks;

    public Friends() {
        names = new String[] {
                "Gerald",
                "Harriet",
                "Billy Joe",
                "Aled"};
        numBooks = new int[]{2, 3, 1, 0};
    }

    public String[] getFriendsList() {
        return names;
    }
}
