
class BetweenTwoSets {
    public static void main(String[] args) {
        int[] a = { 2, 4 };
        int[] b = { 16, 32, 96 };
        System.out.println(getTotalX(a, b));
    }

    public static int getTotalX(int[] a, int[] b) {

        int count = 0, l = 0, s = 0;

        for (int i : a) {
            if (l < i)
                l = i;
        }
        s = b[0];
        for (int i : b) {
            if (i < s)
                s = i;
        }

        for (int i = 1; i <= s; i++) {
            boolean isDiv = true;
            boolean isDiv2 = true;
            for (int j = 0; j < a.length; j++) {
                if (i % a[j] != 0) {
                    isDiv = false;
                }
            }

            if (isDiv) {
                for (int j = 0; j < b.length; j++) {
                    if (b[j] % i != 0) {
                        isDiv2 = false;
                    }
                }
            }

            if (isDiv && isDiv2) {
                System.out.println(i);
                count++;
            }
        }

        return count;
    }
}