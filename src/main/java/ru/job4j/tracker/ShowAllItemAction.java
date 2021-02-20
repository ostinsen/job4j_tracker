package ru.job4j.tracker;

import java.util.List;

public class ShowAllItemAction implements UserAction {
//    private final Output out;
//
//    public ShowAllItemAction(Output out) {
//        this.out = out;
//    }
//    @Override
//    public String name() {
//        return "=== 1. Show all items ====";
//    }
//
//    @Override
//    public boolean execute (Input input, Tracker tracker) {
//        Item[] items = tracker.findAll();
//        for (Item it : items) {
//            out.println(it);
//        }
//        return true;
//    }

    private final Output out;

    public ShowAllItemAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "=== 1. Show all items ====";
    }

    @Override
    public boolean execute (Input input, Tracker tracker) {
       List<Item> items = tracker.findAll();
        for (Item it : items) {
            out.println(it);
        }
        return true;
    }
}
