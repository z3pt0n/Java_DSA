package DoublyLinkedLists.Tier1;

//✅ Problem: Add a node at the end of a DLL.
//
//🔢 Range: 1 ≤ val ≤ 10⁵
//
//📘 Topics: DLL traversal, tail insert
//
//🔍 Example:
//
//Input: Head = 1 ⇄ 2 ⇄ 3, Insert = 4
//
//Output: 1 ⇄ 2 ⇄ 3 ⇄ 4
//
//✅ Use: Doubly Linked List

import DoublyLinkedLists.Node;  // Importing the Node class from dll package
import java.util.Scanner;

public class InsertAtLast {
    Node head;
    Node tail;

    // Method to insert a node at the end of the doubly linked list
    public void insertAtLast(int data) {
        Node newNode = new Node(data);  // Create a new node with the given data

        if (head == null) {  // If the list is empty, both head and tail will point to the new node
            head = newNode;
            tail = newNode;  // New node becomes both head and tail
        } else {  // If the list is not empty
            newNode.prev = tail;  // New node's prev points to the current tail
            tail.next = newNode;  // Current tail's next points to the new node
            tail = newNode;  // Update the tail pointer to point to the new node
        }
    }

    // Method to print the doubly linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InsertAtLast list = new InsertAtLast();

        // Taking input
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value for node " + (i + 1) + ": ");
            int data = scanner.nextInt();
            list.insertAtLast(data);  // Insert at the end
        }

        // Print the list after insertions
        System.out.println("Doubly Linked List after insertions:");
        list.printList();
    }
}
