class HourGlass {
    public static void main(String[] args) {
        int[][] arr = { { -9, -9, -9, 1, 1, 1 }, { 0, -9, 0, 4, 3, 2 }, { -9, -9, -9, 1, 2, 3 }, { 0, 0, 8, 6, 6, 0 },
                { 0, 0, 0, -2, 0, 0 }, { 0, 0, 1, 2, 4, 0 } };
        System.out.println(maxSum(arr));
    }

    public static int maxSum(int[][] arr) {

        int sum = Integer.MIN_VALUE;

        for (int i = 0; i <= arr.length - 3; i++) {
            for (int j = 0; j <= arr.length - 3; j++) {
                int tmp = 0;
                for (int x = i; x < i + 3; x++) {
                    for (int y = j; y < j + 3; y++) {
                        if (x == i + 1 && y == j) {
                        } else if (x == i + 1 && y == j + 2) {
                        } else {
                            tmp += arr[x][y];
                        }
                    }
                }
                if (tmp > sum)
                    sum = tmp;
            }
        }

        return sum;

    }
}