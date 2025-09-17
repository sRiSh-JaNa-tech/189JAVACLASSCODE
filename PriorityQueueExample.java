import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements
        pq.add(10);
        pq.add(20);
        pq.add(15);

        // Display the PriorityQueue
        System.out.println("PriorityQueue: " + pq);

        // Peek at the head of the queue
        System.out.println("Head of queue (peek): " + pq.peek());

        // Remove the head of the queue
        System.out.println("Removed element (poll): " + pq.poll());

        // Display after removal
        System.out.println("PriorityQueue after poll: " + pq);
        pq.remove(15);
        System.out.println("PriorityQueue after removing 15: " + pq);
        // Remove a specific element
        pq.remove(20);
        System.out.println("PriorityQueue after removing 20: " + pq);

        // Check if queue contains an element
        System.out.println("Contains 15? " + pq.contains(15));

        // Size of the queue
        System.out.println("Size of queue: " + pq.size());

        // Clear the queue
        pq.clear();
        System.out.println("PriorityQueue after clear: " + pq);
    }
}
