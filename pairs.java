import java.util.Arrays;

class Pairs {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 4, 2 };
        System.out.println(countPairs(2, arr));
    }

    public static int countPairs(int k, int[] arr) {

        int count = 0;

        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--) {
            int diff = Math.abs(arr[i] - k);
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] == diff) {
                    count++;
                    break;
                }
            }

        }

        return count;

    }
}