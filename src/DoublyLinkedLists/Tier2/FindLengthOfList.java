package DoublyLinkedLists.Tier2;

//Find Length of DLL
//✅ Problem: Count the number of nodes.
//
//📘 Topics: Traversal
//
//🔍 Example:
//
//Input: 1 ⇄ 2 ⇄ 3 ⇄ 4
//
//Output: 4
//
//✅ Use: Doubly Linked List


import DoublyLinkedLists.Node;

public class FindLengthOfList {
    Node head;

    // Method to find the length of the doubly linked list
    public int getLength() {
        int length = 0;
        Node current = head;

        // Traverse the list from head to tail
        while (current != null) {
            length++;
            current = current.next;  // Move to the next node
        }

        return length;  // Return the length of the list
    }

    // Method to insert a node at the end of the doubly linked list
    public void insertAtLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    // Method to print the list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        FindLengthOfList list = new FindLengthOfList();

        // Insert nodes into the list
        list.insertAtLast(10);
        list.insertAtLast(20);
        list.insertAtLast(30);
        list.insertAtLast(40);

        // Print the list
        System.out.println("Doubly Linked List:");
        list.printList();

        // Find and print the length of the list
        System.out.println("Length of the list: " + list.getLength());
    }
}
