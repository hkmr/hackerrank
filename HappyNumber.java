/*
A happy number is a number defined by the following process: 
Starting with any positive integer, replace the number by the sum of the squares of its digits,
and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle 
which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

*/

class HappyNumber {
    public static void main(String[] args) {
        System.out.println(IsHappyNumber(191));
    }

    public static boolean IsHappyNumber(int num) {

        int sum = sumOfSquare(num);
        System.out.println(sum);
        for (int i = 0; i < 50; i++) {
            if (sum == 1)
                return true;
            else
                sum = sumOfSquare(sum);
        }

        return false;
    }

    public static int sumOfSquare(int num) {
        int sum = 0;
        while (num >= 1) {
            int dig = num % 10;
            num = num / 10;
            sum += dig * dig;
        }
        return sum;
    }
}