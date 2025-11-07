package unit3;

import java.util.Scanner;

public class lab2 {
    static void main(String[] args) {
        System.out.println("Enter a word (a-c)");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        while (a.equals("b")){
        System.out.println("Invalid word! Enter a word between 'a' and 'c'");
            a = sc.next();
        }
        System.out.println("Valid word: " + a);
    }
    public static int divisible(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0 && arr[i] % 5 != 0) {
                count++;
            }
        }
        return count;
    }
}