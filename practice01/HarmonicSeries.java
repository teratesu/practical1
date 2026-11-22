package practice01;

public class HarmonicSeries {
    public static void main(String[] args) {
        System.out.printf("%-5s%-12s%-12s%n", "N", "1/N", "Сумма");

        double sum = 0;

        for (int i = 1; i <= 10; i++) {
            double term = 1.0 / i;
            sum += term;
            System.out.printf("%-5d%-12.4f%-12.4f%n", i, term, sum);
        }
    }
}
