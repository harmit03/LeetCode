import java.util.Arrays;

class SpiralMatrix {
    public static void main(String[] args) {

        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(matrix.length);
        int[] spiraled = spiralOrder(matrix);
        System.out.println(Arrays.toString(spiraled));

    }

    public static int[] spiralOrder(int[][] matrix) {
        int length = ((matrix[1].length) * (matrix.length));
        int[] arr = new int[length];
        int index = 0;

        while (true) {
            for (int j = 0; j < matrix[0].length; j++) {
                arr[index] = matrix[0][j];
                index++;
            }
            for (int j = 1; j < matrix.length; j++) {
                arr[index] = matrix[j][matrix[j].length - 1];
                index++;
            }
            for (int j = matrix[1].length - 2; j >= 0; j--) {
                arr[index] = matrix[matrix.length - 1][j];
                index++;
            }
            for (int j2 = matrix.length - 2; j2 > 0; j2--) {
                arr[index] = matrix[j2][0];
                index++;
            }
        }

        return arr;
    }

}