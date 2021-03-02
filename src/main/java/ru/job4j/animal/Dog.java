package ru.job4j.animal;

public class Dog extends Pet {
    public void runAfterCat() {
        System.out.println(getNameClass() + " не любит кошек, постоянно за ними гоняется.");
    }
}
