package DoublyLinkedLists.Tier1;

// ✅ Problem: Add a node at the start of a DLL.
//
// 🔢 Range: 1 ≤ val ≤ 10⁵
//
// 📘 Topics: DLL basics, pointer handling
//
// 🔍 Example:
//
// Input: Head = 10 ⇄ 20, Insert = 5
//
// Output: 5 ⇄ 10 ⇄ 20
//
// ✅ Use: Doubly Linked List

import java.util.Scanner;
import DoublyLinkedLists.Node;

public class InsertAtBeginning {

    // Node class for the doubly linked list
//    public static class Node {
//        public int data;
//        public Node next;
//        public Node prev;
//
//        public Node(int data) {
//            this.data = data;
//            this.next = null;
//            this.prev = null;
//        }
//    }
//    This Node is not needed since we're importing it
//    from Node.java created under DLL folder directly.


    // Class for the Doubly Linked List
    public static class DoublyLinkedList {
        Node head;
        Node tail;

        // Method to insert a node at the beginning of the DLL
        public void insertAtBeginning(int data) {
            Node newNode = new Node(data);

            // Case 1: If the list is empty
            if (head == null) {
                head = newNode;
                tail = newNode; // New node becomes both head and tail
            }
            // Case 2: If the list is not empty
            else {
                newNode.next = head;   // newNode's next points to the current head
                head.prev = newNode;    // Current head's prev points to the new node
                head = newNode;         // The head now becomes the new node
            }
        }

        // Method to print the list from head to tail
        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create a Scanner to read input
        Scanner scanner = new Scanner(System.in);

        // Create a new Doubly Linked List
        DoublyLinkedList list = new DoublyLinkedList();

        // Reading input for the number of nodes to insert at the beginning
        System.out.print("Enter the number of nodes to insert: ");
        int n = scanner.nextInt();

        // Insert each node at the beginning
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value to insert: ");
            int value = scanner.nextInt();
            list.insertAtBeginning(value);
        }

        // Print the list after insertion
        System.out.println("The list after insertion:");
        list.printList();

        // Close the scanner
        scanner.close();
    }
}