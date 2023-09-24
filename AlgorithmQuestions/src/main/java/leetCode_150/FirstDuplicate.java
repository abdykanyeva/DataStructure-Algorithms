package leetCode_150;

import java.util.HashMap;
import java.util.NoSuchElementException;

public class FirstDuplicate {

    public static void main(String[] args) {
        System.out.println(firstDuplicate(new int[]{0,1,0,0,0}));

    }

    public static int firstDuplicate(int[]array){
        // 1,1,2,3,4


        HashMap<Integer, Integer> map = new HashMap<>();

        for(int each:array){
            if(map.containsKey(each)){
                map.put(each, map.get(each)+1);
            }else{
                map.put(each, 1);
            }
        }
        for(int each: map.keySet()){
            if(map.get(each)>1){
                return each;

            }
        }
        throw new NoSuchElementException("no such element");
    }
}
