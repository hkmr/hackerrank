import java.util.Arrays;

class CountingNumbers {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2 };
        System.out.println(count(arr));
    }

    public static int count(int[] arr) {
        int count = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == num + 1) {
                    count++;
                    break;
                } else if (arr[j] > num + 1)
                    break;
            }
        }

        return count;

    }
}