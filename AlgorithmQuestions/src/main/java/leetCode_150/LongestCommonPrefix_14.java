package leetCode_150;

import java.util.Arrays;

public class LongestCommonPrefix_14 {

    public static void main(String[] args) {

        String [] str = {"flower","flow","flight"}; //fl
        System.out.println(longestCommonPrefix(str));

    }

    public static String longestCommonPrefix(String[] str) {

        String prefix = str[0];

        for (int i = 1; i < str.length; i++) {
            while (str[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;


    }
}
