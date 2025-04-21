package SinglyLinkedLists.Tier3;

public class RemoveNthFromEnd {
    Node head;

    public void removeNthFromEnd(int n) {
        Node dummy = new Node(0);  // Dummy node before head
        dummy.next = head;

        Node fast = dummy;
        Node slow = dummy;

        // Move fast ahead by n+1 steps to create gap
        for (int i = 0; i <= n; i++) {
            if (fast == null) return; // Edge case: n > length
            fast = fast.next;
        }

        // Move both until fast reaches end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Skip the target node
        slow.next = slow.next.next;

        // Update head in case we removed the first node
        head = dummy.next;
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
        RemoveNthFromEnd list = new RemoveNthFromEnd();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        System.out.println("Before deletion:");
        list.printList();

        int n = 2;
        list.removeNthFromEnd(n);

        System.out.println("After removing " + n + "th node from end:");
        list.printList();
    }
}
