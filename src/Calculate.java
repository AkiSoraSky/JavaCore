import java.util.Arrays;

public class Calculate {
    // Function for calculating mean
    public static double findMean(int a[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += a[i];

        return (double) sum / (double) n;
    }

    // Function for calculating median
    public static double findMedian(int a[], int n) {
        Arrays.sort(a);

        // check for even case
        if (n % 2 != 0) {
            return (double) a[n / 2];
        } else {
            return (double) (a[(n - 1) / 2] + a[n / 2]) / 2.0;
        }
    }

    private static int findMin(int a[]) {
        Arrays.sort(a);
        int min = a[0];
        return min;
    }

    private static int findMax(int a[]) {
        Arrays.sort(a);
        int num = a.length - 1;
        int max = a[num];
        return max;
    }

    public static void main(String[] args) {
        int a[] = {1, 3, 4, 2, 7, 5, 2, 6};
        int n = a.length;

        // Function call
        System.out.println("Mean = " + findMean(a, n));
        System.out.println("Median = " + findMedian(a, n));
        System.out.println("Minimum = " + findMin(a));
        System.out.println("Maximum = " + findMax(a));
    }
}
