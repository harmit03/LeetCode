import java.util.Arrays;

class SpiralMatrix {
    public static void main(String[] args) {

        int[][] matrix = { { 1, 2, 3, 5 },
                { 4, 5, 6, 5 },
                { 7, 8, 9, 5 },
                { 6, 6, 6, 6 } };
        System.out.println(matrix.length);
        int[] spiraled = spiralOrder(matrix);
        System.out.println(Arrays.toString(spiraled));

    }

    public static boolean IsEmpty(int[] arr) {
        if (arr[arr.length - 1] == 0) {
            return true;
        }
        return false;
    }

    public static int[] spiralOrder(int[][] matrix) {
        int length = ((matrix[1].length) * (matrix.length));
        int[] arr = new int[length];
        int index = 0;

        int breadth = matrix[0].length;
        int height = matrix.length;
        int start = 0;
        while (index < arr.length) {

            if (IsEmpty(arr)) {
                for (int j = start; j < breadth; j++) {
                    arr[index] = matrix[start][j];
                    if (index < arr.length - 1) {
                        index++;
                    } else {
                        return arr;
                    }
                }
            }

            if (IsEmpty(arr)) {
                for (int j = start + 1; j < height; j++) {
                    arr[index] = matrix[j][breadth - 1];
                    if (index < arr.length - 1) {
                        index++;
                    } else {
                        return arr;
                    }
                }
            }

            if (IsEmpty(arr)) {
                for (int j = breadth - 2; j >= 0; j--) {
                    arr[index] = matrix[height - 1][j];
                    if (index < arr.length - 1) {
                        index++;
                    } else {
                        return arr;
                    }
                }
            }

            if (IsEmpty(arr)) {
                for (int j2 = height - 2; j2 > 0; j2--) {
                    arr[index] = matrix[j2][start];
                    if (index < arr.length - 1) {
                        index++;
                    } else {
                        return arr;
                    }
                }
            }

            breadth--;
            height--;
            start++;

        }

        return arr;
    }

}