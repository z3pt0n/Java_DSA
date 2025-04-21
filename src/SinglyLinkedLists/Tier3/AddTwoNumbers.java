package SinglyLinkedLists.Tier3;

public class AddTwoNumbers {

    public Node addTwoNumbers(Node l1, Node l2) {
        Node dummy = new Node(0);  // Dummy node to ease building the result
        Node current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int val1 = (l1 != null) ? l1.data : 0;
            int val2 = (l2 != null) ? l2.data : 0;

            int sum = val1 + val2 + carry;
            carry = sum / 10;
            int digit = sum % 10;

            current.next = new Node(digit);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (carry > 0) {
            current.next = new Node(carry);
        }

        return dummy.next;
    }

    // Utility method to print a list
    public void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    // Utility method to insert values to a list
    public Node insertList(int[] values) {
        Node head = null, tail = null;
        for (int val : values) {
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
                tail = head;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        AddTwoNumbers adder = new AddTwoNumbers();

        int[] num1 = {2, 4, 3}; // 342
        int[] num2 = {5, 6, 4}; // 465

        Node l1 = adder.insertList(num1);
        Node l2 = adder.insertList(num2);

        System.out.print("List 1: ");
        adder.printList(l1);
        System.out.print("List 2: ");
        adder.printList(l2);

        Node result = adder.addTwoNumbers(l1, l2);
        System.out.print("Sum:    ");
        adder.printList(result);
    }
}
