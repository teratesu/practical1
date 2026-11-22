package practice03;

import java.util.Random;

public class RandomArraySort {
    public static void main(String[] args) {
        double[] mathArray = new double[10];

        for (int i = 0; i < mathArray.length; i++) {
            mathArray[i] = Math.random() * 100;
        }

        System.out.println("Массив, созданный методом Math.random():");
        printArray(mathArray);

        sortArray(mathArray);

        System.out.println("После сортировки:");
        printArray(mathArray);

        Random random = new Random();
        double[] randomArray = new double[10];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextDouble() * 100;
        }

        System.out.println();
        System.out.println("Массив, созданный классом Random:");
        printArray(randomArray);

        sortArray(randomArray);

        System.out.println("После сортировки:");
        printArray(randomArray);
    }

    private static void sortArray(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%.2f ", array[i]);
        }
        System.out.println();
    }
}
