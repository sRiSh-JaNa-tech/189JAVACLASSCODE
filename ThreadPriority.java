public class ThreadPriority {
    public static void main(String[] args) {
        // Create threads with different priorities
        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 running with priority: " + Thread.currentThread().getPriority());
        }, "Thread-1");
        Thread t2 = new Thread(() -> {
            System.out.println("Thread 2 running with priority: " + Thread.currentThread().getPriority());
        }, "Thread-2");
        Thread t3 = new Thread(() -> {
            System.out.println("Thread 3 running with priority: " + Thread.currentThread().getPriority());
        }, "Thread-3");

        // Set priorities
        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.NORM_PRIORITY); // 5
        t3.setPriority(Thread.MAX_PRIORITY); // 10

        // Start threads (add)
        t1.start();
        t2.start();
        t3.start();

        // Delete (stop) threads - not recommended to use stop(), so we wait for them to finish
        try {
            t1.join();
            t2.join();
            t3.join();
            System.out.println("All threads finished.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
