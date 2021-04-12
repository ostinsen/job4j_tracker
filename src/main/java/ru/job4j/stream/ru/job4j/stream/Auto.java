package ru.job4j.stream.ru.job4j.stream;

public class Auto {
    private String owner;
    private String model;
    private int yearOfIssue;
    private String name;
    private int depletionOfFuel;
    private double engineCapacity;
    private String color;

    @Override
    public String toString() {
        return "Auto{" +
                "owner='" + owner + '\'' +
                ", model='" + model + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", name='" + name + '\'' +
                ", depletionOfFuel=" + depletionOfFuel +
                ", engineCapacity=" + engineCapacity +
                ", color='" + color + '\'' +
                '}';
    }

    static class Builder{
        private String owner;
        private String model;
        private int yearOfIssue;
        private String name;
        private int depletionOfFuel;
        private double engineCapacity;
        private String color;

        Builder buildOwner(String owner) {
            this.owner = owner;
            return this;
        }

        Builder buildModel(String model) {
            this.model = model;
            return this;
        }

        Builder buildYearOfIssue(int yearOfIssue) {
            this.yearOfIssue = yearOfIssue;
            return this;
        }

        Builder buildName(String name) {
            this.name = name;
            return this;
        }

        Builder buildDepletionOfFuel(int depletionOfFuel) {
            this.depletionOfFuel = depletionOfFuel;
            return this;
        }

        Builder buildEngineCapacity(double engineCapacity) {
            this.engineCapacity = engineCapacity;
            return this;
        }

        Builder buildColor(String color) {
            this.color = color;
            return this;
        }
        Auto build(){
            Auto auto = new Auto();
            auto.owner = owner;
            auto.model = model;
            auto.yearOfIssue = yearOfIssue;
            auto.name = name;
            auto.depletionOfFuel = depletionOfFuel;
            auto.engineCapacity = engineCapacity;
            auto.color = color;
            return auto;
        }
    }

    public static void main(String[] args) {
        Auto auto = new Builder()
                .buildOwner("Max")
                .buildModel("BMW")
                .buildYearOfIssue(2005)
                .buildName("X5")
                .buildDepletionOfFuel(20)
                .buildEngineCapacity(2.0)
                .buildColor("Black")
                .build();
        System.out.println(auto);
    }
}
