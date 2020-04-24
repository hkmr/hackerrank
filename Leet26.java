class Leet26 {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2 };
        int l = removeDuplicates(arr);
        // System.out.println(count(arr));
        // delete(arr, 0);
        // delete(arr, 2);
        // delete(arr, 2);
        for (int i = 0; i < l; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static int removeDuplicates(int[] A) {

        // if (res.length == 0)
        // return 0;
        // int c = count(res);
        // int i = 0;
        // for (; i < c - 1; i++) {
        // if (res[i] == res[i + 1]) {
        // res = delete(res, i);
        // i = 0;
        // }
        // }
        // return c;

        if (A.length == 0)
            return 0;
        int j = 0;
        for (int i = 0; i < A.length; i++)
            if (A[i] != A[j])
                A[++j] = A[i];
        return ++j;
    }

    public static int[] delete(int[] a, int c) {
        for (int i = c; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }
        return a;
    }

    public static int count(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1])
                count++;
        }
        return count + 1;
    }
}