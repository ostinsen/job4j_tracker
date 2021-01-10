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

}
