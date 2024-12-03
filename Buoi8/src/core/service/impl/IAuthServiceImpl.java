package service.impl;

import model.Account;
import model.Person;
import service.IAuthService;

import java.util.ArrayList;
import java.util.Scanner;

public class IAuthServiceImpl implements IAuthService {
    static Scanner sc = new Scanner(System.in);
    public ArrayList<Account> accountlist = new ArrayList<>();
    Person currentPerson = null;

    @Override
    public void login(Scanner sc) {
        while (true) {
            System.out.println("Enter username: ");
            String username = sc.nextLine();
            System.out.println("Enter password: ");
            String password = sc.nextLine();

            for (Account account : accountlist) {
                if (account.getUsername().equals(username) && account.getPassword().equals(password)) {
                    System.out.println("Login successfully!");
                    currentPerson = account;
                    return;
                }
            }
            System.out.println("Invalid username or password!");
        }
    }

    @Override
    public Account getCurrentPerson() {
        return (Account) currentPerson;
    }

    @Override
    public void logout() {
        for (Account account : accountlist) {
            if (currentPerson != null) {
                System.out.println("Logout successfully!");
                currentPerson = null;
            } else {
                System.out.println("No person is currently logged in!");
            }
        }
    }

    @Override
    public void changePassword(String username, String oldPassword, String newPassword) {
        for (Account nick : accountlist) {
            if (username.equals(nick.getUsername()) && oldPassword.equals(nick.getPassword())) {
                nick.setPassword(newPassword);
                System.out.println("Change password successfully!");
                return;
            }
        }
        System.out.println("Change password failure!");
    }
}
