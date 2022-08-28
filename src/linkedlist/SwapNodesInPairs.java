package linkedlist;

public class SwapNodesInPairs {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        ListNode current = head;

        dummy.next = head;

        while(current != null && current.next != null){
            prev.next = current.next;
            current.next = current.next.next;
            prev.next.next = current;
            current = current.next;
            prev = prev.next.next;
        }

        return dummy.next;
    }

    public static void printList(ListNode node) {
        ListNode temp = node;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.println("Original list is : ");
        printList(head);

        ListNode swappedNode = swapPairs(head);

        System.out.println("List after swapping pairs is : ");
        printList(swappedNode);
    }
}
