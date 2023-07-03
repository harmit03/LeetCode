public class HouseRobber {

    public static void main(String[] args) {
        int[] arr = {9,5,3,4,5,3,2,3,4,5,7,8,9};
        // System.out.println(ob(arr));
    }
    
    // Input: nums = [2,7,9,3,1]
    // Output: 12
    // Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
    // Total amount you can rob = 2 + 9 + 1 = 12.



    public static int RichestHouse(int[] array){
        int largestmem = 0;
        for (int i = 1; i < array.length; i++) {
            if(array[i] > array[i-1]){
                largestmem=array[i];
            }
        }

        return largestmem;
    }


    public static int Rob(int[] array){
        int richest = RichestHouse(array);
        return 0;

    }

}
