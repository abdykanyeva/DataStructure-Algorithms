package leetCode_150;

import java.util.HashMap;

public class FirstNonRepeating {
    public static void main(String[] args) {

        System.out.println(firstNonRepeating("aabb"));
    }

    public static int firstNonRepeating(String s){

        // leetcode

        HashMap<Character, Integer> map = new HashMap<>();

        for(char each: s.toCharArray()){
            if(!map.containsKey(each)){
                map.put(each, 1);

            }else{
                map.put(each, map.get(each)+1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)) == 1){
                return i;
        }

        }
        return -1;

    }
}
