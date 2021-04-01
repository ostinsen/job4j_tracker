package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class FreezeStr {
    public static boolean eq(String left, String right) {

        String[] leftArr = left.split("");
        String[] rightArr = right.split("");
        Map<String, Integer> leftMap = mapIn(leftArr);
        Map<String, Integer> rightMap = mapIn(rightArr);

        return leftMap.equals(rightMap);
    }
   public static Map<String, Integer> mapIn(String[] array){
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], 0);
            int count = 1;
            for (int j = 0; j < array.length; j++) {
                if (array[i].equals(array[j])){
                    map.put(array[i], count++);
                }
            }
        }
        return map;
    }
}
