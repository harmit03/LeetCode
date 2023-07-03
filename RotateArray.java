import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7 };
        int[] resit = RotateArrayMethod(array, 3);
        System.out.println(Arrays.toString(resit));
    }


    //THE FOLLOWING METHOD FOR ROTATING ARRAY IS CREATING ANOTHER OBJECT

    public static int[] RotateArrayMethod(int[] array, int turn) {
        int[] TempArray = new int[array.length];
        if (turn > array.length) {
            turn = turn % array.length;
        }

        for (int i = turn; i < TempArray.length; i++) {
            TempArray[i - turn] = array[i];
        }

        for (int i = array.length-turn; i < TempArray.length; i++) {
            TempArray[i] = array[i-array.length+turn];
        }
        return TempArray;

    }


    
}