package linkedlist;

public class RemoveNthNodeFromEnd {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode first = newHead;
        ListNode second = newHead;

        while(n>0){
            first = first.next;
            n--;
        }

        while(first.next!=null){
            first = first.next;
            second=second.next;
        }

        second.next = second.next.next;
        return newHead.next;
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

        int n = 2;
        ListNode node = removeNthFromEnd(head,n);

        printList(node);
    }
}
