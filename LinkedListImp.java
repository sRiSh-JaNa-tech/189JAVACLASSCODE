public class LinkedListImp {
    static class ListNode<T> {
        T data;
        ListNode<T> next;

        ListNode(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private ListNode<Integer> head;

    // Create a new list (constructor)
    public LinkedListImp() {
        head = null;
    }

    // Add to end
    public void add(int data) {
        ListNode<Integer> newNode = new ListNode<>(data);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode<Integer> curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    // Add at index
    public void addAt(int index, int data) {
        ListNode<Integer> newNode = new ListNode<>(data);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        ListNode<Integer> curr = head;
        for (int i = 0; curr != null && i < index - 1; i++) {
            curr = curr.next;
        }
        if (curr == null) return;
        newNode.next = curr.next;
        curr.next = newNode;
    }

    // Delete by value
    public void delete(int data) {
        if (head == null) return;
        if (head.data == data) {
            head = head.next;
            return;
        }
        ListNode<Integer> curr = head;
        while (curr.next != null && curr.next.data != data) {
            curr = curr.next;
        }
        if (curr.next != null) {
            curr.next = curr.next.next;
        }
    }

    // Delete at index
    public void deleteAt(int index) {
        if (head == null) return;
        if (index == 0) {
            head = head.next;
            return;
        }
        ListNode<Integer> curr = head;
        for (int i = 0; curr.next != null && i < index - 1; i++) {
            curr = curr.next;
        }
        if (curr.next != null) {
            curr.next = curr.next.next;
        }
    }

    // Print list
    public void printList() {
        ListNode<Integer> curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
