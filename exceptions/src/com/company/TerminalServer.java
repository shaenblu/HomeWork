package com.company;


public interface TerminalServer {
    int checkAccount();
    void addMoney(int sum) throws NotAvailableSumException;
    void getMoney(int sum) throws NotEnoughMoneyOnAccountException, NotAvailableSumException;
}
