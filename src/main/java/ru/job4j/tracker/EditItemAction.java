package ru.job4j.tracker;

public class EditItemAction implements UserAction {
    @Override
    public String name() {
        return "=== 2. Edit item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {

        int id = Integer.valueOf(input.askStr("Enter id: "));
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);

        if (tracker.replace(id, item)) {
            // вывод об успешности операции
            System.out.println("Замена прошла успешно " + item);

        } else {
            // вывод об ошибке
            System.out.println(" id не найдено");
        }
        return true;
    }
}
