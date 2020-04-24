class Hamming {
    public static void main(String[] args) {
        String b1 = convertToBinary(10);
        String b2 = convertToBinary(24);

        int len = b1.length() < b2.length() ? b1.length() : b2.length();
        String grt = b1.length() > b2.length() ? b1 : b2;
        int c = 0;
        for (int i = 0; i < len; i++) {
            if (b1.charAt(i) != b2.charAt(i))
                c++;
        }

        for (int i = len; i < grt.length(); i++) {
            if (grt.charAt(i) == '1')
                c++;
        }

        System.out.println(c);

    }

    public static String convertToBinary(int x) {
        String res = "";

        while (x > 0) {
            res += x % 2;
            x = x / 2;
        }

        return res;
    }
}