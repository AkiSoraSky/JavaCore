package Practise;

public class EvenSum {
    int total=0;
    public void collectEven() {
        for (int i = 2; i <= 100; i++) {
            if ((i % 2) == 0) {
                total += i;
            }
        }
    }
    public void show() {
        System.out.println(" "+total+" ");
        }

    public static void main(String[] args) {
        EvenSum ee = new EvenSum();
        ee.collectEven();
        ee.show();
    }
}
