package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void max() {
        int first = 1;
        int second = 2;
        int expected = 2;
        int rsl = Max.max(first, second);
        assertThat(rsl, is(expected));
    }

    @Test
    public void testMax() {
        int first = 1;
        int second = 2;
        int third = 3;
        int expected = 3;
        int rsl = Max.max(first, second, third);
        assertThat(rsl, is(expected));
    }

    @Test
    public void testMax1() {
        int first = 1;
        int second = 2;
        int third = 3;
        int fourth = 5;
        int expected = 5;
        int rsl = Max.max(first, second, third, fourth);
        assertThat(rsl, is(expected));
    }

    @Test
    public void testMax2() {
        int rsl = Max.max(50, 0, 10, -2);
        assertThat(rsl, is(50));
    }

}