package org.example.Q3;

public class MainQ3 {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account1=new BankAccount();
        ATMThread atmThread1=new ATMThread("account1",account1);
        Thread tAccount1=new Thread(atmThread1);
        BankAccount account2=new BankAccount();
        ATMThread atmThread2=new ATMThread("account2",account2);
        Thread tAccount2=new Thread(atmThread2);
        BankAccount account3=new BankAccount();
        ATMThread atmThread3=new ATMThread("account3",account3);
        Thread tAccount3=new Thread(atmThread3);
        BankAccount account4=new BankAccount();
        ATMThread atmThread4=new ATMThread("account4",account4);
        Thread tAccount4=new Thread(atmThread4);
        BankAccount account5=new BankAccount();
        ATMThread atmThread5=new ATMThread("account5",account5);
        Thread tAccount5=new Thread(atmThread5);

        tAccount1.join();
        tAccount2.join();
        tAccount3.join();
        tAccount4.join();
        tAccount5.join();

        System.out.println("balance1= " +account1.getBalance());
        System.out.println("balance2= " +account2.getBalance());
        System.out.println("balance3= " +account3.getBalance());
        System.out.println("balance4= " +account4.getBalance());
        System.out.println("balance5= " +account5.getBalance());
    }
}
