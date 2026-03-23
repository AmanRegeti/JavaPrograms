public class TicketSystem implements Runnable {
        public static Thread ticketSytesmThread;
        public static TicketSystem ticketSystem;
//synchronizing : having any method go in order from what reaches the thread first to last
        @Override
            public  void run() {
            TicketBooking booking = new TicketBooking();
            Thread bookingThread = new Thread(booking);

            System.out.println("State after creating bookingThread: " + bookingThread.getState());

            bookingThread.start();
            System.out.println("State after starting bookingThread: " + bookingThread.getState());

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("State after sleeping bookingThread: " + bookingThread.getState());

            try {

                // Moves mainThread to waiting state
                bookingThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("State after bookingThread finishes: " + bookingThread.getState());
        }

        public static void main(String[] args) {
            ticketSystem = new TicketSystem();
            ticketSytesmThread = new Thread(ticketSystem);

            System.out.println("State after creating ticketSytesmThread: " + ticketSytesmThread.getState());

            ticketSytesmThread.start();
            System.out.println("State after starting mainThread: " + ticketSytesmThread.getState());

            System.out.println("Main Thread is finished");
        }
    }