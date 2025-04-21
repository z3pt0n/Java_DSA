package SinglyLinkedLists.Tier1;

public class InsertAtLast {
    Node head;

    public void insertAtLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

        // Main method for testing
        public static void main(String[] args) {
            InsertAtLast list = new InsertAtLast();
            list.insertAtLast(10);
            list.insertAtLast(20);
            list.insertAtLast(30);

            System.out.print("Linked List: ");
            list.printList(); // Expected: 10 20 30
        }
}
