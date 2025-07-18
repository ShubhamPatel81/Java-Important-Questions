package src.linkedList;

public class MyLinkedList {

    private static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    private int size;
    private Node dummyNode;

    public MyLinkedList() {
        dummyNode = new Node(-1); // Initialize dummy node
        size = 0;                 // Initialize size of linked list
    }

    public int get(int index) {
        if (index < 0 || index >= size) return -1; // Index out of bounds

        Node currNode = dummyNode;
        for (int i = 0; i <= index; i++) {
            currNode = currNode.next;
        }
        return currNode.val;
    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = dummyNode.next;
        dummyNode.next = node;
        size++;
    }

    public void addAtTail(int val) {
        Node node = new Node(val);
        Node currNode = dummyNode;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = node;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index > size || index < 0) return;

        Node node = new Node(val);
        Node currNode = dummyNode;

        for (int i = 0; i < index; i++) {
            currNode = currNode.next;
        }
        node.next = currNode.next;
        currNode.next = node;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index >= size || index < 0) return;

        Node currNode = dummyNode;
        for (int i = 0; i < index; i++) {
            currNode = currNode.next;
        }
        if (currNode.next != null) {
            currNode.next = currNode.next.next;
        }
        size--;
    }

    public void printList() {
        Node curr = dummyNode.next;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(1);
        list.addAtTail(3);
        list.addAtIndex(1, 2); // Linked list becomes 1->2->3
        list.printList();

        System.out.println("Value at index 1: " + list.get(1)); // Output: 2

        list.deleteAtIndex(1); // Linked list becomes 1->3
        list.printList();
    }
}
