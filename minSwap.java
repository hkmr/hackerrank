class MinSwap {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 2, 4, 6, 7 };
        System.out.println(minSwap(arr));
    }

    public static int minSwap(int[] arr) {
        int cost = 0;
        for (int i = 1; i <= arr.length; i++) {
            if (arr[i - 1] != i) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == i) {
                        swap(arr, i - 1, j);
                        cost++;
                        break;
                    }
                }
            }

        }
        return cost;
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}