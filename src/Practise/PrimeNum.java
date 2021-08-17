package Practise;

public class PrimeNum {
    private int primeAdd() {
        int sum = 0, count;
        for (int i = 2; i <= 2000; i++) {
            count = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                sum += i;
            }
        }
        return sum;
    }

    private void show(int num) {
        System.out.println("Sum of Prime number till 2000: " + num);
    }

    public static void main(String[] args) {
        PrimeNum cc = new PrimeNum();
        int primeSum = cc.primeAdd();
        cc.show(primeSum);
    }
}
