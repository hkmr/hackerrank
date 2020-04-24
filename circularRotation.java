class CircularRotation {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5 };
        int[] q = { 1, 2 };
        int[] res = circularArrayRotation(arr, 2, q);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

    }

    public static int[] circularArrayRotation(int[] a, int k, int[] q) {
        int l = a.length;
        int[] res = new int[q.length];

        if (k == l) {
            for (int i = 0; i < q.length; i++) {
                res[i] = a[q[i]];
            }
            return res;
        }
        if (k > l)
            k = k % l;

        while (k > 0) {
            rotate(a);
            k--;
        }
        for (int i = 0; i < q.length; i++) {
            res[i] = a[q[i]];
        }

        return res;

    }

    public static void rotate(int[] a) {
        int n = a.length;
        int temp = a[n - 1];
        for (int i = n - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = temp;
    }
}