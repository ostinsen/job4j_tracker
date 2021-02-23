package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
       users.putIfAbsent(user, new ArrayList<Account>());

//        if ( !users.containsKey(user.getPassport())){
//                users.put(user, new ArrayList<Account>());
//            }
    }

    public void addAccount(String passport, Account account) {
            User user = findByPassport(passport);
        if (!user.equals(null)){
           if (!users.get(user).contains(account)){
               users.get(user).add(account);
           }
        }
    }

    public User findByPassport(String passport) {
        User user = null;
        for (User us : users.keySet()){
            if(us.getPassport().equals(passport)){
              user = us;
            }
        }
        return user;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account account = null;
        User user = findByPassport(passport);
        if (user != null){
            List<Account> accounts = users.get(user);
            for (Account acc : accounts){
                if (acc.getRequisite().equals(requisite)){
                    account = acc;
                }
            }
        }

        return account;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;

        User userScr = findByPassport(srcPassport);
        Account accountSrc = findByRequisite(srcPassport, srcRequisite);
        if (userScr.equals(null) || accountSrc.equals(null) ){
            return false;
        }

        User userDest = findByPassport(destPassport);
        users.putIfAbsent(userDest, new ArrayList<Account>());
        Account accountDest = findByRequisite(destPassport, destRequisite);

        if (accountSrc.getBalance() < amount) {
            return false;
        }

        accountSrc.setBalance(accountSrc.getBalance() - amount);

        accountDest.setBalance(accountDest.getBalance() + amount);


        return true;
    }


}
