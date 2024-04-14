package HW04;

public class FindKthElement {
    public static void main(String[] args) {
        int[] arr1 = {100, 112, 256, 349, 770};
        int[] arr2 = {72, 86, 113, 119, 265, 445, 892};
        int k = 7;

        int result = findKthElement(arr1, arr2, k);
        System.out.println("Output: " + result);
    }

    public static int findKthElement(int[] arr1, int[] arr2, int k) {
        int m = arr1.length;
        int n = arr2.length;

        int[] mergedArray = new int[m + n];
        int i = 0, j = 0, index = 0;

        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                mergedArray[index++] = arr1[i++];
            } else {
                mergedArray[index++] = arr2[j++];
            }
        }

        while (i < m) {
            mergedArray[index++] = arr1[i++];
        }

        while (j < n) {
            mergedArray[index++] = arr2[j++];
        }

        return mergedArray[k - 1];
    }
}
