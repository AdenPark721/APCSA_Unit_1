package Lab1;

import java.util.Scanner;

//part 2
public class CoffeeRegister {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numLat = sc.nextInt();
        double latPrice = sc.nextDouble();
        double tip = sc.nextDouble();
        double total = numLat * latPrice + tip;
        System.out.println("total: $" + total);
        int A = 5;
    }
    // Part 3
    // double x = 5 is valid since it will count as 5.0 in code.
    // int y = 5.5 will cause error.
    // Implicit casting is automatic one I remember as and explicit is not automatic.
    // User has to write the code to change the type.

    //part 4
    public static void typeBehaviorExperiments(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- Experiment 1: Intiger Division ---");
        System.out.println("How many cookies?");
        int cookies = sc.nextInt();
        System.out.println("How many kids? ");
        int kids = sc.nextInt();
        int cookiesPerKid = cookies / kids;
        System.out.println("Each kid gets: " + cookiesPerKid + "cookies");
    }
    // since the types are int, the answer will be 2 when the inputs are 7 cookies and 3 kids. If they were double,
    // you will get 2.333333333

    public static void Experiment2(String[] args){
        System.out.println("\n--- Experiment 2: Bonus Points ---");
        int loyaltyPoints = 10;
        System.out.println("points" + loyaltyPoints);
        loyaltyPoints += 5;
        System.out.println("After bonus; " + loyaltyPoints);
        loyaltyPoints *= 2;
        System.out.println("After promo" + loyaltyPoints);

        // prefix vs. postfix
        //They do the same thing. a++ will add one to the value of a, same as ++a. However the differences is that
        // if you do
        // int y = 0;
        // System.out.print(++y);, 1 will be returned.
        //System.out.print(y++); 0 will be returned.
    }
    public static void DebugTheBug(String[] args){
        double itemPrice =3.99;
        int quantity = 2;
        double subtotal = itemPrice * quantity;
        int roundedPrice = subtotal;
        //error happens because we are trying to save double (itemPrice) into int (roundedPrice).
        // to fix this error, we can to casting or simply change the type of roundedPrice to double.
        double roundedPrice2 = subtotal;
        int roundedPrice3 = (int)subtotal;
        System.out.println("Rounded total: " + roundedPrice3);
    }
    public void Reflect(String[] args){
        // 1. What happens when you store a double in an int? What is lost?
        // If you store double into int, the decimals will just get deleted. Also there will be an error.
        // For example, if you store 1.3, it will be saved as 1.
        // 2. Why does 5 / 2 gives 2 not 2.5?
        // maybe because they are in int (numerator)? We have to cast them like double a = (double) 5/ 2;
        // 3. When would you use explicit casting? When is it automatic?
        // it is automatic when you save double into int (just an example). We use explicit when you have to change the
        //type like for question 2.
        // 4. what's one real-world situation where ++x vs x++ could cause a bug?
        // I need to think more than 8 minutes for this question. Maybe checklists or attendance stuffs?
        // 5. what suprised you most about how Java handles numbers?
        // not really. Maybe because I learned this already before.

    }
}
