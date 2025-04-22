package DoublyLinkedLists.Tier3;

//Convert DLL to Circular DLL
//✅ Problem: Connect head’s prev to tail & tail’s next to head.
//
//📘 Topics: Circular linking
//
//🔍 Example:
//
//Input: 1 ⇄ 2 ⇄ 3
//
//Output: 1 ⇄ 2 ⇄ 3 ⇄ 1 (circular)
//
//✅ Use: Doubly Linked List



import DoublyLinkedLists.Node;
import java.util.Scanner;

public class DLLtoCLL {
    Node head;
    Node tail;

    // Insert at last to build initial DLL
    public void insertAtLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Convert DLL to CLL
    public void convertToCircular() {
        if (head == null || tail == null) return;
        tail.next = head;
        head.prev = tail;
    }

    // Print the circular doubly linked list (safely, avoid infinite loop)
    public void printCircularList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DLLtoCLL list = new DLLtoCLL();

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value for node " + (i + 1) + ": ");
            int data = scanner.nextInt();
            list.insertAtLast(data);
        }

        // Convert to circular DLL
        list.convertToCircular();

        // Print the circular DLL
        System.out.println("Circular Doubly Linked List:");
        list.printCircularList();
    }
}
