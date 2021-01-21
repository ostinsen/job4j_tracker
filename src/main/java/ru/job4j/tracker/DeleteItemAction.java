package ru.job4j.tracker;

public class DeleteItemAction implements UserAction{
    private final Output out;

    public DeleteItemAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== 3. Delete item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {

        int id = Integer.valueOf(input.askStr("Enter id: "));
        if (tracker.delete(id)) {
            // вывод об успешности операции
            System.out.println("Удаление прошло успешно ");
        } else {
            // вывод об ошибке
            System.out.println(" id не найдено");
        }
        return true;
    }
}
