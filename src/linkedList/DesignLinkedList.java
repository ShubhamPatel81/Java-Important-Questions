//package src.linkedList;
//
//public class DesignLinkedList {
//
//    class Node {
//        int val;
//        Node next;
//
//        Node(int val) {
//            this.val = val;
//        }
//    }
//
//    private Node dummyHead;
//    private int size;
//
//    public DesignLinkedList() {
//        dummyHead = new Node(0); // dummy node
//        size = 0;
//    }
//
//    // Get value at index
//    public int get(int index) {
//        if (index < 0 || index >= size) {
//            return -1;
//        }
//
//        Node current = dummyHead.next;
//        for (int i = 0; i < index; i++) {
//            current = current.next;
//        }
//
//        return current.val;
//    }
//
//    // Add node at head
//    public void addAtHead(int val) {
//        addAtIndex(0, val);
//    }
//
//    // Add node at tail
//    public void addAtTail(int val) {
//        addAtIndex(size, val);
//    }
//
//    // Add node at index
//    public void addAtIndex(int index, int val) {
//        if (index > size || index < 0) {
//            return;
//        }
//
//        Node prev = dummyHead;
//        for (int i = 0; i < index; i++) {
//            prev = prev.next;
//        }
//
//        Node newNode = new Node(val);
//        newNode.next = prev.next;
//        prev.next = newNode;
//        size++;
//    }
//
//    // Delete node at index
//    public void deleteAtIndex(int index) {
//        if (index < 0 || index >= size) {
//            return;
//        }
//        Node prev = dummyHead;
//        for (int i = 0; i < index; i++) {
//            prev = prev.next;
//        }
//        prev.next = prev.next.next;
//        size--;
//    }
//
//    // Print the linked list (optional, for testing)
//    public void printList() {
//        Node current = dummyHead.next;
//        while (current != null) {
//            System.out.print(current.val + " -> ");
//            current = current.next;
//        }
//        System.out.println("null");
//    }
//
//    public static void main(String[] args) {
//
//        DesignLinkedList list = new DesignLinkedList();
//
//        list.addAtHead(10);
//        list.addAtTail(20);
//        list.addAtIndex(1, 15); // insert 15 at index 1
//        list.printList(); // Output: 10 -> 15 -> 20 -> null
//
//        System.out.println("Element at index 1: " + list.get(1)); // Output: 15
//
//        list.deleteAtIndex(1);
//        list.printList(); // Output: 10 -> 20
//    }
//}
