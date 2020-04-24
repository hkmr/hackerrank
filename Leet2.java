class Leet2 {
    public static void main(String[] args) {

        ListNode l1 = new ListNode(9);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);
        l2.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next.next.next = new ListNode(9);

        // System.out.println(getNum(l1));

        ListNode res = add(l1, l2);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }

    }

    public static ListNode add(ListNode l1, ListNode l2) {

        long sum = getNum(l1) + getNum(l2);
        System.out.println("n1 = " + getNum(l1) + " n2 = " + getNum(l2) + " sum = " + sum);

        long rem = sum % 10;
        ListNode res = new ListNode((int) rem);
        sum = sum / 10;
        ListNode tmp = res;
        while (sum > 0) {
            rem = sum % 10;
            res.next = new ListNode((int) rem);
            sum = sum / 10L;
            res = res.next;
        }

        return tmp;
    }

    public static long getNum(ListNode l) {
        long res = 0L, t = 1;

        while (l != null) {
            res = res + l.val * t;
            t = t * 10;
            l = l.next;
        }

        return res;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    };
}