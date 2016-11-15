package com.company;

public class InvalidPinException extends Throwable {
    private int trying;

    public InvalidPinException(int trying){
        this.trying = trying;
        System.err.println("You entered incorrect pincode!");
    }

}
