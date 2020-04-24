class Design {
    public static void main(String[] args) {

        int n = 4;
        int k = n, c = 1;

        for (int i = 0; i <= n; i++) {
            if (i == n) {
                i = 0;
                k--;
                System.out.println();
            }
            if (i < k - 1)
                System.out.print("-");
            else
                System.out.print("*");

            if (c == n * n)
                break;
            c++;
        }
    }
}