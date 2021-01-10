package ru.job4j.profession;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private String birthday;

    public Profession(){

    }
    public Profession(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setName(String name) {
        this.name = name;
    }
}
