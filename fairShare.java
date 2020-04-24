import java.text.DecimalFormat;
import java.util.*;

class FairShare {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String cmd = sc.nextLine();
        String[] command1 = cmd.split("\\s+");
        String[] users = null;

        if ("register".equalsIgnoreCase(command1[0])) {
            users = registerUsers(cmd);
        } else if (command1[0].equalsIgnoreCase("end")) {
            System.exit(0);
        } else {
            System.out.println("Error");
            System.exit(0);
        }

        // provide 0 balance for all users
        double[] amounts = new double[users.length];

        while (!cmd.equalsIgnoreCase("end")) {
            cmd = sc.nextLine();
            String[] command2 = cmd.split("\\s+");

            // for expense
            if (command2[0].equalsIgnoreCase("expense")) {
                // updating users amount;
                amounts = usersAmount(command2, users, amounts);
            } else if (command2[0].equalsIgnoreCase("report")) {

                userReport(command2, users, amounts);

            }
        } // end while
        sc.close();
    }

    // register users
    public static String[] registerUsers(String str) {

        String[] command = str.split("\\s+");
        int len = command.length;
        String[] users = new String[len - 1];

        for (int i = 1; i < command.length; i++)
            users[i - 1] = command[i];

        return users;
    }

    public static double[] usersAmount(String str[], String users[], double amounts[]) {
        if (str.length == 3) {
            String user = str[1];
            long userAmount = Long.parseLong(str[2]);
            boolean isUserAvailable = false;
            // checking for registered users
            int i = 0; // user index
            for (; i < users.length; i++) {
                if (users[i].equalsIgnoreCase(user)) {
                    isUserAvailable = true;
                    break;
                }
            }

            if (isUserAvailable) {
                amounts[i] += userAmount;
            } else {
                // if user is not registered
                System.out.println("Error");
            }
        } else {
            System.out.println("Error");
        }
        return amounts;
    }

    public static void userReport(String str[], String users[], double amounts[]) {

        double userAmount = 0.0f;
        double total = 0.0f;
        double report = 0.00f;

        DecimalFormat df = new DecimalFormat("#.00");

        for (int i = 0; i < amounts.length; i++) {
            total += amounts[i];
        }

        double totalAverage = total / (amounts.length);

        if (str.length == 2) {
            String user = str[1];

            boolean isUserAvailable = false;
            // checking for registered users
            int i = 0; // user index
            for (; i < users.length; i++) {
                if (users[i].equalsIgnoreCase(user)) {
                    isUserAvailable = true;
                    break;
                }
            }

            if (isUserAvailable) {
                userAmount = amounts[i];
                report = userAmount - totalAverage;
                String format = df.format(report);
                System.out.println(format);
            } else {
                System.out.println("Error");
            }

        } else {
            System.out.println("Error");
        }
    }
}