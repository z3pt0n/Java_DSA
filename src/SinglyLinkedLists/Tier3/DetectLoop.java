package SinglyLinkedLists.Tier3;

public class DetectLoop {
    Node head;

    public boolean hasLoop() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;         // Move 1 step
            fast = fast.next.next;    // Move 2 steps

            if (slow == fast) {
                return true; // Loop detected
            }
        }

        return false; // No loop
    }

    // Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public static void main(String[] args) {
        DetectLoop list = new DetectLoop();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        // Creating a loop manually: 5 → 2
        list.head.next.next.next.next.next = list.head.next;

        if (list.hasLoop()) {
            System.out.println("Cycle detected in the linked list.");
        } else {
            System.out.println("No cycle in the linked list.");
        }
    }
}
