// Assignment 2 with Thread
// Skriv et program, der tager en positiv integer n som input, og opretter n tråde der udlæser deres eget navn.
// Brug extend Thread
//
// Output kunne se således ud:
// Hallo, Jeg hedder Thread #1
// Hallo, Jeg hedder Thread #2
// Hallo, Jeg hedder Thread #3
// Hallo, Jeg hedder Thread #4
//
//ved n=4

import java.util.Scanner;

public class MultithreadingProgramThread extends Thread {

    public static void main(String[] args) throws InterruptedException {
        int n = 0;

        while (n <= 0){
            System.out.println("Please, enter a positive number:");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
        }

        System.out.println("Number of threads: " + n);

        for (int i = 1; i < n+1; i++) {
            MultithreadingProgramThread obj = new MultithreadingProgramThread();
            String name = String.valueOf(i);
            obj.setName(name);
            MultithreadingProgramThread.sleep(1000);
            obj.start();
        }
    }
    public void run(){
        System.out.println("Hallo, Jeg hedder Thread#" + getName());
    }
}