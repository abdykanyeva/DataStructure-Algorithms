package leetCode_150;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;

public class Anagram {

    public static void main(String[] args) {

        System.out.println(anagram("abc", "cab"));
    }

    /*
    Write a  function that check if a string is build out of the same letters as another string.
            Ex: same("abc", "cab"); -> true , Solution 1:
                same("abc", "abb"); -> false:

     */


    public static boolean anagram(String a, String b){

        //"abc", "cab"

        HashMap<Character, Integer> map = new HashMap<>();

        for(char each:a.toCharArray()){
            if(map.containsKey(each)){
                map.put(each, map.get(each)+1);
            }else{
                map.put(each, 1);
            }
        }
        for(char each:b.toCharArray()){
            if(map.get(each)!=null) {
                if(map.get(each)==1){
                    map.remove(each);
                }else{
                    map.put(each, map.get(each)-1);
                }
            }
            else{
                return false;
            }
        }
        return map.isEmpty();


    }


}
