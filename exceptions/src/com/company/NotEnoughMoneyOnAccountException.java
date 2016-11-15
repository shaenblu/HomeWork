package com.company;

public class NotEnoughMoneyOnAccountException extends Throwable {
    private int balance;

    public NotEnoughMoneyOnAccountException(int i){
        this.balance = i;
        System.err.println("There is not enough money on account!");
    }
}
