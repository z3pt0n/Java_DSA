package SinglyLinkedLists.Tier2;

public class FindKthFromEnd {
    Node head;

    public Node findKthFromEnd(int k) {
        if (head == null || k <= 0) return null;

        Node fast = head;
        Node slow = head;

        for (int i = 0; i < k; i++) {
            if (fast == null) return null;
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
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
        FindKthFromEnd list = new FindKthFromEnd();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        System.out.println("Original List:");
        list.printList();

        int k = 2;
        Node kthNode = list.findKthFromEnd(k);
        if (kthNode != null) {
            System.out.println("The " + k + "th node from the end is: " + kthNode.data);
        } else {
            System.out.println("The list doesn't have " + k + " nodes.");
        }
    }
}
