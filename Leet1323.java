class Leet1323 {
    public static void main(String[] args) {
        System.out.println(max(6669));
    }

    public static int max(int num) {

        int tmp = num;
        int t = (int) Math.pow(10, len(num) - 1);
        while (t > 0) {
            int n = tmp / t;
            if (n == 6) {
                num += t * 3;
                break;
            }
            tmp = tmp % t;
            t = t / 10;
        }
        return num;
    }

    public static int len(int n) {
        int c = 0;
        while (n > 1) {
            n = n / 10;
            c++;
        }

        return c + 1;
    }
}