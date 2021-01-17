package ru.job4j.oop;

public class College {
    public static void main (String[] args) {
        Freshman freshman = new Freshman();
        Student student = new Student();
        //up-casting
       Student stFreshman  = freshman;
        Object  objFreshman = freshman;
        Object obStudent = student;
        Object obFreshStudent = stFreshman;

        // down -casting
        Student stFresh = new Freshman();
        Freshman freshDown = (Freshman) stFresh;
        Object obDown = new Student();
        Student freStrudent = (Student) obDown;
    }
}
