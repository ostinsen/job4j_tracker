package ru.job4j.bank;

import java.util.*;
import java.util.stream.Stream;

/**
 * Класс опысывает банковские операции над счетами клиентов банка.
 * @author ALEX OSKIN
 * @version 1.0
 */
public class BankService {
    /**
     * Создает коллекцию (базу данных)  ВСЕХ КЛИЕНТОВ БАНКА типа  - ключ - значение( клиент - список счетов клиента);
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Добавление новых клиентов
     * @param user добавляет новых клиентов в коллекцию всех клиентов банка, если такого клиента
     *в их базе нет
     */
    public void addUser(User user) {
       users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Добавляет новые счета, в лист счетов клиента, которого мы получаем через паспортные данные
     * клиента
     * @param passport задаем паспорт, для нахождения клиента
     * @param account добавляет новый счет в лист счетов клиента
     */

    public void addAccount(String passport, Account account) {
            User user = findByPassport(passport).get();
        if (user != null) {
           if (!users.get(user).contains(account)) {
               users.get(user).add(account);
           }
        }
    }

    /**
     * Находит клиента в базе данных банка по паспортным данным
     * @param passport для ввода паспортных данных клиента с базы
     * @return возвращает клиента банка
     */

    public Optional<User> findByPassport(String passport) {
        Stream<User> stream = users.keySet().stream();
        Optional<User> rsl = stream.filter(e -> e.getPassport().equals(passport)).findFirst();
          return rsl;
    }

    /**
     * Находит счет клиента по реквизиту и паспортным данным клиента
     * @param passport находит клиента по паспортным данным, если он есть в базе
     * @param requisite находит счет клиента по реквизитам
     * @return возвращает счет клиента
     */

    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        Optional<Account> rsl = null;
        if (user.isPresent())  {
            Stream<Account> stream = users.get(user.get()).stream();
            rsl = stream.filter(u -> u.getRequisite().equals(requisite)).findFirst();
        }
       return rsl;
    }

    /**
     * Перевод денег с одного счета на другой. Метод работает для перевода денег между счетами
     * одного и того же клиента и для перевода денег между счетами разных клиентов.
     * @param srcPassport  паспортные данные для нахождения счета, с которого снимаются деньги
     * @param srcRequisite реквизиты для нахождения счета, с которого снимаются деньги
     * @param destPassport паспортные данные для нахождения счета, на  который перечисляются деньги
     * @param destRequisite реквизиты для нахождения счета, на  который перечисляются деньги
     * @param amount сумма переводимых денег
     * @return возвращает true или false в зависимости от результата перевода
     */

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account accountSrc = findByRequisite(srcPassport, srcRequisite).get();

        Account accountDest = findByRequisite(destPassport, destRequisite).get();

        if (accountSrc == null || accountDest == null || (accountSrc.getBalance() < amount)) {
            return false;
        }

        accountSrc.setBalance(accountSrc.getBalance() - amount);

        accountDest.setBalance(accountDest.getBalance() + amount);

        return true;
    }
}
