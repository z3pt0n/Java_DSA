package DoublyLinkedLists.Tier3;

//Check if DLL is a Palindrome
//✅ Problem: Determine if the list reads the same forward and backward.
//
//📘 Topics: Bidirectional traversal
//
//🔍 Example:
//
//Input: 1 ⇄ 2 ⇄ 3 ⇄ 2 ⇄ 1
//
//Output: true
//
//✅ Use: Doubly Linked List


import DoublyLinkedLists.Node;
import java.util.Scanner;

public class PalindromeCheck {
    Node head;
    Node tail;

    // Insert at end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Check if DLL is a palindrome
    public boolean isPalindrome() {
        Node left = head;
        Node right = tail;

        while (left != null && right != null && left != right && left.prev != right) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.prev;
        }
        return true;
    }

    // Print DLL
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) System.out.print(" ⇄ ");
            current = current.next;
        }
        System.out.println();
    }

    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PalindromeCheck list = new PalindromeCheck();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.insertAtEnd(sc.nextInt());
        }

        System.out.println("\nYour Doubly Linked List:");
        list.printList();

        System.out.println("\nIs Palindrome? " + (list.isPalindrome() ? "Yes ✅" : "No ❌"));
    }
}
