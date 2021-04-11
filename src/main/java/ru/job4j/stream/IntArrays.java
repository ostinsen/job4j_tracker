package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntArrays {
    public static List<Integer> intsToList(Integer[][] array){
        List<List<Integer>> list = new ArrayList<>();
        for (Integer[] arr: array){
            list.add(Arrays.asList(arr));
        }
        return list.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
//        return Arrays.stream(array)
//                .flatMap(e -> Arrays.stream(e))
//                .collect(Collectors.toList());
    }
}
