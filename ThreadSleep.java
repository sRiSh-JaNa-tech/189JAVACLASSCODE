public class ThreadSleep {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 1: " + i);
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    System.out.println("Thread 1 interrupted");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 2: " + i);
                try {
                    Thread.sleep(1500); // Sleep for 1.5 seconds
                } catch (InterruptedException e) {
                    System.out.println("Thread 2 interrupted");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
