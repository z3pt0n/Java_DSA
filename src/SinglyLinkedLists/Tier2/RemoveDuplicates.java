package SinglyLinkedLists.Tier2;

//Remove Duplicates (Sorted List)
//✅ Problem: Remove adjacent duplicates in a sorted list.
//
//🔍 Example:
//
//Input: 1 → 1 → 2 → 3 → 3
//
//Output: 1 → 2 → 3
//
//📘 Topics: Pointer manipulation
//
//✅ Use: Singly Linked List
public class RemoveDuplicates {
    Node head;

    // Remove duplicates in a sorted linked list
    public void removeDuplicates() {
        if (head == null) return;

        Node current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

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

    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RemoveDuplicates list = new RemoveDuplicates();
        list.insert(10);
        list.insert(20);
        list.insert(20);
        list.insert(30);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(50);

        System.out.println("Original List:");
        list.printList();

        list.removeDuplicates();

        System.out.println("List after removing duplicates:");
        list.printList();
    }
}
