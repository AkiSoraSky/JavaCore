package exOver_loadRide;

public class MathUtilEnhanced extends MathhUtil {
    @Override
    public int[] fibonacciSeries() {
        int[] series = super.fibonacciSeries();
        int sum=0;
        for (int j : series) {
            sum += j;
        }
        int[] out = new int[11];
        for (int i = 0; i < series.length; i++) {
            out[i] = series[i];
        }
        out[10] = sum;
        return out;
    }

    public static void main(String[] args) {
        MathUtilEnhanced mue = new MathUtilEnhanced();
        int[] result = mue.fibonacciSeries();
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+ " ");

        }
    }
}
