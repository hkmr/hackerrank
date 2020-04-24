class ChocolateFeast {
    public static void main(String[] args) {
        System.out.println(totalChocolate(10, 2, 5));
    }

    // n: an integer representing Bobby's initial amount of money
    // c: an integer representing the cost of a chocolate bar
    // m: an integer representing the number of wrappers he can turn in for a free
    // bar
    public static int totalChocolate(int n, int c, int m) {
        int sum = n / c;
        if (sum < m)
            return sum;
        if (sum == m)
            return sum + 1;
        int choc = sum, wrap = choc;
        do {
            choc += wrap / m;
            wrap = (wrap / m) + (wrap % m);
        } while (wrap >= m);
        return choc;
    }
}