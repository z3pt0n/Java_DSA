package DoublyLinkedLists.Tier2;

//✅ Problem: Insert a node after a specified value.
//
//🔢 Range: val ≤ 10⁵
//
//📘 Topics: Mid-list insertion, pointer linking
//
//🔍 Example:
//
//Input: DLL = 10 ⇄ 20 ⇄ 30, Insert = 25 after 20
//
//Output: 10 ⇄ 20 ⇄ 25 ⇄ 30
//
//✅ Use: Doubly Linked List


import DoublyLinkedLists.Node;  // Importing Node class from the package
import java.util.Scanner;

public class InsertAtIndex {

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

    // Method to insert a node at a specific index
    public void insertAtIndex(int index, int data) {
        if (index < 0) {
            System.out.println("Invalid index");
            return;
        }

        Node newNode = new Node(data);

        // If inserting at the head (index 0)
        if (index == 0) {
            if (head == null) {  // If the list is empty
                head = newNode;
                tail = newNode;  // New node is both head and tail
            } else {
                newNode.next = head;  // New node points to current head
                head.prev = newNode;  // Current head's prev points to the new node
                head = newNode;  // Head points to the new node
            }
            return;
        }

        Node current = head;
        int count = 0;

        // Traverse to the node at the given index or the end of the list
        while (current != null && count < index) {
            current = current.next;
            count++;
        }

        // If we have reached the end or the index is out of bounds
        if (current == null) {
            System.out.println("Index out of bounds");
            return;
        }

        // If inserting in the middle or end
        newNode.prev = current.prev;  // New node's prev points to the previous node
        newNode.next = current;  // New node's next points to the current node
        if (current.prev != null) {
            current.prev.next = newNode;  // Previous node's next points to the new node
        }
        current.prev = newNode;  // Current node's prev points to the new node
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

    // Main method to test the functionality
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InsertAtIndex list = new InsertAtIndex();

        // Taking input for nodes
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Insert at the end for testing
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value for node " + (i + 1) + ": ");
            int data = scanner.nextInt();
            list.insertAtLast(data);  // Insert at the end
        }

        // Print the list before insertion
        System.out.println("Doubly Linked List before insertion:");
        list.printList();  // Assuming you have a printList method

        // Inserting at a specific index
        System.out.print("Enter the index to insert at: ");
        int index = scanner.nextInt();
        System.out.print("Enter the value to insert: ");
        int value = scanner.nextInt();
        list.insertAtIndex(index, value);

        // Print the list after insertion
        System.out.println("Doubly Linked List after insertion:");
        list.printList();
    }
}

