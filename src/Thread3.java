public class Thread3 implements Runnable {
    public void run() {
        try {
            System.out.println("Thread 3 started");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("bye");
    }
}
