package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {

        int len = Math.max(left.length(), right.length());

        int rsl = 0;

        for (int i = 0; i < len; i++) {
            if (i != right.length() && i != left.length()) {
                char leftChar = left.charAt(i);
                char rightChar = right.charAt(i);
                rsl = Character.compare(leftChar, rightChar);
                if (rsl != 0) {
                    break;
                }
            }
            else {
                rsl = left.length() > right.length() ? 1 : -1;
                break;
            }
        }
        return rsl;
    }
}
