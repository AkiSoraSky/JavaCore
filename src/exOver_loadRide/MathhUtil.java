package exOver_loadRide;

public class MathhUtil {
    public int[] fibonacciSeries(int value) {
        int[] fib = new int[value];
        fib [0] = 0;
        fib [1] = 1;
        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib [i-2] + fib[i-1];
        }
        return fib;
    }
}
