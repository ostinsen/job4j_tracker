package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

//        if ( !users.containsKey(user.getPassport())){
//                users.put(user, new ArrayList<Account>());
//            }
    }

    /**
     * Добавляет новые счета, в лист счетов клиента, которого мы получаем через паспортные данные
     * клиента
     * @param passport задаем паспорт, для нахождения клиента
     * @param account добавляет новый счет в лист счетов клиента
     */

    public void addAccount(String passport, Account account) {
            User user = findByPassport(passport);
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

    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /**
     * Находит счет клиента по реквизиту и паспортным данным клиента
     * @param passport находит клиента по паспортным данным, если он есть в базе
     * @param requisite находит счет клиента по реквизитам
     * @return возвращает счет клиента
     */

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            return users.get(user)
                    .stream()
                    .filter(u -> u.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }

        return null;
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
        Account accountSrc = findByRequisite(srcPassport, srcRequisite);

        Account accountDest = findByRequisite(destPassport, destRequisite);

        if (accountSrc == null || accountDest == null || (accountSrc.getBalance() < amount)) {
            return false;
        }

        accountSrc.setBalance(accountSrc.getBalance() - amount);

        accountDest.setBalance(accountDest.getBalance() + amount);

        return true;
    }
}
