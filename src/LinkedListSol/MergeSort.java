package src.LinkedListSol;

import java.util.LinkedList;

class  ListNode1{

    int val;
    ListNode1 next;
    ListNode1(){}
    ListNode1(int val){
        this.val = val;
    }
    ListNode1(int val, ListNode1 next){
        this.val =val;
        this.next = next;
    }
}
public class MergeSort {

    public static ListNode1 mergeTwoLists(ListNode1 list1, ListNode1 list2) {
        ListNode1 temp = new ListNode1(0);
        ListNode1 returnHead = temp;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                temp.next = list1;
                list1 = list1.next;
            }
            else{
                temp.next = list2;
                list2 = list2.next;
            }

            temp = temp.next;
        }
        if(list1 != null) temp.next = list1;
        if(list2 != null) temp.next = list2;

        return returnHead.next;
    }
    public static void  printList(ListNode1 head){
        if (head == null) return ;
        ListNode1 current= head;
        while (current != null){
            System.out.print(current.val+"->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {


        ListNode1 list1= new ListNode1(1);
        list1.next =new ListNode1(4);
        list1.next.next = new ListNode1(8);

        System.out.print("List 1:");
        printList(list1);

        ListNode1 list2 = new ListNode1(2);
        list2.next = new ListNode1(5);
        list2.next.next = new ListNode1(7);

        System.out.print("List 2:");
        printList(list2);

        ListNode1 node= mergeTwoLists(list1, list2);

        printList(node);
    }
}
