class ModifiedKaprekarNumbers {
    public static void main(String[] args) {
        modifiedKaprekarNumbers(1, 99);
    }

    public static void modifiedKaprekarNumbers(int p, int q) {

        boolean isAvilable = false;

        for (int i = p; i <= q; i++) {

            long num = (long) Math.pow(i, 2);
            int len = ("" + i).length();
            String data = String.valueOf(num);
            int dataLen = data.length();
            StringBuilder n1 = new StringBuilder();
            StringBuilder n2 = new StringBuilder();
            for (int j = 0; j < dataLen - len; j++)
                n1.append(data.charAt(j));
            for (int k = dataLen - len; k < dataLen; k++) {
                n2.append(data.charAt(k));
            }

            int sum = Integer.parseInt(n1.toString()) + Integer.parseInt(n2.toString());
            if (sum == i) {
                isAvilable = true;
                System.out.println(i);
            }
        }

        if (!isAvilable)
            System.out.println("INVALID RANGE");

    }
}
