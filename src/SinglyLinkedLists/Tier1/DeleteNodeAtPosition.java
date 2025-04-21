package SinglyLinkedLists.Tier1;

public class DeleteNodeAtPosition {
    public void deleteNodeAtPosition(InsertAtLast list, int pos){
        Node head = list.head;

        if (head == null) {
            System.out.println("List is empty! No nodes to delete.");
            return;
        }

        if (pos == 0) {
            list.head = head.next;
            return;
        }

        Node cur = head;
        int curPos = 0;

        while (cur != null && curPos < pos - 1) {
            cur = cur.next;
            curPos++;
        }

        if (cur == null || cur.next == null) {
            System.out.println("Invalid position! No node at position " + pos + " to delete.");
            return;
        }

        cur.next = cur.next.next;
        System.out.println("Node at position " + pos + " deleted successfully.");
    }

    public static void main(String[] args) {
        InsertAtLast list = new InsertAtLast();
        list.insertAtLast(10);
        list.insertAtLast(20);
        list.insertAtLast(30);
        list.insertAtLast(40);
        list.insertAtLast(50);

        System.out.println("Before deletion:");
        list.printList();

        DeleteNodeAtPosition deleter = new DeleteNodeAtPosition();
        int pos = 2;
        deleter.deleteNodeAtPosition(list, pos);

        System.out.println("After deleting node at position " + pos + ":");
        list.printList();
    }
}
