package leetCode_150;

import java.util.HashMap;

public class RansomNote_383 {

    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aac"));

    }


    public static boolean canConstruct(String ransomNote, String magazine){
        // ransomNote = "aa", magazine = "aab"

        HashMap<Character, Integer> map = new HashMap<>();
        //a-2
        //c-1


        for(char each:magazine.toCharArray()){
            if(map.containsKey(each)){
                map.put(each,map.get(each)+1);
            }else{
                map.put(each,1);
            }
        }
        for(char each:ransomNote.toCharArray()){
            if(map.containsKey(each) && map.get(each)>0){
                map.put(each, map.get(each)-1);
            }else{
                return false;
            }
        }

        return true;

    }
}
