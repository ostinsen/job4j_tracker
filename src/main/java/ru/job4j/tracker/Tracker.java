package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
    public Item[] findAll(){
        Item[] itemsAll = Arrays.copyOf(items, size);
            return itemsAll;
    }

    public Item[] findByName (String key){
        int count = 0;
        Item[] itemsName = new Item[100];
        for (int i = 0; i < items.length; i++) {
            if (items[i].getName().equals(key)){
                itemsName[count++] = items[i];
            }
            itemsName = Arrays.copyOf(itemsName, count);
        }
        return itemsName;
    }

}