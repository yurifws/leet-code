package solutions.utils;

import java.util.Objects;

public class ListNode {
    public int val;
    public ListNode next;
    public boolean isEmpty;  // <-- add this

    public ListNode() { this.isEmpty = true; }
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ListNode)) return false;
        ListNode that = (ListNode) o;
        if (this.isEmpty && that.isEmpty) return true;
        if (this.isEmpty || that.isEmpty) return false;
        return this.val == that.val && Objects.equals(this.next, that.next);
    }

    @Override
    public int hashCode() {
        if (isEmpty) return 0;
        return Objects.hash(val, next);
    }
}


