package SinglyLinkedLists.Tier1;

public class InsertAtPosition {
    Node head;

    public void insertAtPosition(int data, int pos) {
        if (pos == 0) {
            InsertAtBeginning list = new InsertAtBeginning();
            list.insertAtBeginning(data);
            return;
        }

        Node current = head;
        Node newNode = new Node(data);
        int currentPos = 0;

        while (current != null && currentPos < pos - 1) {
            current = current.next;
            currentPos++;
        }

        if (current != null) {
            newNode.next = current.next;
            current.next = newNode;
        } else {
            System.out.println("Position is out of bounds.");
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Main method for testing InsertAtPosition functionality
    public static void main(String[] args) {
        InsertAtPosition list = new InsertAtPosition();

        // Create a linked list by inserting elements at specific positions
        list.insertAtPosition(10, 0);  // Insert at position 0
        list.insertAtPosition(20, 1);  // Insert at position 1
        list.insertAtPosition(30, 2);  // Insert at position 2
        list.insertAtPosition(25, 2);  // Insert at position 2 (between 20 and 30)

        System.out.print("Linked List: ");
        list.printList();  // Output: 10 20 25 30
    }

}
