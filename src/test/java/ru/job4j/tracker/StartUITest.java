package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class StartUITest {

//@Test
//public void whenExit() {
//    Output out = new StubOutput();
//    Input in = new StubInput(
//            new String[] {"0"}
//    );
//    Tracker tracker = Tracker.getInstance();
//    UserAction[] actions = {
//            new ExitAction()
//    };
//    new StartUI(out).init(in, tracker, actions);
//    assertThat(out.toString(), is(
//            "Menu." + System.lineSeparator() +
//                    "0. Exit" + System.lineSeparator()
//    ));
//}
//    @Test
//    public void whenShowAllAction() {
//        Output out = new StubOutput();
//        Input in = new StubInput(
//                new String[] {"0", "1"}
//        );
//        Tracker tracker = Tracker.getInstance();
//        UserAction[] actions = {
//                new ShowAllItemAction(out),
//                new ExitAction()
//        };
//        new StartUI(out).init(in, tracker, actions);
//        assertThat(out.toString(), is(
//                "Menu." + System.lineSeparator() +
//                        "0. === 1. Show all items ====" + System.lineSeparator() +
//                        "1. Exit" + System.lineSeparator() +
//                        "Menu." + System.lineSeparator() +
//                        "0. === 1. Show all items ====" + System.lineSeparator() +
//                        "1. Exit" + System.lineSeparator()
//        ));
//    }
//    @Test
//    public void whenFindByName() {
//        Output out = new StubOutput();
//        Input in = new StubInput(
//                new String[] {"0", "first", "1"}
//        );
//        Tracker tracker = Tracker.getInstance();
//        UserAction[] actions = {
//                new FindNameItemAction(out),
//                new ExitAction()
//        };
//        new StartUI(out).init(in, tracker, actions);
//        assertThat(out.toString(), is(
//                "Menu." + System.lineSeparator() +
//                        "0. === 5. Find items by name ====" + System.lineSeparator() +
//                        "1. Exit" + System.lineSeparator() +
//                        "Заявки с таким именем не найдены" + System.lineSeparator() +
//                        "Menu." + System.lineSeparator() +
//                        "0. === 5. Find items by name ====" + System.lineSeparator() +
//                        "1. Exit" + System.lineSeparator()
//        ));
//    }
//
//    @Test
//    public void whenFindByIdAction() {
//        Output out = new StubOutput();
//        Input in = new StubInput(
//                new String[] {"0", "9", "1"}
//        );
//        Tracker tracker = Tracker.getInstance();
//        UserAction[] actions = {
//                new FindIdItemAction(out),
//                new ExitAction()
//        };
//        new StartUI(out).init(in, tracker, actions);
//        assertThat(out.toString(), is(
//                "Menu." + System.lineSeparator() +
//                        "0. === 4. Find item by Id ====" + System.lineSeparator() +
//                        "1. Exit" + System.lineSeparator() +
//                        "Заявка с таким id не найдена" + System.lineSeparator() +
//                        "Menu." + System.lineSeparator() +
//                        "0. === 4. Find item by Id ====" + System.lineSeparator() +
//                        "1. Exit" + System.lineSeparator()
//        ));
//    }
//    @Test
//    public void whenInvalidExit() {
//        Output out = new StubOutput();
//        Input in = new StubInput(
//                new String[] { "7", "0" }
//        );
//        Tracker tracker = Tracker.getInstance();
//        UserAction[] actions = {
//                new ExitAction()
//        };
//        new StartUI(out).init(in, tracker, actions);
//        assertThat(out.toString(), is(
//                String.format(
//                        "Menu.%n"
//                                + "0. Exit%n"
//                                + "Wrong input, you can select: 0 .. 0%n"
//                                + "Menu.%n"
//                                + "0. Exit%n"
//                )
//        ));
//    }
@Test
public void whenExit() {
    Output out = new StubOutput();
    Input in = new StubInput(
            new String[] {"0"}
    );
    Tracker tracker = Tracker.getInstance();
    List<UserAction> actions = new ArrayList<>();
            actions.add(new ExitAction());

    new StartUI(out).init(in, tracker, actions);
    assertThat(out.toString(), is(
            "Menu." + System.lineSeparator() +
                    "0. Exit" + System.lineSeparator()
    ));
}
    @Test
    public void whenShowAllAction() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "1"}
        );
        Tracker tracker = Tracker.getInstance();
        List<UserAction> actions = new ArrayList<>();

            actions.add(new ShowAllItemAction(out));
            actions.add(new ExitAction());

            new StartUI(out).init(in, tracker, actions);
            assertThat(out.toString(), is(
                    "Menu." + System.lineSeparator() +
                            "0. === 1. Show all items ====" + System.lineSeparator() +
                            "1. Exit" + System.lineSeparator() +
                            "Menu." + System.lineSeparator() +
                            "0. === 1. Show all items ====" + System.lineSeparator() +
                            "1. Exit" + System.lineSeparator()
            ));
        }


    @Test
    public void whenFindByName() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "first", "1"}
        );
        Tracker tracker = Tracker.getInstance();
        List<UserAction> actions = new ArrayList<>();
              actions.add(new FindNameItemAction(out));
                actions.add(new ExitAction());
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. === 5. Find items by name ====" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator() +
                        "Заявки с таким именем не найдены" + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. === 5. Find items by name ====" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindByIdAction() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "9", "1"}
        );
        Tracker tracker = Tracker.getInstance();
        List<UserAction> actions = new ArrayList<>();
               actions.add(new FindIdItemAction(out));
               actions.add(new ExitAction());

        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. === 4. Find item by Id ====" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator() +
                        "Заявка с таким id не найдена" + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. === 4. Find item by Id ====" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator()
        ));
    }
    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] { "7", "0" }
        );
        Tracker tracker = Tracker.getInstance();
        List<UserAction> actions = new ArrayList<>();
                actions.add(new ExitAction());

        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                String.format(
                        "Menu.%n"
                                + "0. Exit%n"
                                + "Wrong input, you can select: 0 .. 0%n"
                                + "Menu.%n"
                                + "0. Exit%n"
                )
        ));
    }
}