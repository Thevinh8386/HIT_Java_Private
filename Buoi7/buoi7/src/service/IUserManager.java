package service;

import model.User;

import java.util.Scanner;

public interface IUserManager {
    public void login(Scanner sc);
    User getCurrentUser();
    public void logout();
}
