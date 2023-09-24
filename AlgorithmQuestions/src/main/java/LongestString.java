import java.util.HashSet;
import java.util.Set;

public class LongestString {

    public static void main(String[] args) {

        System.out.println(longestString("pwwkew"));
    }

    public static int longestString(String str){

        Set<Character> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

                if(set.add(str.charAt(i))) {

                    count++;
            }
        }
        return count;
    }


    public static int longestString1(String str){
        return -1;

    }
}

