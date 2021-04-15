// Assignment 1 with Runnable
//
// 1000 sømil = 1852km
//
// Lav et program, der har 4 tråde, ve hjælp afrunnable interfacet. Hver tråd har til opgave at udskrive et specifikt tal.
// Tråd 1 = 8, Tråd 2 = 1, Tråd 3 = 5, Tråd 4 = 2.
// Skriv en metode, der eksikverer tråedene i sådan en rækkefølge, så der udlæses hvor mange kilometre der går på 1000 sømil.
// Omskriv programmet, så hvert tal udlæses med 3 sekunders mellemrum, ved brug af Thread.sleep(3000) metoden.

public class MultithreadingRunnable{

    public static void main(String[] args) {
        MultithreadingRunnableThread2 t2 = new MultithreadingRunnableThread2();
        t2.run();

        MultithreadingRunnableThread1 t1 = new MultithreadingRunnableThread1();
        t1.run();

        MultithreadingRunnableThread4 t4 = new MultithreadingRunnableThread4();
        t4.run();

        MultithreadingRunnableThread3 t3 = new MultithreadingRunnableThread3();
        t3.run();
    }

    static class MultithreadingRunnableThread1 implements Runnable{
        public void run() {
            System.out.println("8");
        }
    }
    static class MultithreadingRunnableThread2 implements Runnable{
        public void run() {
            System.out.println("1");
        }
    }

    static class MultithreadingRunnableThread3 implements Runnable{
        public void run() {
            System.out.println("2");
        }
    }
    static class MultithreadingRunnableThread4 implements Runnable{
        public void run() {
            System.out.println("5");
        }
    }
}
