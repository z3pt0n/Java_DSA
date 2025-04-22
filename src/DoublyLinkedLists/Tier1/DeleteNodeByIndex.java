package DoublyLinkedLists.Tier1;

import DoublyLinkedLists.Node;
import java.util.Scanner;

public class DeleteNodeByIndex {
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

    // Method to delete a node by its index
    public void deleteNodeByIndex(int index) {
        if (head == null) {  // If the list is empty, there's nothing to delete
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        Node current = head;
        int count = 0;

        // Traverse to the node at the given index
        while (current != null && count < index) {
            current = current.next;
            count++;
        }

        // If the node is found at the specified index
        if (current != null) {
            if (current == head) {  // If the node is the first node
                head = head.next;
                if (head != null) {
                    head.prev = null;
                }
            } else if (current == tail) {  // If the node is the last node
                tail = tail.prev;
                tail.next = null;
            } else {  // If the node is somewhere in the middle
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
        } else {
            System.out.println("Index out of bounds.");
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
        DeleteNodeByIndex list = new DeleteNodeByIndex();

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

        // Taking index to delete
        System.out.print("Enter index to delete: ");
        int index = scanner.nextInt();

        // Perform deletion at the specified index
        list.deleteNodeByIndex(index);

        // Print the list after deletion
        System.out.println("Doubly Linked List after deletion:");
        list.printList();
    }
}
