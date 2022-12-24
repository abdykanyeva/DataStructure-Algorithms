import java.util.*;

public class FrequencyOfWords {

    public static void main(String[] args) {


        System.out.println(countWords("    This is an example of example"));
    }

    public static Map<String, Integer> countWords(String sentence){

        sentence = sentence.trim();
        Map<String, Integer> map = new HashMap<>();
        for(String each: sentence.split(" ")){
            if(map.containsKey(each)){
                map.put(each, map.get(each) + 1);
            }else{
                map.put(each, 1);
            }

        }
        return map;

    }
}
