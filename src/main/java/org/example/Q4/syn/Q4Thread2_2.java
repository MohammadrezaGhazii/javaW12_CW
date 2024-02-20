package org.example.Q4.syn;

public class Q4Thread2_2 implements Runnable {

    StringBuilder sb;


    public Q4Thread2_2(StringBuilder sb) {
        this.sb = sb;
    }

    @Override
    public void run() {

        synchronized (sb){

            for (int i = 0; i < 100; i++) {
                for (int j = 97; j < 123; j++) {  //a : 97   z:122

                    sb.append((char) j);

                }
            }
        }
    }
}
