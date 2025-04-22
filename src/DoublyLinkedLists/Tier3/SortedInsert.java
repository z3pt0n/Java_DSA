package DoublyLinkedLists.Tier3;

// Insert in Sorted Doubly Linked List
//✅ Problem: Insert a node while maintaining sorted order.
//
//📘 Topics: Sorted insertion
//
//🔍 Example:
//
//Input: 10 ⇄ 20 ⇄ 30, Insert = 25
//
//Output: 10 ⇄ 20 ⇄ 25 ⇄ 30
//
//✅ Use: Doubly Linked List


import DoublyLinkedLists.Node;
import java.util.Scanner;

public class SortedInsert {
    Node head;
    Node tail;

    // Method to insert a node into a sorted doubly linked list
    public void insertSorted(int data) {
        Node newNode = new Node(data);

        // If list is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // If the new node should be inserted at the beginning
        if (data < head.data) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            return;
        }

        // If the new node should be inserted at the end
        if (data >= tail.data) {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            return;
        }

        // Insert in the middle
        Node current = head;
        while (current != null && current.data < data) {
            current = current.next;
        }

        newNode.prev = current.prev;
        newNode.next = current;
        current.prev.next = newNode;
        current.prev = newNode;
    }

    // Method to print the list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + (current.next != null ? " ⇄ " : ""));
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SortedInsert list = new SortedInsert();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of nodes to insert (sorted): ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value for node " + (i + 1) + ": ");
            int data = scanner.nextInt();
            list.insertSorted(data);
        }

        System.out.println("Sorted Doubly Linked List:");
        list.printList();
    }
}
