class SLL{
    int val;
    SLL next;
    SLL(){}
    SLL(int x){this.val = x;}
    SLL(int x, SLL next){this.val = x; this.next = next;}
}

class DLL{
    
}

class LinkedList{
    SLL head;
    void insert(int val){
        SLL newNode = new SLL(val);
        if (head == null) {
            head = newNode;
            return;
        }
        SLL temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    void delete(int val){
        if (head == null) return;
        if (head.val == val) {
            head = head.next;
            return;
        }
        SLL temp = head;
        while (temp.next != null && temp.next.val != val) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }
    boolean search(int val){
        SLL temp = head;
        while(temp != null){
            if(temp.val == val){
                return true;
            }
        }
        return false;
    }
}

public class LinkedListExample{
    public static void main(String[] args) {
        SLL head = new SLL(0);
        SLL newNode = new SLL(10);
        head.next = newNode;
        while(head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}