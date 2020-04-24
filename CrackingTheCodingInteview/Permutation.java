import java.util.Arrays;

/*
Given two strings, write a method to decide if one is a permutation of the other
*/

class Permutation {

    public static void main(String[] args) {
        System.out.println(isPermutation("abcde", "dceab"));
        System.out.println();
    }

    // method one
    public static boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < s1.length(); i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;
    }

    // method two
    public static boolean isPermutation2(String s1, String s2) {
        return false;
    }
}