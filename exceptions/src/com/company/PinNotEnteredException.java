package com.company;

public class PinNotEnteredException extends Throwable {
    public PinNotEnteredException(){
        System.out.println("Pin is not enetered yet!");
    }
}
