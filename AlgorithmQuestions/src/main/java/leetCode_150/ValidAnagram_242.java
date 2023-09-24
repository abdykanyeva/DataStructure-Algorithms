package leetCode_150;

import java.util.HashMap;

public class ValidAnagram_242 {

    public static void main(String[] args) {

        System.out.println(validAnagram("anagram", "nagaram"));
        System.out.println(validAnagram1("anagram", "nagaram"));
    }


    public static boolean validAnagram(String s, String t){
        // s = "anagram", t = "nagaram"

        if(s.length()!=t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length();i++){
            char each = s.charAt(i);
            if(!map.containsKey(each)){
                map.put(each, 1);
            }else{
                map.put(each, map.get(each)+1);
            }
        }
        for(char each: t.toCharArray()){
            if(map.get(each)!=null){
                if(map.get(each)==1){
                    map.remove(each);
                }else{
                    map.put(each, map.get(each)-1);
                }
            }else{
                return false;
            }
        }



        return map.isEmpty();

    }
    
    public static boolean validAnagram1(String pattern, String s){
        
        int[]char_count= new int[26];

        for (int i = 0; i < pattern.length(); i++) {
            char_count[pattern.charAt(i) -'a']++;
            char_count[s.charAt(i)-'a']--;
        }
        for(int count:char_count){
            if(count>0){
                return false;
            }
        }
        return true;
    }
}
