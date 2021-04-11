package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class IntArraysTest {

    @Test
    public void ints() {
        Integer[][] array = {
                {1, 2, 3},
                {4, 5, 6, 7},
                {8, 9},
                {10}
        };
        List<Integer> exp = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> rsl = IntArrays.intsToList(array);
        assertThat(rsl, is(exp));
    }
}