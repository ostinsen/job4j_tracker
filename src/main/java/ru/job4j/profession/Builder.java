package ru.job4j.profession;

public class Builder extends Engineer {
    private String loveColor;

    public Builder(){ }

    public Builder(String name, String surname, String education, String birthday, String loveColor){
        super(name, surname, education, birthday);
        this.loveColor = loveColor;
    }
    public boolean canBuild(){
        return true;
    }
}
