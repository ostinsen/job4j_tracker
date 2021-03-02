package ru.job4j.animal;

public class Animal {

    private String nameClass = getClass().getSimpleName();

    public String getNameClass() {
        return nameClass;
    }

    public void sound() {
        System.out.println(nameClass + " - издает какой-то звук.");
    }
}
