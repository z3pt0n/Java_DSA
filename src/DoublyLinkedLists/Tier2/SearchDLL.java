package DoublyLinkedLists.Tier2;

// Search for a Value (Forward & Backward)
//✅ Problem: Search from head and tail.
//
//📘 Topics: Traversal, bidirectionality
//
//🔍 Example:
//
//Input: 10 ⇄ 20 ⇄ 30, Search = 30
//
//Output: true
//
//✅ Use: Doubly Linked List


import DoublyLinkedLists.Node;
import java.util.Scanner;

public class SearchDLL {
    Node head;
    Node tail;

    // Method to insert a node at the end of the doubly linked list
    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Method to search for a value in the doubly linked list using two pointers
    public boolean search(int value) {
        Node hPtr = head;  // Start from head
        Node tPtr = tail;  // Start from tail

        while (hPtr != null && tPtr != null && hPtr != tPtr) {
            if (hPtr.data == value || tPtr.data == value) {
                return true;  // If found, return true
            }
            hPtr = hPtr.next;  // Move hPtr forward
            tPtr = tPtr.prev;  // Move tPtr backward
        }

        // Check the last middle element if both pointers meet
        if (hPtr != null && hPtr.data == value) {
            return true;
        }

        return false;  // Value not found
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
        SearchDLL list = new SearchDLL();

        // Taking input for nodes
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value for node " + (i + 1) + ": ");
            int data = scanner.nextInt();
            list.insertAtLast(data);
        }

        // Print the list
        System.out.println("Doubly Linked List:");
        list.printList();

        // Searching for a value
        System.out.print("Enter value to search: ");
        int value = scanner.nextInt();
        boolean found = list.search(value);

        if (found) {
            System.out.println("Value " + value + " found in the list.");
        } else {
            System.out.println("Value " + value + " not found in the list.");
        }
    }
}
