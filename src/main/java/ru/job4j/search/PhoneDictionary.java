package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> prName = s -> s.getName().contains(key);
        Predicate<Person> prSurName = s -> s.getSurname().contains(key);
        Predicate<Person> prPhone = s -> s.getPhone().contains(key);
        Predicate<Person> prAdress = s -> s.getAddress().contains(key);
        Predicate<Person> combine = prName.or(prSurName).or(prPhone).or(prAdress);
        ArrayList<Person> result = new ArrayList<>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}