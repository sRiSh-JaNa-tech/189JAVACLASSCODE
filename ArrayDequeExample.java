public class ArrayDequeExample {
    public static void main(String[] args) {
        java.util.ArrayDeque<Integer> deque = new java.util.ArrayDeque<>();

        // Adding elements at the end (tail)
        deque.add(10);
        deque.addLast(20);
        deque.offer(30);
        deque.offerLast(40);

        // Adding elements at the front (head)
        deque.addFirst(5);
        deque.offerFirst(1);

        System.out.println("Deque after additions: " + deque);

        // Removing elements from the front (head)
        System.out.println("Removed from front: " + deque.remove());
        System.out.println("Removed from front: " + deque.removeFirst());
        System.out.println("Polled from front: " + deque.poll());
        System.out.println("Polled from front: " + deque.pollFirst());

        // Removing elements from the end (tail)
        deque.addLast(50);
        deque.addLast(60);
        System.out.println("Deque before removing from end: " + deque);
        System.out.println("Removed from end: " + deque.removeLast());
        System.out.println("Polled from end: " + deque.pollLast());

        // Peek operations
        deque.addFirst(100);
        System.out.println("Peek front: " + deque.peek());
        System.out.println("Peek front: " + deque.peekFirst());
        System.out.println("Peek end: " + deque.peekLast());

        // Check if deque contains an element
        System.out.println("Contains 20? " + deque.contains(20));

        // Size of deque
        System.out.println("Size: " + deque.size());

        // Iterating through deque
        System.out.print("Iterating: ");
        for (Integer num : deque) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Clearing deque
        deque.clear();
        System.out.println("Deque after clear: " + deque);
    }
}
