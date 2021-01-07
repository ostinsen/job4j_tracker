package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load){
        this.load = load;
    }
    public void exchange(Battery another){
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery b1 = new Battery(10);
        Battery b2 = new Battery(5);
        b1.exchange(b2);
        System.out.println("зарядка b1 = " + b1.load);
        System.out.println("зарядка b2 = " + b2.load);
    }
}
