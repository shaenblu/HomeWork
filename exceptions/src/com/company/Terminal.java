package com.company;


public interface Terminal {


    int checkAccount() throws PinNotEnteredException;

    void addMoney(int sum) throws PinNotEnteredException, NotAvailableSumException;

    void getMoney(int sum) throws PinNotEnteredException, NotAvailableSumException, NotEnoughMoneyOnAccountException;

    void inputPin(String s) throws AccountIsLockedException, InvalidPinException;

}
