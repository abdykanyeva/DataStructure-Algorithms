package leetCode_150;

import java.util.HashMap;

public class NoTriples {

    public static void main(String[] args) {

        /*
    Given an array of ints, we'll say that a triple is a value appearing 3 times
    in a row in the array. Return true if the array does not contain any triples.


        noTriples([1, 1, 2, 2]) → true
        noTriples([1, 1, 2, 2, 2, 1]) → false
        noTriples([1, 1, 1, 2, 2, 2, 1]) → false
     */

        System.out.println(noTriples(new int[]{1, 1, 1, 2, 2, 2, 1}));
        System.out.println(noTriples1(new int[]{1, 1, 1, 2, 2}));
    }


    public static boolean noTriples(int[]array){

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int each:array){
            if(!map.containsKey(each)){
                map.put(each, 1);
            }else{
                map.put(each, map.get(each)+1);
            }
        }
        for(int each: map.keySet()){
            if(map.get(each)>2){
                return false;
            }
        }
        return true;

    }


    public static boolean noTriples1(int[]array){

        //1, 1, 2, 2, 1
        for (int i = 0; i < array.length-2; i++) {
            if(array[i]==array[i+1]&& array[i]==array[i+2]){
                return false;
            }
        }


        return true;
    }
}
