package leetCode_150;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] array= {3,3,4}; // 3
        System.out.println(majorityElement(array));

       // 3-2
        // 2 -1

    }


    public static int majorityElement(int[]nums) {

        HashMap<Integer,Integer> map= new HashMap<>();

        for(int each: nums){
            if(map.containsKey(each)){
                map.put(each, map.get(each)+1);
            }else{
                map.put(each, 1);
            }
            if(map.get(each)>nums.length/2){
                return each;
            }
        }
        return -1;





    }

}
