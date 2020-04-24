class NewYearChaos {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 3, 7, 8, 6, 4 };
        minimumBribes(arr);
    }

    public static void minimumBribes(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > i + 1) {
                int diff = arr[i] - (i + 1);
                System.out.println(diff);
                if (diff >= 3) {
                    System.out.println("Too chaotic");
                    return;
                } else {
                    count += arr[i] - (i + 1);
                }
            }
        }
        System.out.println(count);

    }
}