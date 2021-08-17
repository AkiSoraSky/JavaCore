package Practise;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value for multiplication: ");
        int num = sc.nextInt();
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        for (int i = 1; i <= size; i++) {
            System.out.println(num+ " x " +i+ " = " + num*i);
        }
    }
}
