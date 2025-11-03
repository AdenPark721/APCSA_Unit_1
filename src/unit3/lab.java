package unit3;

public class lab {
    static void main() {
        System.out.println(triangleClassifier(3,4,5));
    }
    public static String triangleClassifier(int a, int b, int c) {
        String tri = " ";
        if ((a + b) > c) {
            if ((a + c) > b){
                if ((b + c) > a){
                    if((a == b) && (b == c)){
                        tri += "equilateral ";
                    }
                    else if ((a == b) || (b ==c) || (a == c)) {
                        tri += "isosceles ";
                    }
                    else {
                        tri += "Scalene ";
                    }
                }
                int a2 = a * a;
                int b2 = b * b;
                int c2 = c * c;
                if (((a2 + b2) == c2) || ((a2 + c2) == b2) || ((b2 + c2) == a2)){
                    tri += "Right triangle ";
                }
                else if(((a2 + b2) < c2) || ((a2 + c2) < b2) || ((b2 + c2) < a2)){
                    tri += "Acute triangle ";
                }
            }
        }
        else{
            tri += "not a valid triangle";
        }
        return tri;
    }
}
