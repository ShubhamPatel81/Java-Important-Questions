package src.LinkedListSol;



class  Node {
    int val;
    Node next;

    Node(){}
    Node(int data){
        this.val = data;
    }
    Node (int data, Node next){
        this.val = data;
        this.next = next;
    }

}


public class SLL {

    private  static Node head = null;

    public  static void  addHead(int val){
        Node node= new Node(val);
        node.next= head;
        head=node;
    }

    public static  void addLast(int val){
        Node node = new Node(val);
        if (head == null ){
            head = node;
        }
        else {
            Node current = head;
            while (current.next != null ){
                current = current.next;
            }
            current.next = node;

        }
    }
    public static void printList() {
            Node current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        addHead(3);
        addHead(2);
        addHead(1);
        System.out.print("After addHead: ");
        printList();

        addLast(4);
        addLast(5);
        System.out.print("After addTail: ");
        printList();

//        addAtIndex(2, 99);
//        System.out.print("After addAtIndex(2, 99): ");
//        printList(); // 1 -> 2 -> 99 -> 3 -> 4 -> 5 -> null

//        deleteAtIndex(3);
//        System.out.print("After deleteAtIndex(3): ");
//        printList(); // 1 -> 2 -> 99 -> 4 -> 5 -> null

//        System.out.println("Element at index 2: " + get(2)); // 99
//        System.out.println("Element at index 10: " + get(10)); // -1 (invalid)

    }
}
