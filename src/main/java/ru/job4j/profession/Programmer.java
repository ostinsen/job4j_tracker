package ru.job4j.profession;

public class Programmer extends Engineer {
    private int expertAge;

    public Programmer() {

    }

    public Programmer(String name, String surname,
                      String education, String birthday, int expertAge) {
        super(name, surname, education, birthday);
        this.expertAge = expertAge;
    }

    public boolean canCode() {
        return true;
    }
}
