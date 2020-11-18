package javachanges.java8.lambda;

public class Exercise0 {
    public static void main(String[] args) {
        final int LIMIT = 10;

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < LIMIT; i++) {
                    System.out.println("r1: " + i);
                }
            }
        };

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < LIMIT; i++) {
                    System.out.println("r2: " + i);
                }
            }
        };

        Runnable r3 = () -> {
            for (int i = 0; i < LIMIT; i++) {
                System.out.println("r3: " + i);
            }
        };

        Thread t1 = new Thread(r1);
        t1.start();

        Thread t2 = new Thread(r2);
        t2.start();

        Thread t3 = new Thread(r3);
        t3.start();
    }
}
