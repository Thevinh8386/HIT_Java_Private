package service;

import java.util.Scanner;

public interface IUserService {
    void login(Scanner sc);
    void logout();
    void displayUser();
    void addUser(); //admin use method
    void deleteUser(); //admin use method
}
