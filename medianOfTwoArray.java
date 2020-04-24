class Median {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };
        int[] b = { 2, 4, 5, 6 };
        int[] res = merge(a, b);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }

    }

    public static int[] merge(int[] a, int[] b) {
        int l1 = a.length, l2 = b.length, l = 0;
        int[] arr = new int[l1 + l2];
        for (int i = 0; i < l1;) {
            for (int j = 0; j < l2;) {
                if (a[i] <= b[j]) {
                    arr[l] = a[i];
                    if (i < l1 - 1)
                        i++;
                } else {
                    arr[l] = b[j];
                    if (j < l2 - 1)
                        j++;
                }
                l++;
            }
        }
        return arr;
    }

}