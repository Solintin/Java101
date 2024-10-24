
class Counter {
    static int count = 0;

    public static synchronized void increment() {
        count++;
    }
}

class ThreadA extends Thread {
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            Counter.increment();
            // System.out.println("Alley");
            // try {
            // Thread.sleep(10);
            // } catch (Exception e) {

            // e.printStackTrace();
            // }
        }
    }
}

class ThreadB extends Thread {
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            Counter.increment();
            // System.out.println("Soliu");
            // try {
            // Thread.sleep(10);
            // } catch (Exception e) {

            // e.printStackTrace();
            // }
        }
    }
}

public class ThreadLearn {
    public static void main(String[] args) throws InterruptedException {
        ThreadA Alley = new ThreadA();
        ThreadB Soliu = new ThreadB();

        Alley.start();
        Soliu.start();

        Alley.join();
        Soliu.join();

        System.out.println(Counter.count);
    }

}