package org.example.Q4.Buffer;

public class Q4Main_1 {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();

        Thread t1 = new Thread(new Q4Thread1_1(sb));
        Thread t2 = new Thread(new Q4Thread2_1(sb));

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
