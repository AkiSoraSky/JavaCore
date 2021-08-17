package Practise;

public class ArmstrongNum {
    private int checkArmstrong(int number) {
        int temp, rem;
        int sum =0;
        temp = number;
        while (number > 0) {
            rem = number % 10;
            sum += rem * rem * rem;
            number/=10;
        }
        if (temp==sum)
            return 0;
        else
            return 1;
    }
    private void show(int arm) {
        if (arm == 0) {
            System.out.println("Its a Armstrong number");
        } else {
            System.out.println("Its is not a Armstrong Number");
        }
    }
    public static void main(String[] args) {
        ArmstrongNum cc = new ArmstrongNum();
        int givenNUm= cc.checkArmstrong(153);
        cc.show(givenNUm);
    }
}
