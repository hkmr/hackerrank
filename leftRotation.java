class LeftRotation {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        leftRotate(arr, 3);
        for (int x : arr)
            System.out.print(x + " ");
    }

    public static void leftRotate(int[] arr, int d) {

        while (d > 0) {
            int tmp = arr[0];

            for (int i = 1; i < arr.length; i++) {
                arr[i - 1] = arr[i];
            }

            arr[arr.length - 1] = tmp;

            d--;
        }

    }
}