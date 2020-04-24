import java.util.Arrays;

class LastStoneWeight {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 4, 1, 8, 1 };
        System.out.println(weight(arr));
    }

    public static int weight(int[] arr) {
        Arrays.sort(arr);

        int len = arr.length;
        int res = 0;
        for (int i = len - 1; i > 0; i--) {

            res = arr[i] - arr[i - 1];
            arr[i - 1] = res;

            Arrays.sort(arr);
        }

        return arr[1] - arr[0];
    }
}