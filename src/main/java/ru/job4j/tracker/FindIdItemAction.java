package ru.job4j.tracker;

public class FindIdItemAction implements UserAction {
    private final Output out;

    public FindIdItemAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== 4. Find item by Id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {

        int id = Integer.valueOf(input.askStr("Enter id: "));

        Item item = tracker.findById(id);
        if (item != null) {
            out.println("Заявка с таким id  найдена: " + item);
        } else {
            out.println("Заявка с таким id не найдена");
        }
        return true;
    }
}
