package src.LinkedListSol;

import java.util.LinkedList;
import java.util.Scanner;

public class Inventory_System_Operation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        System.out.println("Enter the products : ");
        System.out.println("For exit press 1: ");

        while (true) {
            String product = sc.next();
            if (product.equals("1")) {
                break;
            }
            list.add(product);
        }
        System.out.println("product inverntory: ");
        for (String item : list) {
            if (list.isEmpty()) {
                System.out.println("List Is Empty");
            } else {
                System.out.println(" " + item);
            }
        }
    }}