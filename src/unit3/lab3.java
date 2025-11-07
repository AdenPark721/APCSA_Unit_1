package unit3;

public class lab3 {
    static void main() {
        //part 1
        for (int i = 4; i < 8; i++){
            System.out.println(i);
        }
        //part 2
        for (int i = 5; i >= 1; i --){
            System.out.println(i);
        }//part 3
        String word = "go";
        for (int i = 0; i < word.length(); i++){
            int count = 0;
            String letter = word.substring(i, i + 1);
            System.out.println("letter: " + letter);
            if (letter.equals("e")){
                count++;
            }
        }
        int height = 4;
        for (int i = 1; i <= height; i++){
            String line = "";
            for (int j = 1; j <= i; j++){
                System.out.println("*");
            }
            System.out.println();
        }

        for (int i = 4; i >= 0; i--){
            for (int j = 0; j <= i; j++){
                System.out.println("*");
            }
            System.out.println();
        }
        //reflection
        //1. since by only using i < word.length() and not 1 <= word.length(), it will not do the correct amount of times we need it to do.
        //2. since it is a nested for loop, when the inside for loop ends, it goes up the first for loop, then goes inside to that for loop again since that for loop hasn't finsihed yet, and the nested for loop goes on.
        //3. for loop is better than while loops when we exactly know how many times we need t repeat the process.
    }
}
