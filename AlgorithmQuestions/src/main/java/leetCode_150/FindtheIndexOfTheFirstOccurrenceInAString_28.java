package leetCode_150;

import javax.management.MBeanAttributeInfo;

public class FindtheIndexOfTheFirstOccurrenceInAString_28 {

    public static void main(String[] args) {
        System.out.println(strSubstring("hello", "ll"));

    }

    public static int strSubstring(String haystack, String needle){
        // haystack = "sadbutsad", needle = "sad" // 0, 6 -> 0

        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;

    }
}
