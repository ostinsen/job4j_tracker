package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Diapason {
    List<Double> diapason(int start, int end, Function<Double, Double> func){
        List<Double> list = new ArrayList<>();
        for (int i = start; i < end; i++) {
           list.add(func.apply((double) i));
        }
            return list;
    }

    Function<Double, Double> funcLiner = x -> 2 * x + 1;
    Function<Double, Double> funcSquare = x -> x * x;
    Function<Double, Double> funcExp = x -> Math.pow(2.0, x);
}
