package leetCode_150;

import java.util.HashMap;

public class MaxNumberOfKSumPairs_1679 {

    public static void main(String[] args) {
        System.out.println(maxOperations(new int[]{3,1,3,4,3}, 6));

    }

    public static int maxOperations(int[]nums, int k){
        //  nums = [2,2,3,2], k = 5
        // nums = [3,1,3,4,3], k = 6


        int i = 0;
        int j = nums.length-1;
        int count = 0;

        while(i< j){
            if(nums[i]+nums[j] == k){
                i++;
                j--;
                count++;
            }else if(nums[i]+nums[j]>k){
                i++;

            }else{
                j--;
            }


        }

        return count;

    }


    public static int maxOperations2(int []nums, int k){

        //  nums = [2,2,3,2], k = 5
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(k-nums[i]) && map.get(k-nums[i])>0){
                count++;
                map.put(k-nums[i],map.get(k-nums[i])-1 );

            }else{
                map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            }

        }
        return count;
    }
}
