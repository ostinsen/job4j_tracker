package ru.job4j.tracker;

import java.util.List;

public class FindNameItemAction implements UserAction {
//    private final Output out;
//
//    public FindNameItemAction(Output out) {
//        this.out = out;
//    }
//
//    @Override
//    public String name() {
//        return "=== 5. Find items by name ====";
//    }
//
//    @Override
//    public boolean execute(Input input, Tracker tracker) {
//        String name = input.askStr("Enter name: ");
//        Item[] itemsName = tracker.findByName(name);
//        if (itemsName.length != 0){
//            for (Item item : itemsName) {
//                out.println(item);
//            }
//        } else {
//            out.println("Заявки с таким именем не найдены");
//        }
//        return true;
//    }

    private final Output out;

    public FindNameItemAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== 5. Find items by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        List<Item> itemsName = tracker.findByName(name);
        if (itemsName.size() != 0){
            for (Item item : itemsName) {
                out.println(item);
            }
        } else {
            out.println("Заявки с таким именем не найдены");
        }
        return true;
    }
}
