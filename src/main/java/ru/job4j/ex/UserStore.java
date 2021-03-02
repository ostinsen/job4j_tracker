package ru.job4j.ex;

import org.w3c.dom.ls.LSOutput;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {

        User user = null;

        for (int i = 0; i < users.length; i++) {
            if (users[i].getUsername().equals(login)) {
                user = users[i];
            }
        }
        if (user == null) {
            throw new UserNotFoundException(" User is not found");
        }

        return user;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!(user.isValid() || user.getUsername().length() < 3)) {
                throw new UserInvalidException("User is invalid");
        }

        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException unf) {
            System.out.println("Пользователь не валидный");
        } catch (UserNotFoundException ui) {
            System.out.println("Пользователь не найден");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
