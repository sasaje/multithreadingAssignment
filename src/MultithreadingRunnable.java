
public class MultithreadingRunnable implements Runnable {

    public static void main(String[] args) {
        MultithreadingRunnable obj = new MultithreadingRunnable();
        Thread tobj = new Thread(obj);
        tobj.start();
    }

    @Override
    public void run() {
        System.out.println("This first thread is in running state!");
    }
}