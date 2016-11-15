package com.company;


public interface PinValidator {
    void inputPin(String s) throws AccountIsLockedException, InvalidPinException;
}
