package org.example.Q4.syn;

public class Q4Thread1_2 implements Runnable {

    StringBuilder sb;

    public Q4Thread1_2(StringBuilder sb) {
        this.sb = sb;
    }

    @Override
    public void run() {

        synchronized (sb){

            for (int i = 1; i < 1000; i++) {

                sb.append(i);

            }
        }
    }
}
