//1000 sømil = 1852km

// Assignment 1 with Thread

public class MultiThreadingThread extends Thread{

    public static void main(String[] args) throws InterruptedException {
        MultiThreadingThread mt = new MultiThreadingThread();
        mt.whatIsAnInternationalNauticalMile();
    }

    //Hvad er 1000 sømil
    public void whatIsAnInternationalNauticalMile() throws InterruptedException {
        MultithreadingThread2 obj2 = new MultithreadingThread2();
        obj2.start();

        MultithreadingThread1 obj = new MultithreadingThread1();
        MultithreadingThread1.sleep(3000);
        obj.start();

        MultithreadingThread4 obj4 = new MultithreadingThread4();
        MultithreadingThread4.sleep(3000);
        obj4.start();

        MultithreadingThread3 obj3 = new MultithreadingThread3();
        MultithreadingThread3.sleep(3000);
        obj3.start();
    }
}
class MultithreadingThread1 extends Thread{
    public void run() {
        System.out.println("8");
    }
}
class MultithreadingThread2 extends Thread{
    public void run() {
        System.out.println("1");
    }
}

class MultithreadingThread3 extends Thread{
    public void run() {
        System.out.println("2");
    }
}
class MultithreadingThread4 extends Thread{
    public void run() {
        System.out.println("5");
    }
}