package ru.job4j.tracker;

import java.util.*;

public class Tracker {

private static Tracker instance = null;

    private List<Item> items = new ArrayList<>();
    private int ids = 1;

    private Tracker(){

    }

    public static Tracker getInstance() {
        if (instance == null) {
            instance = new Tracker();
        }
        return instance;
    }

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < items.size(); index++) {
            Item item = items.get(index);
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
    public List<Item> findAll(){
        return  items;
    }

    public List<Item> findByName(String key){
        List<Item> itemsName = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getName().equals(key)){
                itemsName.add(items.get(i));
            }
        }
        return itemsName;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace (int id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl){
            item.setId(id);
            items.set(index, item);
        }
        return rsl;
    }

    public boolean delete(int id) {
        int ind = indexOf(id);
        boolean rsl = ind != -1;
        if (rsl){
            items.remove(ind);
        }
        return rsl;
    }
    }

