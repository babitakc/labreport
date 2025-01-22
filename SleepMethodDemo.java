package Multitherading;
class SleepDemo extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread: " + i);
                Thread.sleep(1000); // Pauses thread for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }
}

public class SleepMethodDemo {
    public static void main(String[] args) {
        SleepDemo t = new SleepDemo();
        t.start();
    }
}

