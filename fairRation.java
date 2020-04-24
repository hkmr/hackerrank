class FairRation {
    public static void main(String[] args) {
        int[] B = { 1, 2 };
        System.out.println(fair(B));
    }

    public static int fair(int[] B) {
        int c = 0;

        for (int i = 1; i < B.length; i++) {
            if (B[i - 1] % 2 != 0) {
                B[i - 1]++;
                B[i]++;
                c += 2;
            }

            if (B[i - 1] % 2 != 0)
                return -1;
        }

        if (B[B.length - 1] % 2 != 0)
            return -1;

        return c;
    }
}