package Lab2;
import java.util.Scanner;

public class SecretDecoder {
    public static void main(String[] args) {
        //part 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 7-digit agent ID: ");
        int phoneNumber = sc.nextInt();
        //part 3
        int last4 = phoneNumber % 10000;
        System.out.println("Last 4 digits: " + last4);
        int d1 = last4 % 10;
        int d2 = (last4 % 100) / 10;
        int d3 = (last4 % 1000) / 100;
        int d4 = (last4 % 10000) / 1000;
        System.out.println("Digits " + d4 + ", " + d3 + ", " + d2 + ", " + d1);
        //Discuss : Why does %10 give the last digit? why does / 10 remove it?
        // by doing % 10, you can get the last digit since % 10 means to return the left over and / 10 is basically
        // division.
        //part 4
        System.out.println("Enter temperature in Celsius");
        double celsius = sc.nextDouble();
        double fahrenheit = celsius * 9 / 5 + 32;
        System.out.println(celsius + "C = " + fahrenheit + "F");
        //Common Mistake
        // If we used int arithmetic, the result will change. instead of 25.0 it will be 25. If the result was 71.6 F,
        // then it will be returned as 71.
        int c = 22;
        int f = c * 9 / 5 + 32;
        System.out.println("Int version " + f); //yep
        //part 5
        int code = 1 + 2 * 5 + (3 + 7);
        System.out.println("Vault Code: " + code);
        //prediction = will be 3 + 7 first, which is 10, then 2 * 5 with is also 10, and  + 1, so it will be 21.
        // i was right
        System.out.println(5 + 3 * 2); // 11
        System.out.println((5 + 3) * 2); //16
        System.out.println(10 / 3 * 2); // 6
        System.out.println(5 / 2 + 1.5); // 3.5
        System.out.println(5.0 / 2 + 1.5); // 4.0
        //reflection : I was all right.

        //part 6
        System.out.println( 1+ 2 * 3); // 7
        System.out.println("Score" + 1 + 2 * 3); // Score16
        System.out.println("Score" + (1 + 2 * 3)); // Score7
        System.out.println( 5 / 2 + 1.5); //3.5
        System.out.println(5.0 / 2 + 1.5); // 4.0;


        //reflection
        // 1. why does 7 /3 give 2, now 2.33? How can you get decimal answer?
        // If you wanted a decimal answer, you should have written as 7.0 / 3.0 or 7 / 3.0 or 7.0 / 3; Or else it will be
        // just Int values.
        // 2. How can you extract the middle digit of a 3 - digit number (like 583) -> 8?
        // just like we did above, use % and divisions.
        // 3. Why does "Answer : " + 5 + 3 give "Answer 53, but "Answer: " + (5+3) give Answer : 8 ?
        // since the first one, it is not in math value (int / double) it is in String. However the second one is in int,
        // therefore it was able to do math.
        // 4. When converting Celsius to Fahrenheit, why is it dangerous to use all integers?
        // you might want the decimal points too. Might miss some close temperatures ( ex : 79.8)
        // 5. Research: what is "operator precedence
        // just like math, you do () these first, then * or /  or % then + or - .
    }
}
