package SinglyLinkedLists.Tier2;

//Reverse a Linked List
//✅ Problem: Reverse the entire list.
//
//🔢 Range: n ≤ 10⁵
//
//📘 Topics: Pointers, Iterative/Recursive
//
//🔍 Example:
//
//Input: 1 → 2 → 3
//
//Output: 3 → 2 → 1
//
//✅ Use: Singly Linked List

public class ReverseAList {
    Node head;

    // Reverses the list
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next;

        while (current != null) {
            next = current.next;   // Store next node
            current.next = prev;   // Reverse the link
            prev = current;        // Move prev ahead
            current = next;        // Move current ahead
        }

        head = prev; // Update head to new first node
    }

    // Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null)
            curr = curr.next;
        curr.next = newNode;
    }

    // Print list
    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseAList list = new ReverseAList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Original List:");
        list.printList();

        list.reverse();

        System.out.println("Reversed List:");
        list.printList();
    }
}


