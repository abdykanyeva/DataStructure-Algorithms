package leetCode_150;

import java.util.HashMap;

public class FrequencyOfEachElement {

    public static void main(String[] args) {
        int[]array = new int[]{1,1,1,2,3,3,3,4,4,5,6};
        frequencyOfEachElement(new String[]{"Apple", "Apple", "Cherry"});
        frequencyOfEachWord(array);

    }


    public static void frequencyOfEachElement(String[]array){

        HashMap<String, Integer> map=new HashMap<>();

        for(String each:array){
            if(map.containsKey(each)){
                map.put(each, map.get(each)+1);
            }else{
                map.put(each, 1);
            }
        }
        System.out.println(map);
    }


    public static void frequencyOfEachWord(int[]arr){
        /*
     int[]arr = {1,2,3,4,3,2,1,3,2,2,2,4};

        write a program that should count each number and prints a sentence to say
        how many times a number is repeated example:
        1 is two,
        3 is three,
        4 is two.
        2 is five

     */

        //int[]array=new int[]{1,1,1,3,4,5};
        String[]inLetter={"one", "two", "three", "four", "five", "six", "seven",
                "eight", "nine", "ten", "more than ten"};

        HashMap<Integer, String>map=new HashMap<>();

        for(int each:arr){
            int count=0;
            for(int each1:arr){
                if(each==each1){
                    count++;
                }
            }
            if(count>10){
                map.put(each, inLetter[11]);
            }else{
                map.put(each, inLetter[count]);
            }
        }

        System.out.println(map);


    }
}
