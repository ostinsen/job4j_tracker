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
        //throw new UnsupportedOperationException();
    return new EasyStream(source);
    }

    public EasyStream map(Function<Integer, Integer> fun) {
       // throw new UnsupportedOperationException();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < this.list.size(); i++) {
            list2.add(fun.apply(this.list.get(i)));
        }
        return new EasyStream(list2);
    }

    public EasyStream filter(Predicate<Integer> fun) {
       // throw new UnsupportedOperationException();
        List<Integer> list3 = new ArrayList<>();
        for (Integer i : this.list){
           if (fun.test(i)){
               list3.add(i);
           } else {
               continue;
           }
        }
        return new EasyStream(list3);
    }

    public List<Integer> collect() {
        //throw new UnsupportedOperationException();
        return List.copyOf(this.list);
    }
}
