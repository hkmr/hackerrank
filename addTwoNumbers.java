class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        // l1.next = new ListNode(4);
        // l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);
        l2.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next = new ListNode(9);

        ListNode l = addTwo(l1, l2);
        while (l != null) {
            System.out.println(l.val);
            l = l.next;
        }
    }

    public static ListNode addTwo(ListNode l1, ListNode l2) {
        int n1 = getNum(l1);
        int n2 = getNum(l2);
        int sum = n1 + n2;
        return getList(sum);
    }

    public static int getNum(ListNode l) {
        ListNode p = l;
        int n = 0, i = 1;
        while (p != null) {
            n += p.val * i;
            i *= 10;
            p = p.next;
        }
        return n;
    }

    public static ListNode getList(int num) {
        ListNode l = new ListNode(num % 10);
        ListNode start = l;
        num = num / 10;
        while (num >= 1) {
            int rem = num % 10;
            num = num / 10;
            l.next = new ListNode(rem);
            l = l.next;
        }
        return start;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int n) {
        val = n;
    }
}