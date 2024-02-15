package org.example.Q3;

public class ATMThread implements Runnable{
    Thread thread;
    BankAccount bankAccount;
    public ATMThread(String name, BankAccount bankAccount) {
        thread=new Thread(this,name);
        this.bankAccount=bankAccount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            bankAccount.deposit(10);
        }

    }
}
