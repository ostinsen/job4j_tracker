package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }

//        switch (position) {
//            case 1:
//                System.out.println("Пусть бегут неуклюже");
//                break;
//            case 2:
//                System.out.println("Спокойной ночи");
//                break;
//            default:
//                System.out.println("Песня не найдена");
//                break;
//        }
    }

    public static void main(String[] args) {
        Jukebox j1 = new Jukebox();
        Jukebox j2 = new Jukebox();
       j1.music(1);
       j2.music(2);
       j2.music(3);
    }
}
