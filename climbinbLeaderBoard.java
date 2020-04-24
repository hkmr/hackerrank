class ClimbingLeaderBoard {

    public static void main(String[] args) {
        int scores[] = { 100, 90, 90, 80 };
        int alice[] = { 85, 80, 105 };
        int arr[] = climbingLeaderboard(scores, alice);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] res = new int[alice.length];

        for (int i = 0; i < alice.length; i++) {
            int rank = 1;
            for (int j = 0; j < scores.length - 1; j++) {
                if (alice[i] >= scores[j]) {
                    res[i] = rank;
                    break;
                } else {
                    rank++;
                }
            }
        }
        return res;
    }
}