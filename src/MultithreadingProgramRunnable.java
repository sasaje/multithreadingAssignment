// Assignment 2 with Runnable
// Skriv et program, der tager en positiv integer n som input, og opretter n tråde der udlæser deres eget navn.
// Brug Runnable interface.

// Output kunne se således ud:
// Hallo, Jeg hedder Thread #1
// Hallo, Jeg hedder Thread #2
// Hallo, Jeg hedder Thread #3
// Hallo, Jeg hedder Thread #4
//
//ved n=4

import java.util.Scanner;

public class MultithreadingProgramRunnable implements Runnable {

    public static void main(String[] args) throws InterruptedException {
        int n = 0;
        String name = "";

        while (n <= 0){
            System.out.println("Please, enter a positive number:");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
        }

        System.out.println("Number of threads: " + n);

        for (int i = 1; i < n+1; i++) {
            MultithreadingProgramRunnable obj = new MultithreadingProgramRunnable();
            Thread thread = new Thread(obj);
            name = String.valueOf(i);
            thread.setName(name);
            thread.sleep(1000);
            thread.start();
        }
    }

    @Override
    public void run() {
        String threadId = Thread.currentThread().getName();
        System.out.println("Hallo, Jeg hedder Thread#" + threadId);
    }
}