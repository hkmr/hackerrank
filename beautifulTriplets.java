class BeautyfulTriplets {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 3, 4, 5 };
        System.out.println(triplets(1, arr));
    }

    public static int triplets(int d, int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[j] - arr[i] == d) {
                    for (int k = j + 1; k < arr.length; k++) {
                        if (arr[k] - arr[j] == d)
                            count++;
                    }
                }
            }
        }

        return count;
    }
}