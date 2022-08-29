package linkedlist;

public class RotateList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null)
            return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy, slow = dummy;

        int i;
        for (i = 0; fast.next != null; i++)
            fast = fast.next;

        for (int j = i - k % i; j > 0; j--)
            slow = slow.next;

        fast.next = dummy.next;
        dummy.next = slow.next;
        slow.next = null;

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
        head.next.next.next.next = new ListNode(5);

        printList(head);

        ListNode node = rotateRight(head,3);

        printList(node);
    }
}
