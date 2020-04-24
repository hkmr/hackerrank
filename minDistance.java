class MinDistance {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 10 };
        System.out.println(minDis(arr));
    }

    public static int minDis(int[] arr) {
        int min = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    if ((j - i) < min) {
                        min = j - i;
                    }
                }
            }
        }

        return min == arr.length ? -1 : min;
    }
}