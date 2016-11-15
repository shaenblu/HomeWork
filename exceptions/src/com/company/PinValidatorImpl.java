package com.company;

import java.util.Date;

public class PinValidatorImpl implements PinValidator {
    private String pin;
    private boolean isLocked;
    private Date lastTime;
    private int count;


    public PinValidatorImpl(String A) {
        this.pin = A;
        this.isLocked = false;
        this.count = 0;

    }

    @Override
    public void inputPin(String A) throws AccountIsLockedException, InvalidPinException {

        if ((isLocked) && ((new Date().getTime() - lastTime.getTime()) / 1000 < 5)) {
            throw new AccountIsLockedException(5 - (int) (new Date().getTime() - lastTime.getTime()) / 1000);
        }
        if (pin.equals(A)) {
            isLocked = false;
            count = 0;
        } else {
            count++;
            if (count == 3) {
                isLocked = true;
                lastTime = new Date();
                count = 0;
            }
            throw new InvalidPinException(3 - count);
        }
    }
}


