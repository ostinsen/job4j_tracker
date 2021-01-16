package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);

            } else if (select == 1) {
                System.out.println("=== 1. Show all items ====");
                Item[] items = tracker.findAll();
                for (Item it : items){
                    System.out.println(it.toString());
                }

            } else if (select == 2) {
                System.out.println("=== 2. Edit item ====");
                System.out.println("Enter id: ");
                int id = Integer.valueOf(scanner.nextLine());
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);

                if (tracker.replace(id, item)) {
                    // вывод об успешности операции
                    System.out.println("Замена прошла успешно " + tracker.findById(id).getId() + " " + tracker.findById(id).getName());

                } else {
                    // вывод об ошибке
                    System.out.println(" id не найдено");
                }
            } else if (select == 3) {
                System.out.println("=== 3. Delete item ====");
                System.out.println("Enter id: ");
                int id = Integer.valueOf(scanner.nextLine());

                if (tracker.delete(id)) {
                    // вывод об успешности операции
                    System.out.println("Удаление прошло успешно ");
                } else {
                    // вывод об ошибке
                    System.out.println(" id не найдено");
                }
            } else if (select == 4) {
                System.out.println("=== 4. Find item by Id ====");
                System.out.println("Enter id: ");
                int id = Integer.valueOf(scanner.nextLine());

                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println("Заявка с таким id  найдена: " + item.getId() + " " + item.getName());
                } else {
                    System.out.println("Заявка с таким id не найдена");
                }
            } else if (select == 5) {
                System.out.println("=== 5. Find items by name ====");
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                Item[] itemsName = tracker.findByName(name);
                if( itemsName.length != 0){
                    for (Item item : itemsName ) {
                        System.out.println(item.toString());
                    }
                } else {
                    System.out.println("Заявки с таким именем не найдены");
                }
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
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
