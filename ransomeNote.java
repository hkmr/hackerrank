import java.util.Hashtable;

class RansomeNote {
    public static void main(String[] args) {
        String[] mg = { "two", "times", "three", "is", "not", "four" };
        String[] nt = { "two", "times", "two", "is", "four" };
        checkMagazine(mg, nt);
    }

    public static void checkMagazine(String[] magazine, String[] note) {

        Hashtable<Integer, String> mg = new Hashtable<Integer, String>();
        for (int i = 0; i < magazine.length; i++) {
            mg.put(i, magazine[i]);
        }

        for (int i = 0; i < note.length; i++) {
            if (mg.containsValue(note[i])) {
                mg.values().remove(note[i]);
            } else {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}