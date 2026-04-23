public class Thread1 implements Runnable {

    public void run() {
        try {
            System.out.println("Thread 1 started");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("hi");
    }

}
