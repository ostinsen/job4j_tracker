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
        return  Arrays.copyOf(items, size);
    }

    public Item[] findByName (String key){
        int count = 0;
        Item[] itemsName = new Item[100];
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(key)){
                itemsName[count++] = items[i];
            }
        }
        return Arrays.copyOf(itemsName, count);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace (int id, Item item) {
        boolean rsl = false;
        int index = indexOf(id);
        if (index != -1){
            item.setId(id);
            items[index] = item;
            rsl = true;
        }
        return rsl;
    }

    public boolean delete(int id) {
            boolean rsl = false;
            int ind = indexOf(id);
            if (ind != -1){
            items[ind] = null;
            rsl = true;
            System.arraycopy(items, ind + 1, items, ind, size - ind);
                items[size - 1] = null;
                size--;
          }
        return rsl;
        }
    }

