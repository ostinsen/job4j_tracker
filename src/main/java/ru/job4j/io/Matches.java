package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main ( String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        int mathes = 11;
        while (run) {
            boolean bo1 = true;
            while (bo1) {
                System.out.print("ПЕрвый игрок берет спички от 1 до 3 ");
                int select = Integer.valueOf(input.nextLine());
                if (select >= 1 && select <= 3) {

                    bo1 = false;
                    mathes = mathes - select;
                    System.out.println("ОСталось спичек - " + mathes);
                    if (mathes <= 0) {
                        System.out.println("ПЕрвый игрок выиграл");
                        run = false;
                        break;
                    }
                } else {
                    System.out.println(" Первый игрок не корректно ввел значение");
                    System.out.println("осталось спичек " + mathes);
                }
            }
            if (mathes <= 0) break;
            boolean bo = true;
            while (bo) {
                System.out.println("Второй игрок берет спички от 1 до 3 ");
            int select1 = Integer.valueOf(input.nextLine());
            if (select1 >= 1 && select1 <= 3) {
                bo = false;
            mathes = mathes - select1;
            System.out.println("ОСталось спичек - " + mathes);
            if (mathes <= 0) {
                System.out.println("Второй игрок выиграл");
                run = false;
                break;
            }
            }else {
                System.out.println(" Второй игрок не корректно ввел значение");
                System.out.println("осталось спичек - " + mathes);
            }
            }

        }
    }
}
