package exOver_loadRide;

import java.util.Scanner;

public class MathUtilEnhanced extends MathhUtil {
    @Override
    public int[] fibonacciSeries(int num) {
        int[] series = super.fibonacciSeries(num);
        int sum=0;
        for (int j : series) {
            sum += j;
        }
        int[] out = new int[num+1];
        for (int i = 0; i < series.length; i++) {
            out[i] = series[i];
        }
        out[num] = sum;
        return out;
    }

    public static void main(String[] args) {

        MathUtilEnhanced mue = new MathUtilEnhanced();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        mue.fibonacciSeries(num);

        int[] result = mue.fibonacciSeries(num);
        System.out.print("Series:");
        for (int j : result) {
            System.out.print(j + " ");

        }
    }
}
