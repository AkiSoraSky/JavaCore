package Practise;

public class Example1 {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            checkPrime(i);
        }

    }

    private static void checkPrime(int n) {
        int flag = 1;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = 0;
                break;
            }
        }
        if (flag == 1) {
            System.out.print(n + " ");
        }
    }
}
