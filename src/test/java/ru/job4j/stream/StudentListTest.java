package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class StudentListTest {
    @Test
    public void convertTMap() {
        List<Student> students = Arrays.asList(
                new Student(1, "Jane"),
                new Student(2, "Bush"),
                new Student(4, "Obama"),
                new Student(3, "Trump"),
                new Student(4, "Obama"),
                new Student(2, "Bush"),
                new Student(5, "Bayden")
        );
        Map<String, Student> exp = Map.of(
                "Jane", new Student(1, "Jane"),
                "Bush", new Student(2, "Bush"),
                "Obama", new Student(4, "Obama"),
                "Trump", new Student(3, "Trump"),
                "Bayden", new Student(5, "Bayden")
        );
        Map<String, Student> rsl = new StudentList().convertToMap(students);
        assertThat(exp, is(rsl));
    }
}