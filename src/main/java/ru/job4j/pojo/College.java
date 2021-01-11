package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Alex Oskin");
        student.setGroup("elementary");
        student.setDatePass("17.12.20");
        System.out.println("ФИО - " + student.getFullName() + " группа - " + student.getGroup() + " DAte of pass - " + student.getDatePass());
    }
}
