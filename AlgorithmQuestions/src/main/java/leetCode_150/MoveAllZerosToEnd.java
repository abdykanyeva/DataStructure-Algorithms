package leetCode_150;

import java.util.Arrays;

public class MoveAllZerosToEnd {

    public static void main(String[] args) {
        int[] nums={0,1,0,2,3,4, 0};
        System.out.println(Arrays.toString(moveAllZeros(nums)));
        System.out.println(Arrays.toString(moveAllZero(nums)));


    }


    public static int[]moveAllZeros(int[]array){
        // 1,0,0,4,5,6,0-> 1,4,5,6,0,0,0

        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]!=0){
                array[index]=array[i];
                index++;
            }
        }
        for (int i = index; i < array.length; i++) {
            array[i]=0;
        }
return array;


    }





    public static int[] moveAllZero(int []nums){
       // nums = [0,1,0,3,12]
       // Output: [1,3,12,0,0]

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                nums[j] = nums[i];
                j++;
            }
        }
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
        return nums;
    }
}
