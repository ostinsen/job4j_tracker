package ru.job4j.tracker;

public class FindIdItemAction implements UserAction {
    @Override
    public String name() {
        return "=== 4. Find item by Id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {

        int id = Integer.valueOf(input.askStr("Enter id: "));

        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("Заявка с таким id  найдена: " + item);
        } else {
            System.out.println("Заявка с таким id не найдена");
        }
        return true;
    }
}
