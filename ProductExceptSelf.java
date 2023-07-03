import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {

        // Input: nums = [-1,1,0,-3,3]
        // Output: [0,0,9,0,0]

        int[] array = {-1,1,0,-3,3};
        int[] ans = productExceptSelf(array);
        System.out.println(Arrays.toString(ans));


        
    }


    public static int[] productExceptSelf(int[] nums) {
        int[] TempArray = new int[nums.length];

        for (int i = 0; i < TempArray.length; i++) {
            TempArray[i]=1;
            for (int j = 0; j < TempArray.length; j++) {
                if(i==j){
                    continue;
                }
                else{
                    TempArray[i] = TempArray[i] * nums[j];
                }
            }

            // if(nums[i]!=0){
            //     TempArray[i] /= nums[i];
            // }
            
        }

        return TempArray;

    }
}
