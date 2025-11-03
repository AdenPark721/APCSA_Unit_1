package unit3;

import java.util.Date;
import java.util.Scanner;

public class lesson1 {
    static void main(String[] args) {
    }

    public static boolean isValidUsername(String STU) {
        if (STU.length() != 8) {
            return false;
        } else if (STU.substring(0, 4).equals("STU_")) {
            return true;
        }
        return false;
    }

    public static boolean canDeliever(double x1, double y1, double x2, double y2) {
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        if (distance <= 100) {
            return true;
        }
        return false;
    }

    public static void randomMath() {
        Scanner sc = new Scanner(System.in);
        int ran1 = (int) (Math.random() * 10);
        int ran2 = (int) (Math.random() * 10);
        if (ran1 > ran2) {
            System.out.println("what is " + ran1 + " - " + ran2 + "?");
            if (sc.nextInt() == ran1 - ran2) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect");
            }
        } else if (ran2 > ran1) {
            System.out.println("what is " + ran2 + " - " + ran1 + "?");
            if (sc.nextInt() == ran2 - ran1) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect");
            }
        }
    }

    public static String dayOfWeek(int d, int m, int y) {
        String[] arr = new String[8];
        arr = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int y0 = y - (14 - m) / 12;
        int x0 = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int D = (d + x0 + 31 * m0 / 12) % 7;
        for (int i = 0; i < arr.length; i++) {
            if (D == i) {
                return arr[i];
            }
        }
        return "error";
    }

    public static boolean isVowel(String a) {
        if (a.equals("a") || a.equals("e") || a.equals("i") || a.equals("o") && a.equals("u")) {
            return true;
        } else {
            return false;
        }
    }
}
