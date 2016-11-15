package com.company;

public class TerminalServerImpl implements TerminalServer {
    private int balance;

    public TerminalServerImpl(int balance){
        this.balance = balance;
    }

    @Override
    public int checkAccount(){
        return balance;
    }


    @Override
    public void addMoney(int sum) throws NotAvailableSumException{
        if (sum % 100 == 0){
            this.balance += sum;
        }
        else throw new NotAvailableSumException(sum);
    }


    @Override
    public void getMoney(int sum) throws NotEnoughMoneyOnAccountException, NotAvailableSumException{
        if (sum % 100 == 0){
            if (balance < sum){
                throw new NotEnoughMoneyOnAccountException(balance);
            } else balance -= sum;

        } else throw new NotAvailableSumException(sum);
    }

}
