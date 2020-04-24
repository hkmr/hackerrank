class Bet {
    public static void main(String[] args) {
        System.out.println(winner("afsdkf"));
    }

    public static String winner(String str) {
        String r = "", b = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                b += str.charAt(i);
            } else {
                r += str.charAt(i);
            }
        }

        if (r.compareTo(b) > 0) {
            return "Bablu";
        } else if (r.compareTo(b) < 0) {

            return "Ravi";
        } else {
            return "Draw";
        }
    }
}