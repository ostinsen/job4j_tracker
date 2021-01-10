package ru.job4j.profession;

public class Doctor extends Profession {
        public Diagnosis heal(Pacient pacient){
            return new Diagnosis();
        }
        public Doctor(){

        }
        public Doctor(String name, String surname){
            super(name, surname);
        }
}
