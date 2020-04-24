class HalloweenSale {
    public static void main(String[] args) {
        System.out.println(GamesCount(20, 0, 1, 85));
    }

    public static int GamesCount(int p, int d, int m, int s) {

        int c = 0, sum = 0;
        for (int i = p; i >= m;) {
            if ((sum + i) >= s)
                return c;
            sum += i;
            c++;
            if ((i - d) >= m)
                i -= d;
            else
                i = m;
            System.out.println(sum + " " + c + " " + i);
        }

        return c;

    }
}