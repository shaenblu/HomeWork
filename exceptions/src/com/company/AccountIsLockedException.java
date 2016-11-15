package com.company;



public class AccountIsLockedException extends Throwable {

    private int sec;

    public AccountIsLockedException(int sec){
        this.sec = sec;
        System.err.println("You may enter pincode after " + sec + " seconds");
    }

    public int getSec(){
        return sec;
    }

}



