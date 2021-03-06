package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает клиентов банка.
 * @author ALEX OSKIN
 * @version 1.0
 */
public class User {
    /**
     * Поля имени и паспортных данных клиента банка
     */
    private String passport;
    private String username;

    /**
     * Конструктор клиента для инициализации имени и паспорта
     * @param passport паспортные данные клиента
     * @param username имя клиента
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * @return метод возвращает паспортные данные клиента
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Метод для изменения паспортных данных
     * @param passport установливаются новые паспортные данные
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * @return возвращает имя клиента
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username устанавливает новое имя клиента
     */
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
