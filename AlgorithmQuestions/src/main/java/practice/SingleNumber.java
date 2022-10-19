package practice;

import java.util.*;

public class SingleNumber {

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2, 2, 1, 1, 3}));
    }


    public static int singleNumber(int[] nums) {

       Map<Integer, Integer> map = new HashMap<>();

       for(int each: nums){
           if(map.containsKey(each)){
               map.put(each, map.get(each) + 1);
           }else{
               map.put(each, 1);
           }


           }
         for(int each:nums){
             if(map.get(each) == 1){
                 return each;
             }
         }
         return 0;
       }


    }

