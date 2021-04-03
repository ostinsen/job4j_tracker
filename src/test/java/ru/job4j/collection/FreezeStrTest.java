package ru.job4j.collection;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FreezeStrTest {
    @Test
    public void whenEq() {
        assertThat(FreezeStr.eq("Hello", "Hlloe"), CoreMatchers.<Boolean>is(true));
    }
    @Test
    public void whenEq1() {
        assertThat(FreezeStr.eq("Hello", "oellH"), CoreMatchers.<Boolean>is(true));
    }

    @Test
    public void whenNotEq() {
        assertThat(FreezeStr.eq("Hello", "Halle"), is(false));
    }

    @Test
    public void whenNotMultiEq() {
        assertThat(FreezeStr.eq("heloo", "hello"), is(false));
    }

}