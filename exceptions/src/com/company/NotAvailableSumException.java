package com.company;


public class NotAvailableSumException extends Throwable {
    private int summ;

    public NotAvailableSumException(int s){
        this.summ = s;
        System.err.println("Your amount is not a multiple of 100!");
    }
}
