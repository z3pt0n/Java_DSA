package DoublyLinkedLists.Tier3;

// Delete a Node by Value
//✅ Problem: Delete the first occurrence of a given value.
//
//📘 Topics: Traversal, pointer unlinking
//
//🔍 Example:
//
//Input: 1 ⇄ 2 ⇄ 3 ⇄ 4, Delete = 3
//
//Output: 1 ⇄ 2 ⇄ 4
//
//✅ Use: Doubly Linked List


import DoublyLinkedLists.Node;
import java.util.Scanner;

public class DeleteByValue {
    Node head;
    Node tail;

    // Insert at end
    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Print list
    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) System.out.print(" ⇄ ");
            curr = curr.next;
        }
        System.out.println();
    }

    // Delete node by value
    public void deleteByValue(int value) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        while (current != null && current.data != value) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Value not found.");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else if (current == head) {
            head = head.next;
            head.prev = null;
        } else if (current == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DeleteByValue list = new DeleteByValue();

        // Insert values
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value for node " + (i + 1) + ": ");
            list.insertAtLast(scanner.nextInt());
        }

        // Show original list
        System.out.println("Original DLL:");
        list.printList();

        // Delete by value
        System.out.print("Enter value to delete: ");
        int valToDelete = scanner.nextInt();
        list.deleteByValue(valToDelete);

        // Show list after deletion
        System.out.println("DLL after deleting value " + valToDelete + ":");
        list.printList();
    }
}
