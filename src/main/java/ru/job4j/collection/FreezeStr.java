package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class FreezeStr {
    public static boolean eq(String left, String right) {

       char[] leftArr = left.toCharArray();
       char[] rightArr = right.toCharArray();
       Map<Character, Integer> map = new HashMap<>();
       for (int i = 0; i < leftArr.length; i++) {
           if (!map.containsKey(leftArr[i])){
               map.put(leftArr[i], 1);
           } else {
               map.computeIfPresent(leftArr[i], (key, value) -> value + 1);
           }
        }
        for (int i = 0; i < rightArr.length; i++) {
            char c = rightArr[i];
            if (map.containsKey(c)) {
                if (map.get(c) > 1){
                    map.put(c, map.get(c) - 1);
                } else if (map.get(c) == 1){
                    map.remove(c);
                }
            }
        }
        return map.isEmpty();
    }
}
