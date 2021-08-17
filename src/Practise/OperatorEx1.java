package Practise;

public class OperatorEx1 {
    public static void main(String[] args) {
        int a = 20;
        int b = 3;
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);

        if (a > b) {
            System.out.println("a is Greater");
        } else {
            System.out.println("b is Greater");
        }
        float c = (float) a / b;
        System.out.println("The c is: " +c);
    }
}
