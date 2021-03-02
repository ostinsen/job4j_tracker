package ru.job4j.profession;

public class Dentist extends Doctor {
    private int amountTooth;

    public Dentist() {

    }

    public Dentist(String name, String surname,
                   String education, String birthday, int amountTooth) {
        super(name, surname, education, birthday);
        this.amountTooth = amountTooth;
    }

    public int getAmountTooth() {
        return amountTooth;
    }
}
