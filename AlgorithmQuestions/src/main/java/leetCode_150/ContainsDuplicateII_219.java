package leetCode_150;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII_219 {

    public static void main(String[] args) {

        int[]array = new int []{1,2,3,1};
        System.out.println(containsDuplicate(array, 3));
    }


    public static boolean containsDuplicate(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i <  nums.length; i++) {
            Integer ord = map.put(nums[i], i);
            if(ord != null && i - ord <= k) {
                return true;
            }
        }

        return false;
    }

    public static boolean containsDuplicate1(int[]nums, int k){

        // 1,2,3,1 -> 1
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                if(i-map.get(nums[i])<=k) return true;
            }
            map.put(nums[i], i);
        }

        return false;
    }
}
