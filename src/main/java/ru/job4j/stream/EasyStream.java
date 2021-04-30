package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.function.Function;
import java.util.function.Predicate;

public class EasyStream {

    private List<Integer> list;

    private EasyStream(List<Integer> list) {
        this.list = list;
    }

    public static EasyStream of(List<Integer> source) {

    return new EasyStream(source);
    }

    public EasyStream map(Function<Integer, Integer> fun) {

        List<Integer> list2 = new ArrayList<>();
        for (Integer i  : list) {
            list2.add(fun.apply(i));
        }
        return new EasyStream(list2);
    }

    public EasyStream filter(Predicate<Integer> fun) {

        List<Integer> list3 = new ArrayList<>();
        for (Integer i : this.list) {
            if (fun.test(i)) {
               list3.add(i);
           }
        }
        return new EasyStream(list3);
    }

    public List<Integer> collect() {

        return List.copyOf(this.list);
    }
}
