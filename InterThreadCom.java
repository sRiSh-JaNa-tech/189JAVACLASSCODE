class Basket{
    int data;
    boolean empty = true;
    synchronized void produce(int value){
        if(!empty){
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println(e);
            }
            data = value;
            empty = false;
            System.out.println("Produced:" + data);
            notify();
        }
    }
}
public class InterThreadCom{
    public static void main(String[] args) {
        Basket b = new Basket();
        Thread producer = new Thread(() -> {
            int value = 0;
            while (true) {
                b.produce(value++);
                try {
                    Thread.sleep(1000); // Simulate time taken to produce
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        });

        Thread consumer = new Thread(() -> {
            while (true) {
                b.consume();
                try {
                    Thread.sleep(1500); // Simulate time taken to consume
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        });

        producer.start();
        consumer.start();
    }
}