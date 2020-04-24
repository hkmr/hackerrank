class ArrayManipulation {

    public static void main(String[] args) {
        int n = 10;
        int[][] queries = { { 2, 6, 8 }, { 3, 5, 7 }, { 1, 8, 1 }, { 5, 9, 15 } };
        System.out.println(manipulate(n, queries));
    }

    public static int manipulate(int n, int[][] queries) {

        int max = 0;
        int[] arr = new int[n];

        for (int x = 0; x < queries.length; x++) {

            int start = queries[x][0];
            int end = queries[x][1];
            int val = queries[x][2];

            for (int i = start - 1; i < end; i++) {
                arr[i] += val;
                if (arr[i] > max)
                    max = arr[i];
            }
        }
        return max;
    }

}