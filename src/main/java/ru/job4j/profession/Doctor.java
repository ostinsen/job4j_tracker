package ru.job4j.profession;

public class Doctor extends Profession {

        private int amountOperation;

        public Doctor(){

        }
        public Doctor(String name, String surname){
            super(name, surname);
        }
    public Doctor(String name, String surname, String education, String birthday){
        super(name, surname, education, birthday);
    }
        public Doctor(String name, String surname, String education, String birthday, int amountOperation){
            super(name, surname, education, birthday);
            this.amountOperation = amountOperation;
        }
    public Diagnosis heal(Pacient pacient){
        return new Diagnosis();
    }
}
