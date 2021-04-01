package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Article {
    public static boolean generateBy(String origin, String line) {
        origin = origin.toLowerCase().replaceAll("\\p{Punct}", "");
        line = line.toLowerCase().replaceAll("\\p{Punct}", "");

        String[] originArr = origin.split(" ");
        String[] lineArr = line.split(" ");
        Set<String> originSet = new HashSet<>(Arrays.asList(originArr));
        Set<String> lineSet = new HashSet<>(Arrays.asList(lineArr));
        Iterator iteratorLine = lineSet.iterator();
        while (iteratorLine.hasNext()){
            if (!originSet.contains(iteratorLine.next())){
                return false;
            }
        }
        return true;
    }
}
