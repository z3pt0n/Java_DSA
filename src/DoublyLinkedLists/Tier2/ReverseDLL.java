package DoublyLinkedLists.Tier2;

//Reverse a Doubly Linked List
//✅ Problem: Reverse the full DLL.
//
//🔢 Range: n ≤ 10⁵
//
//📘 Topics: Pointer flipping
//
//🔍 Example:
//
//Input: 1 ⇄ 2 ⇄ 3
//
//Output: 3 ⇄ 2 ⇄ 1
//
//✅ Use: Doubly Linked List


import DoublyLinkedLists.Node;
import java.util.Scanner;

public class ReverseDLL {
    Node head;
    Node tail;

    // Method to reverse the doubly linked list
    public void reverse() {
        if (head == null) {
            return;  // If the list is empty, do nothing
        }

        Node current = head;
        Node temp = null;

        // Swap next and prev pointers for each node
        while (current != null) {
            temp = current.next;
            current.next = current.prev;
            current.prev = temp;
            current = current.prev;  // Move to the next node (which is actually the previous one now)
        }

        // Swap head and tail
        temp = head;
        head = tail;
        tail = temp;
    }

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
        ReverseDLL list = new ReverseDLL();

        // Taking input for nodes
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value for node " + (i + 1) + ": ");
            int data = scanner.nextInt();
            list.insertAtLast(data);
        }

        // Print the list before reversing
        System.out.println("Doubly Linked List before reversing:");
        list.printList();

        // Reverse the list
        list.reverse();

        // Print the list after reversing
        System.out.println("Doubly Linked List after reversing:");
        list.printList();
    }
}
