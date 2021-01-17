package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("go!");
    }

    @Override
    public void passengers(int passenger) {
        System.out.println("количество пассажиров " + passenger);
    }

    @Override
    public int priceOil (int oil) {
        return oil * 40;
    }
}
