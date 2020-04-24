
class Leet21 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode l3 = mergeTwoList(l1, l2);

        while (l3 != null) {
            System.out.println(l3.val);
            l3 = l3.next;
        }
    }

    public static ListNode mergeTwoList(ListNode l1, ListNode l2) {
        ListNode res = null;
        if (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                res = new ListNode(l1.val);
            } else {
                res = new ListNode(l2.val);
            }
        }
        while (true) {
            if (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
                    res.next = new ListNode(l1.val);
                    l1 = l1.next;
                } else {
                    res.next = new ListNode(l2.val);
                    l2 = l2.next;
                }
            }
        }

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}