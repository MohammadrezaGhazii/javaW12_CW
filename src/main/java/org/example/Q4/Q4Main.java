package org.example.Q4;

public class Q4Main {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        Thread t1 = new Thread(new Q4Thread1(sb));
        Thread t2 = new Thread(new Q4Thread2(sb));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(sb.length());

    }

}
