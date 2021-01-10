package ru.job4j.inheritance;

public class JSONReport extends TextReport {
    public String generate(String name, String body) {
        return "name : " + name + "," + System.lineSeparator() + "body : " + body;
    }

    public static void main(String[] args) {
        JSONReport json  = new JSONReport();
        String str = json.generate("Colin", "big");
        System.out.println(str);
    }
}
