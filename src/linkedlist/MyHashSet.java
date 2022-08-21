package linkedlist;

public class MyHashSet {
    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    private int size;
    private ListNode[] array;

    /** Initialize your data structure here. */
    public MyHashSet() {
        this.size = 100;
        this.array = new ListNode[100];
    }

    public void add(int key) {
        int index = key % this.size;
        if(this.array[index] == null) {
            this.array[index] = new ListNode(key);
            return;
        } else {
            ListNode p = this.array[index];
            while(p != null && p.val != key)
                p = p.next;

            if(p != null)
                return;

            ListNode newHead = new ListNode(key);
            newHead.next = this.array[index];
            this.array[index] = newHead;
        }
    }

    public void remove(int key) {
        int index = key % this.size;
        if(this.array[index] == null) {
            return;
        } else {
            ListNode p = this.array[index];

            if(p.val == key) {
                this.array[index] = p.next;
                return;
            }

            while(p.next != null && p.next.val != key)
                p = p.next;
            if(p.next == null)
                return;

            p.next = p.next.next;
        }
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int index = key % this.size;
        if(this.array[index] == null)
            return false;
        ListNode p = this.array[index];
        while(p != null && p.val != key)
            p = p.next;
        return p != null;
    }

    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);      // set = [1]
        myHashSet.add(2);      // set = [1, 2]
        myHashSet.contains(1); // return True
        myHashSet.contains(3); // return False, (not found)
        myHashSet.add(2);      // set = [1, 2]
        myHashSet.contains(2); // return True
        myHashSet.remove(2);   // set = [1]
        myHashSet.contains(2); // return False, (already removed)
    }
}
