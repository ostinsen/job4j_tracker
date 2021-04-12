package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntArrays {
    public static List<Integer> intsToList(Integer[][] array){

        return Arrays.stream(array)
                .flatMap(e -> Arrays.stream(e))
                .collect(Collectors.toList());
    }
}
