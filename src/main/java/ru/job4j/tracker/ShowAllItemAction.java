package ru.job4j.tracker;

public class ShowAllItemAction implements UserAction {
    @Override
    public String name() {
        return "=== 1. Show all items ====";
    }

    @Override
    public boolean execute (Input input, Tracker tracker) {
        Item[] items = tracker.findAll();
        for (Item it : items) {
            System.out.println(it);
        }
        return true;
    }
}
