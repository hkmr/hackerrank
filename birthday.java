class Birthday {
    public static void main(String[] args) {
        System.out.println(cost(3, 3, 1, 9, 2));
    }

    public static int cost(int b, int w, int bc, int wc, int z) {

        int total = 0;

        // converting
        int wcb = bc + z, bcw = wc + z;
        if (wcb < wc) {
            if (bcw < bc) {
                total = (b * bcw) + (w * wc);
            } else {
                total = (b * wc) + (w * wcb);
            }
        } else if (bcw < bc) {
            total = (b * bcw) + (w * wc);
        } else {
            total = (b * bc) + (w * wc);
        }

        return total;

    }
}