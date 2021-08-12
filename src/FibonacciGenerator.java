public class FibonacciGenerator {
    private int[] generator() {
        int[] fib = new int[10];
        fib [0] = 0;
        fib [1] = 1;
        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib [i-2] + fib[i-1];
        }
        return fib;
    }

    private void show(int[] fib) {
        System.out.println("Done");
        for (int i = 0; i < fib.length; i++) {
            System.out.print(fib[i]+ " ");
        }
    }

    public static void main(String[] args) {
        FibonacciGenerator gg  = new FibonacciGenerator();
        int[] series = gg.generator();
        gg.show(series);
    }
}
