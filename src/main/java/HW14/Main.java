package HW14;

import static HW14.SlidingWindow.minSum;

public class Main {

        public static void main(String[] args) {
            int[] arr1 = {10, 20, 30, 40};
            int k1 = 2;
            System.out.println("Минимальная сумма: " + minSum(arr1, k1)); // Вывод: 30

            int[] arr2 = {1, 45, 2, 10, 23, 3, 1, 0, 20};
            int k2 = 4;
            System.out.println("Минимальная сумма: " + minSum(arr2, k2)); // Вывод: 24
        }
    }


