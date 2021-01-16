package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mathes = 11;
        int count = 1;
        System.out.println(" Первый игрок ходит, чтобы начать игру:");
        while (true) {
            System.out.print("Введите от 1 до 3 ");
            int select = Integer.valueOf(input.nextLine());
            if (select >= 1 && select <= 3 && count % 2 != 0) {
                mathes = mathes - select;
                if (mathes <= 0) break;
                count++;
                System.out.println("осталось спичек " + mathes + " Очередь второго игрока");
            } else if (select >= 1 && select <= 3 && count % 2 == 0) {
                mathes = mathes - select;
                if (mathes <= 0) break;
                count++;
                System.out.println("осталось спичек " + mathes + " Очередь первого игрока");
            } else {
                System.out.println("Повторите ввод ");
            }
        }
        if (count % 2 != 0) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
