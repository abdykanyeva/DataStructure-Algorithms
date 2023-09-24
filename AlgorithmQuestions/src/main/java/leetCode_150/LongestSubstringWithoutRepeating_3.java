package leetCode_150;

import javax.xml.stream.events.Characters;
import java.util.HashSet;

public class LongestSubstringWithoutRepeating_3 {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));

    }

    public static int lengthOfLongestSubstring(String s){
        int i = 0;
        int j = 0;
        int max = Integer.MIN_VALUE;
        //cabcbb

        HashSet<Character> set = new HashSet<>();
        while(i<s.length()){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                i++;
                max = Math.max(set.size(),max);
            }else{
                set.remove(s.charAt(j));
                j++;

            }
        }
        return max;
    }
}
