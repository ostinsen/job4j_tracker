package ru.job4j.tracker;

public class FindNameItemAction implements UserAction {
    @Override
    public String name() {
        return "=== 5. Find items by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item[] itemsName = tracker.findByName(name);
        if (itemsName.length != 0){
            for (Item item : itemsName) {
                System.out.println(item);
            }
        } else {
            System.out.println("Заявки с таким именем не найдены");
        }
        return true;
    }
}
