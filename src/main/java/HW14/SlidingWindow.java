package HW14;

public class SlidingWindow {
           public static int minSum(int[] arr, int k) {
            if (arr.length < k) {
                throw new IllegalArgumentException("Размер окна k не может быть больше длины массива.");
            }

            // Вычисляем сумму первых k элементов
            int currentSum = 0;
            for (int i = 0; i < k; i++) {
                currentSum += arr[i];
            }

            int minSum = currentSum;

            // Сдвигаем окно по массиву, обновляя суммы
            for (int i = k; i < arr.length; i++) {
                currentSum += arr[i] - arr[i - k];
                if (currentSum < minSum) {
                    minSum = currentSum;
                }
            }

            return minSum;
        }

    }
