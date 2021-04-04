package ru.job4j.collection;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                if (start.equals("")){
                    start = start + el;
                    tmp.add(start);
                } else {
                    start = start + "/" + el;
                    tmp.add(start);
                }
            }
        }
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
    Collections.sort(orgs, Comparator.naturalOrder());
        System.out.println(orgs);
    }

    public static void sortDesc(List<String> orgs) {
            Collections.sort(orgs, new DepDescComp());
        System.out.println(orgs);
    }



    public static void main(String[] args) {
      sortAsc(Departments.fillGaps(Arrays.asList("K1/SK1/SSK1", "K2/SK1/SSK2")));
      sortDesc(Departments.fillGaps(Arrays.asList("K1/SK1/SSK1", "K2/SK1/SSK2")));

    }
}
