package linkedlist;

public class AddTwoNumbers {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode addTwoNumbers(ListNode firstList, ListNode secondList) {
        ListNode head = null, prev = null;
        int carry = 0;
        while (firstList != null || secondList != null) {
            int val1 = firstList != null ? firstList.val : 0;
            int val2 = secondList != null ? secondList.val : 0;
            int sum = val1 + val2 + carry;
            carry = sum / 10;
            int val = sum % 10;
            ListNode curr = new ListNode(val);
            if (head == null) {
                head = curr;
            }
            if (prev != null) {
                prev.next = curr;
            }
            prev = curr;
            firstList = firstList != null ? firstList.next : null;
            secondList = secondList != null ? secondList.next : null;
        }
        if(carry > 0) {
            ListNode extraNode = new ListNode(carry);
            prev.next = extraNode;
        }
        return head;
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
        ListNode list1 = new ListNode(2);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(3);

        ListNode list2 = new ListNode(5);
        list2.next = new ListNode(6);
        list2.next.next = new ListNode(4);

        System.out.println("List 1 : ");
        printList(list1);

        System.out.println("List 2 : ");
        printList(list2);

        ListNode addedNode = addTwoNumbers(list1,list2);

        System.out.println("Addition of list1 and list2 is : ");
        printList(addedNode);
    }
}
