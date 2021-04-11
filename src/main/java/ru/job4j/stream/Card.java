package ru.job4j.stream;

import java.util.stream.Stream;

public class Card {
    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", value=" + value +
                '}';
    }

    public enum Suit {
        Diamonds, Hearts, Spades, Clubs
    }

    public enum Value {
        V_6, V_7, V_8
    }

    public static void main(String[] args) {
        Value[] values = {Value.V_6, Value.V_7, Value.V_8};
        Suit[]  suits = {Suit.Diamonds, Suit.Hearts, Suit.Spades, Suit.Clubs};
        Stream.of(values)
                .flatMap(value -> Stream.of(suits)
                        .map(suit -> new Card(suit, value)))
                .forEach(System.out::println);
    }
}
