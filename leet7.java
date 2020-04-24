class Leet7 {
    public static int reverseNumber(long x) {

        long res = 0;
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = Math.abs(x);
        }

        while (x > 0) {

            try {
                long rem = x % 10;
                res = Math.addExact((res * 10), rem);
                x = x / 10;
            } catch (ArithmeticException e) {
                return 0;
            }

        }

        if (res >= Integer.MAX_VALUE)
            return 0;

        if (isNegative)
            return (int) (res * -1);

        return (int) res;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(reverseNumber(1534236469));
    }
}