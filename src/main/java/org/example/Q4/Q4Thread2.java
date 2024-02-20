package org.example.Q4;

public class Q4Thread2 implements Runnable {

    StringBuilder sb;


    public Q4Thread2(StringBuilder sb) {
        this.sb = sb;
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            for (int j = 97; j < 123; j++) {  //a : 97   z:122

                sb.append((char) j);

            }
        }

    }
}
