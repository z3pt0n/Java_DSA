package DoublyLinkedLists.Tier1;

//Delete from End
//✅ Problem: Delete the last node.
//
//🔢 Range: Length ≥ 1
//
//📘 Topics: Tail tracking
//
//🔍 Example:
//
//Input: 3 ⇄ 4 ⇄ 5
//
//Output: 3 ⇄ 4
//
//✅ Use: Doubly Linked List

import DoublyLinkedLists.Node;
import java.util.Scanner;

public class DeleteFromEnd {
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

    // Method to delete a node at the end of the doubly linked list
    public void deleteFromEnd() {
        if (head == null) {  // If the list is empty, there's nothing to delete
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        if (head == tail) {  // If there's only one element in the list
            head = null;  // Set head to null
            tail = null;  // Set tail to null as well (no nodes left)
        } else {  // If there are multiple nodes
            tail = tail.prev;  // Move the tail pointer to the previous node
            tail.next = null;  // Set the next pointer of the new tail to null
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
        DeleteFromEnd list = new DeleteFromEnd();

        // Take input for nodes
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value for node " + (i + 1) + ": ");
            int data = scanner.nextInt();
            list.insertAtLast(data);  // Insert at the end
        }

        // Print the list before deletion
        System.out.println("Doubly Linked List before deletion:");
        list.printList();

        // Perform deletion at the end
        list.deleteFromEnd();

        // Print the list after deletion
        System.out.println("Doubly Linked List after deletion:");
        list.printList();
    }
}

