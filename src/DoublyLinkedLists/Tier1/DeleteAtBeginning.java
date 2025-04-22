package DoublyLinkedLists.Tier1;

// Delete from Beginning
//✅ Problem: Delete the first node of DLL.
//
//🔢 Range: Length ≥ 1
//
//📘 Topics: Pointer update
//
//🔍 Example:
//
//Input: Head = 7 ⇄ 8 ⇄ 9
//
//Output: 8 ⇄ 9
//
//✅ Use: Doubly Linked List


import DoublyLinkedLists.Node;

import java.util.Scanner;

public class DeleteAtBeginning {
    Node head;
    Node tail;

    // Method to delete a node at the beginning of the doubly linked list
    public void deleteAtBeginning() {
        if (head == null) {  // If the list is empty, there's nothing to delete
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        if (head == tail) {  // If there's only one element in the list
            head = null;  // Set head to null
            tail = null;  // Set tail to null as well (no nodes left)
        } else {  // If there are multiple nodes
            head = head.next;  // Move the head pointer to the next node
            head.prev = null;  // Set the prev pointer of the new head to null
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

    // Method to insert at the end of the list (used for testing)
    public void insertAtLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {  // If the list is empty
            head = newNode;
            tail = newNode;  // New node becomes both head and tail
        } else {  // If the list is not empty
            newNode.prev = tail;  // New node's prev points to current tail
            tail.next = newNode;  // Current tail's next points to the new node
            tail = newNode;  // Update the tail to point to the new node
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DeleteAtBeginning list = new DeleteAtBeginning();

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

        // Perform deletion at the beginning
        list.deleteAtBeginning();

        // Print the list after deletion
        System.out.println("Doubly Linked List after deletion:");
        list.printList();
    }
}
