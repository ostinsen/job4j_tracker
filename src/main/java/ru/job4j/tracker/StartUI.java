package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {

    public static void main (String[] args) {
        Item item = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
       String dateNow = item.getCreated().format(formatter);
       // System.out.println(dateNow);

        Tracker tracker  = new Tracker();
        tracker.add(new Item(10, "massa"));
        tracker.add(item);
        Item it = tracker.findById(1);
        //System.out.println(it.getId() + " " + it.getName());

        Item item2 = new Item(1234, "Example2");
        System.out.println(item2.toString());
    }
}
