package service.impl;

import model.Account;
import model.Status;
import service.IAccountService;

import java.util.List;

public class IAccountServiceImpl implements IAccountService {

    private IAuthServiceImpl IAuthService;

    public void IAuthServiceImpl(IAuthServiceImpl IAuthService) {
        this.IAuthService = IAuthService;
    }

    @Override
    public List<Account> getAllAccount() {
        return IAuthService.accountlist;
    }

    @Override
    public void createNewAccount(Account account) {
        try {
            for (Account acc : IAuthService.accountlist) {
                if (acc.getUsername().equalsIgnoreCase(account.getUsername())) {
                    throw new IllegalAccessException("Username nay da ton tai!");
                }
            }
            IAuthService.accountlist.add(account);
            System.out.println("Create acc successfully!");
        } catch (IllegalAccessException ex) {
            System.err.println("ERROR: " + ex.getMessage());
        } catch (Exception ex) {
            System.err.println("Unknow error! Please enter again");
        }
        System.out.println("Create acc failure!");
    }

    @Override
    public Account getAccountByUsername(String username) {
        for (Account account : IAuthService.accountlist) {
            if (account.getUsername().equalsIgnoreCase(username)) {
                return account;
            }
        }
        System.out.println("Invalid account!");
        return null;
    }

    @Override
    public void deleteAccount(String username) {
        for (Account account : IAuthService.accountlist) {
            if (account.getUsername().equalsIgnoreCase(username)) {
                IAuthService.accountlist.remove(account);
                System.out.println("Delete account successfully!");
            }
        }
        System.out.println("Invalid account have username is " + username);
        System.out.println("Delete account failure!");
    }

    @Override
    public void changeStatus(String username, Status status) {
        for (Account acc : IAuthService.accountlist) {
            if (username.equalsIgnoreCase(acc.getUsername())) {
                acc.setStatus(status);
                System.out.println("Change status successfully!");
                return;
            }
        }
        System.out.println("Change status failure!");
    }
}
