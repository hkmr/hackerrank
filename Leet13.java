class Leet13 {
    public static void main(String[] args) {
        System.out.println(romanToInt("LIXIV"));
    }

    public static int romanToInt(String s) {
        char[] arr = s.toCharArray();
        int len = arr.length, sum = 0;

        for (int i = 0; i < len; i++) {
            if (i == len - 1) {
                sum += getNum(arr[i]);
            } else if (getNum(arr[i]) < getNum(arr[i + 1])) {
                sum -= getNum(arr[i]);
            } else
                sum += getNum(arr[i]);
        }

        return sum;

    }

    public static int getNum(char c) {
        if (c == 'I')
            return 1;
        else if (c == 'V')
            return 5;
        else if (c == 'X')
            return 10;
        else if (c == 'L')
            return 50;
        else if (c == 'C')
            return 100;
        else if (c == 'D')
            return 500;
        else
            return 1000;
    }
}