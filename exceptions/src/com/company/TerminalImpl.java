package com.company;

public class TerminalImpl implements Terminal{
    private TerminalServerImpl server;
    private PinValidatorImpl pinValidator;
    private boolean EnteredPin;

    public TerminalImpl(TerminalServerImpl server, PinValidatorImpl pinValidator){
        this.server = server;
        this.pinValidator = pinValidator;
        this.EnteredPin = false;
    }

    @Override
    public int checkAccount() throws PinNotEnteredException{
        if (!EnteredPin){
            throw new PinNotEnteredException();
        }
        return server.checkAccount();
    }

    @Override
    public void addMoney(int sum) throws PinNotEnteredException, NotAvailableSumException{
        if (!EnteredPin){
            throw new PinNotEnteredException();
        }
        server.addMoney(sum);
    }

    @Override
    public void getMoney(int sum) throws PinNotEnteredException, NotAvailableSumException, NotEnoughMoneyOnAccountException{
        if (!EnteredPin){
            throw new PinNotEnteredException();
        }
        server.getMoney(sum);
    }

    @Override
    public void inputPin(String pin) throws AccountIsLockedException, InvalidPinException{
        pinValidator.inputPin(pin);
        EnteredPin = true;
    }


}
