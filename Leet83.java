class Leet83 {
    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        l.next = new ListNode(1);
        l.next.next = new ListNode(2);
        l.next.next.next = new ListNode(3);
        l.next.next.next.next = new ListNode(3);

        ListNode res = deleteDuplicates(l);

        while (res != null) {
            System.out.print(res.val + " -> ");
            res = res.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode tmp = head;

        while (tmp.next != null) {
            if (tmp.val == tmp.next.val) {
                tmp.next = tmp.next.next;
            } else {
                tmp = tmp.next;
            }
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}