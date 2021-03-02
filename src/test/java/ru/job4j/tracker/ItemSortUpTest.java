package ru.job4j.tracker;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ItemSortUpTest {

    @Test
    public void compareUp() {

        Tracker tracker = Tracker.getInstance();
        tracker.add(new Item("1aaa"));
        tracker.add(new Item("2aaa"));
        tracker.add(new Item("4aaa"));
        tracker.add(new Item("3aaa"));
        tracker.add(new Item("7aaa"));
        tracker.add(new Item("5aaa"));
        tracker.add(new Item("6aaa"));
        Collections.sort(tracker.findAll(), new ItemSortUp());
        List<Item> expected = Arrays.asList(
                new Item(1, "1aaa"),
                new Item(2, "2aaa"),
                new Item(4, "3aaa"),
                new Item(3, "4aaa"),
                new Item(6, "5aaa"),
                new Item(7, "6aaa"),
                new Item(5, "7aaa")
        );
       assertThat(tracker.findAll(), is(expected));
    }

    @Test
    public void compareDown() {

        Tracker tracker = Tracker.getInstance();
        tracker.add(new Item("1aaa"));
        tracker.add(new Item("2aaa"));
        tracker.add(new Item("4aaa"));
        tracker.add(new Item("3aaa"));
        tracker.add(new Item("7aaa"));
        tracker.add(new Item("5aaa"));
        tracker.add(new Item("6aaa"));
        Collections.sort(tracker.findAll(), new ItemSortDown());
        List<Item> expected = Arrays.asList(
                new Item(5, "7aaa"),
                new Item(7, "6aaa"),
                new Item(6, "5aaa"),
                new Item(3, "4aaa"),
                new Item(4, "3aaa"),
                new Item(2, "2aaa"),
                new Item(1, "1aaa")
        );
        assertThat(tracker.findAll(), is(expected));
    }
}