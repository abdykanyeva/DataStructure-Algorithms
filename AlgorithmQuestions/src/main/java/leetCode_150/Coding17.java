package leetCode_150;

import java.util.Arrays;
import java.util.HashMap;

public class Coding17 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3,3}, 6)));
    }


    public static int[]twoSum(int[]array, int target){

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if(map.containsKey(target-array[i])){
                return new int[]{i, map.get(target - array[i])};
            }else{
                map.put(array[i], i);
            }

        }
        return new int[]{};

    }
}
