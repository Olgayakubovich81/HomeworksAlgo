package HW13;


import java.util.Arrays;

public class Main {
        public static boolean arraysAreEqual(int[] arr1, int[] arr2) {
            // Сначала проверяем, имеют ли массивы одинаковую длину
            if (arr1.length != arr2.length) {
                return false;
            }

            // Сортируем оба массива
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            // Сравниваем отсортированные массивы
            return Arrays.equals(arr1, arr2);
        }

        public static void main(String[] args) {
            int[] arr1 = {1, 2, 5, 4, 0};
            int[] arr2 = {2, 4, 5, 0, 1};

            if (arraysAreEqual(arr1, arr2)) {
                System.out.println("Да");
            } else {
                System.out.println("Нет");
            }
        }
    }


