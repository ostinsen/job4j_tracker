package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;


public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void showAllItem(Input input, Tracker tracker) {
        System.out.println("=== 1. Show all items ====");
        Item[] items = tracker.findAll();
        for (Item it : items){
            System.out.println(it);
        }
    }
    public static void editItem(Input input, Tracker tracker) {
        System.out.println("=== 2. Edit item ====");
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
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== 3. Delete item ====");
        int id = Integer.valueOf(input.askStr("Enter id: "));
        if (tracker.delete(id)) {
            // вывод об успешности операции
            System.out.println("Удаление прошло успешно ");
        } else {
            // вывод об ошибке
            System.out.println(" id не найдено");
        }
    }

    public static void findIdItem(Input input, Tracker tracker) {
        System.out.println("=== 4. Find item by Id ====");
        int id = Integer.valueOf(input.askStr("Enter id: "));

        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("Заявка с таким id  найдена: " + item);
        } else {
            System.out.println("Заявка с таким id не найдена");
        }
    }

    public static void findNameItem(Input input, Tracker tracker) {
        System.out.println("=== 5. Find items by name ====");
        String name = input.askStr("Enter name: ");
        Item[] itemsName = tracker.findByName(name);
        if (itemsName.length != 0){
            for (Item item : itemsName) {
                System.out.println(item);
            }
        } else {
            System.out.println("Заявки с таким именем не найдены");
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            //System.out.print("Select: ");
            int select = Integer.valueOf(input.askStr("Select: "));
            if (select == 0) {

                StartUI.createItem(input, tracker);

            } else if (select == 1) {

                StartUI.showAllItem(input, tracker);

            } else if (select == 2) {

                StartUI.editItem(input, tracker);

            } else if (select == 3) {

                StartUI.deleteItem(input, tracker);

            } else if (select == 4) {

                StartUI.findIdItem(input, tracker);

            } else if (select == 5) {

                StartUI.findNameItem(input, tracker);

            }
            else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
        /* добавить остальные пункты меню. */
    }


    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
