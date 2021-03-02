package ru.job4j.pojo;

public class Book {
    private String name;
    private int amountSheet;

    public Book(String name, int amountSheet) {
        this.name = name;
        this.amountSheet = amountSheet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountSheet() {
        return amountSheet;
    }

    public void setAmountSheet(int amountSheet) {
        this.amountSheet = amountSheet;
    }
}
