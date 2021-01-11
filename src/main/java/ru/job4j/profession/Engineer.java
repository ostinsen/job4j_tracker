package ru.job4j.profession;

public class Engineer extends Profession {
    private int amountBuild;

    public int getAmountBuild() {
        return amountBuild;
    }
    public Engineer(){

    }

    public Engineer(String name){
        this.setName(name);

    }
    public Engineer(String name, String surname, String education, String birthday){
        super(name, surname, education, birthday);

    }
    public Engineer(String name, String surname, String education, String birthday, int amountBuild){
        super(name, surname, education, birthday);
        this.amountBuild = amountBuild;
    }

}
