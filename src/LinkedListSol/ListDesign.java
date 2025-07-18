package src.LinkedListSol;

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class ListDesign {
    private static ListNode head = null;
    private static int size = 0;

    // Add at head
    public static void addHead(int val) {
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;
        size++;
    }

    // Add at tail
    public static void addTail(int val) {
        ListNode node = new ListNode(val);
        if (head == null) {
            head = node;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
        size++;
    }

    // Add at index
    public static void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {
            addHead(val);
            return;
        }

        ListNode current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        ListNode node = new ListNode(val);
        node.next = current.next;
        current.next = node;
        size++;
    }

    // Delete at index
    public static void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {
            head = head.next;
        } else {
            ListNode current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    // Get value at index
    public static int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        ListNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.val;
    }

    // Print the list
    public static void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method to test
    public static void main(String[] args) {
        addHead(3);
        addHead(2);
        addHead(1);
        System.out.print("After addHead: ");
        printList(); // 1 -> 2 -> 3 -> null

        addTail(4);
        addTail(5);
        System.out.print("After addTail: ");
        printList(); // 1 -> 2 -> 3 -> 4 -> 5 -> null

        addAtIndex(2, 99);
        System.out.print("After addAtIndex(2, 99): ");
        printList(); // 1 -> 2 -> 99 -> 3 -> 4 -> 5 -> null

        deleteAtIndex(3);
        System.out.print("After deleteAtIndex(3): ");
        printList(); // 1 -> 2 -> 99 -> 4 -> 5 -> null

        System.out.println("Element at index 2: " + get(2)); // 99
        System.out.println("Element at index 10: " + get(10)); // -1 (invalid)
    }
}
