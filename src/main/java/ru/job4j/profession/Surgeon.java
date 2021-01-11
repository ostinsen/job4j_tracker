package ru.job4j.profession;

public class Surgeon extends Doctor {
    private int speedSur;

    public Surgeon(){

    }

    public Surgeon(String name, String surname, String education, String birthday, int speedSur){
        super(name, surname, education, birthday);
        this.speedSur = speedSur;
    }

    public int getSpeedSur() {
        return speedSur;
    }

}
