package leetCode_150;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum_1 {
    public static void main(String[] args) {

        int[] array = {2,7,11,15}; // [0,1]
        System.out.println(Arrays.toString(twoSum(array,9)));
        System.out.println(Arrays.toString(twoSumReal(array,9)));
    }

    public static int[]twoSum(int[]nums, int target){

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("Nu such element");

    }

    public static int[]twoSumReal(int[]nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
           if(map.containsKey(target-nums[i])){
               return new int[]{map.get(target-nums[i]), i};
           }else{
               map.put(nums[i], i);
           }
        }

        return new int[]{-1,-1};
    }
}
