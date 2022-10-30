package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class MajorityElement {

    public static void main(String[] args) {

    }


    public static int majorityElement(int[] nums){
        if(nums.length == 1){
            return nums[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            }else{
                map.put(i, 1);
            }
            if(map.get(i) > nums.length / 2){
                return i;
            }
        }
        throw new NoSuchElementException("Invalid");


    }
}
