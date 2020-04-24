class Leet258 {
    public static void main(String[] args) {
        System.out.println(add(129));
    }

    public static int add(int num) {
        if (num < 10) {
            return num;
        } else {
            return (num - 1) % 9 + 1;
        }
    }
}