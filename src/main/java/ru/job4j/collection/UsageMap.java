package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("parsentev@yandex.ru", "Petr Arsentev");
        map.put("parsentev@yandex.", "Petr Arsent");
        map.put("parsentev@yande", "Petr Arse");
        map.put("parsentev@yan", "Petr Ar");

        for (String key : map.keySet()){
            String value = map.get(key);
            System.out.println(key + ": " + value);
        }
    }
}
