public class Thread2 implements Runnable {
    public void run() {
        try {
            System.out.println("Thread 2 started");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("hello");
    }
}
