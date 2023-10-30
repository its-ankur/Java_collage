package Questions;

class ListNode {
    int value;
    ListNode next;

    public ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

public class LinkedList {
    public static void moveSmallestToHeadAndLargestToTail(ListNode head) {
        if (head == null || head.next == null) {
            // The linked list is empty or has only one element.
            return;
        }

        ListNode smallest = head;
        ListNode largest = head;
        ListNode prev = null;
        ListNode current = head;
        ListNode largestPrev = null;

        // Find the smallest and largest elements and their nodes.
        while (current != null) {
            if (current.value < smallest.value) {
                smallest = current;
            }
            if (current.value > largest.value) {
                largestPrev = prev;
                largest = current;
            }
            prev = current;
            current = current.next;
        }

        // Remove the smallest node.
        if (smallest == head) {
            head = head.next;
        } else {
            prev.next = smallest.next;
        }

        // Remove the largest node.
        if (largest == head) {
            head = head.next;
        } else {
            largestPrev.next = largest.next;
        }

        // Add the smallest node to the head.
        smallest.next = head;
        head = smallest;

        // Add the largest node to the tail, if it's not the same as the head.
        if (head != largest) {
            current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = largest;
            largest.next = null;
        }
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        head.next = new ListNode(2);
        head.next.next = new ListNode(8);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(9);

        System.out.println("Original List:");
        printList(head);

        moveSmallestToHeadAndLargestToTail(head);

        System.out.println("Modified List:");
        printList(head);
    }
}
