package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analyze {
    public static double averageScore(Stream<Pupil> stream) {
        return stream.flatMap(t -> t.getSubjects().stream())
                .mapToInt(s -> s.getScore()).average().orElse(0.0D);
    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {

        return stream.map(p -> new Tuple(p.getName(), p.getSubjects()
                .stream().mapToInt(s -> s.getScore())
                .average().orElse(0.0))).collect(Collectors.toList());

    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {

        return stream.flatMap(s -> s.getSubjects()
                .stream())
                .collect(Collectors.groupingBy(s -> s.getName(), Collectors.averagingDouble(r -> r.getScore())))
                .entrySet()
                .stream().map(k -> new Tuple(k.getKey(), k.getValue()))
                .collect(Collectors.toList());


    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream.map(p -> new Tuple(p.getName(), p.getSubjects()
                .stream()
                .mapToInt(s -> s.getScore()).sum())).max(Comparator.comparingDouble(Tuple::getScore)).orElse(null);
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {

        return stream.flatMap(s -> s.getSubjects()
                .stream())
                .collect(Collectors.groupingBy(s -> s.getName(), Collectors.summingDouble(r -> r.getScore())))
                .entrySet()
                .stream().map(k -> new Tuple(k.getKey(), k.getValue()))
                .max(Comparator.comparingDouble(Tuple::getScore)).orElse(null);
    }
}
