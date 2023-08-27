import java.util.Arrays;

public class BubbleSort {
    public static void main(String args[]) {
        int[] InputArray = { 3, 5, 6, 2 }; // ascending conversion
        BubbleSortFunction(InputArray);
        System.out.println(Arrays.toString(InputArray));
    }

    public static void BubbleSortFunction(int[] array) {
        for (int j = 0; j < array.length; j++) {
            int p1 = 0;
            int p2 = 1;
            for (int i = 0; i < array.length - j - 1; i++) {
                if (array[p1] > array[p2]) {
                    swap(array, p1, p2);
                }
                p1++;
                p2++;
            }
        }
    }

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
