package org.example.Q2;

public class MainQ2 {
    public static void main(String[] args) {
        MyThread2 father = new MyThread2("bread is ready" , "Father");
        MyThread2 mother = new MyThread2("tea is ready" , "mother");
        MyThread2 child = new MyThread2("cheese is ready" , "child");
        Thread tFather = new Thread(father);
        Thread tMother = new Thread(mother);
        Thread tChild = new Thread(child);
        tFather.start();
        tMother.start();
        tChild.start();

        try {
            tFather.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            tMother.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            tChild.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Breakfast is ready !!!");
    }
}
