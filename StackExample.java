import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after pushes: " + stack);
        // Peek at the top element
        System.out.println("Top element (peek): " + stack.peek());
        // Pop an element from the stack
        int removed = stack.pop();
        System.out.println("Popped element: " + removed);
        System.out.println("Stack after pop: " + stack);
        // Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
        // Search for an element
        int position = stack.search(10);
        if (position != -1) {
            System.out.println("Element 10 found at position (from top): " + position);
        } else {
            System.out.println("Element 10 not found");
        }
        // Size of the stack
        System.out.println("Stack size: " + stack.size());
        // Clear the stack
        stack.clear();
        System.out.println("Stack after clear: " + stack);
    }
}
