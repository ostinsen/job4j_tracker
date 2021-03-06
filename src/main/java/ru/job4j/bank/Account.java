package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает счета клиентов банка.
 * @author ALEX OSKIN
 * @version 1.0
 */
public class Account {
    /**
     * Приватные поля счета в банке: реквизиты и баланс
     */
    private String requisite;
    private double balance;

    /**
     * Конструктор счета в банке.
     * @param requisite реквизиты
     * @param balance баланс
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     *
     * @return возвращает реквизиты счета в банке
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     *
     * @param requisite устанавливает реквизиты счета в банке
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     *
     * @return возвращается доступный баланс на счете
     */
    public double getBalance() {
        return balance;
    }

    /**
     * устанавливает новый баланс счета
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }

}
