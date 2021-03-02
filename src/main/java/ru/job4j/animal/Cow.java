package ru.job4j.animal;

public class Cow  extends DomesticAnimal {

    @Override

    public void sound() {
        System.out.println(getNameClass() + " Я могу муууу");
    }

    public void giveMilk() {
        System.out.println(getNameClass() + " дает человеку молоко.");
    }
}
