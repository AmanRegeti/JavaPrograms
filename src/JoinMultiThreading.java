public class JoinMultiThreading {
        public static void main(String[] args) throws InterruptedException {

            Thread T1 = new Thread(new Thread1());
            T1.start();

            Thread T2 = new Thread(new Thread2());
            T2.start();

            Thread T3= new Thread(new Thread3());
            T3.start();

            T1.join();
            T2.join();
            T3.join();

            System.out.println("Main thread ends now");
        }

}
