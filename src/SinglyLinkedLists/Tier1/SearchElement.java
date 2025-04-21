package SinglyLinkedLists.Tier1;

public class SearchElement {
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

    public boolean search(int key) {
        Node current = head;
        int position = 0;
        while (current != null) {
            if (current.data == key) {
                System.out.println("Element " + key + " found at position: " + position);
                return true;
            }
            current = current.next;
            position++;
        }
        System.out.println("Element " + key + " not found in the list.");
        return false;
    }

    public static void main(String[] args) {
        SearchElement list = new SearchElement();
        list.insertAtLast(10);
        list.insertAtLast(20);
        list.insertAtLast(30);
        list.insertAtLast(40);

        int key = 30;
        list.search(key);

        key = 100;
        list.search(key);
    }
}
