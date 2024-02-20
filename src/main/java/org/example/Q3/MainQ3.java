package org.example.Q3;

public class MainQ3 {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account=new BankAccount();
        ATMThread atmThread1=new ATMThread("account1",account);
        Thread tAccount1=new Thread(atmThread1);
        ATMThread atmThread2=new ATMThread("account2",account);
        Thread tAccount2=new Thread(atmThread2);
        ATMThread atmThread3=new ATMThread("account3",account);
        Thread tAccount3=new Thread(atmThread3);
        ATMThread atmThread4=new ATMThread("account4",account);
        Thread tAccount4=new Thread(atmThread4);
        ATMThread atmThread5=new ATMThread("account5",account);
        Thread tAccount5=new Thread(atmThread5);

        tAccount1.start();
        tAccount2.start();
        tAccount3.start();
        tAccount4.start();
        tAccount5.start();

        tAccount1.join();
        tAccount2.join();
        tAccount3.join();
        tAccount4.join();
        tAccount5.join();

        System.out.println("balance1= " +account.getBalance().get());
    }
}
