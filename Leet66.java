class Leet66 {
    public static void main(String[] args) {
        int[] arr = { 5, 9, 9, 9, 9 };
        int[] res = plusOne(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }
    }

    public static int[] plusOne(int[] d) {
        int len = d.length;
        int i = len - 1;

        if (d[len - 1] == 9) {
            while (i >= 0) {
                d[i--] = 0;
                if (d[i] == 9)
                    continue;
                else {

                    d[i] = d[i] + 1;
                    break;
                }
            }
        } else {
            d[len - 1] += 1;
        }

        return d;

    }
}