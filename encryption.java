class Encryption {
    public static void main(String[] args) {
        String str = "haveaniceday";
        System.out.println("-------" + encrypt(str));
    }

    public static String encrypt(String str) {
        str = str.replaceAll("\\s", "");
        String res = "";
        int len = str.length();
        int row = (int) Math.floor(Math.sqrt(len));
        int col = (int) Math.ceil(Math.sqrt(len));

        while ((row * col) < len) {
            row++;
        }

        char[][] arr = new char[row][col];

        int c = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (c >= str.length()) {
                    arr[i][j] = ' ';
                } else {
                    arr[i][j] = str.charAt(c);
                    c++;
                }
            }
        }

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (arr[j][i] != ' ')
                    res += "" + arr[j][i];
            }
            res += " ";
        }

        return res;
    }
}