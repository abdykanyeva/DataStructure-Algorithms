package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class FindMissingNumberInArray {
    public static void main(String[] args) {
       int[] myArray = {1,2,3,4,6,6,3}; // 5
        System.out.println(findMissingNumberInArray(myArray));
        System.out.println(Arrays.toString(removeDuplicates(myArray)));
        System.out.println(Arrays.toString(removeDup(myArray)));
        System.out.println(removeDup1(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }

    public static int findMissingNumberInArray(int[]array){
        int n = array.length +1;
        int expectedSum = (n*(n+1))/2;
        int actualSum = 0;

        for(int each:array){
            actualSum+=each;

        }
        return expectedSum-actualSum;
    }


    public static int[] removeDuplicates(int[]array){

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int each:array){
            if(map.containsKey(each)){
                count = map.get(each);
                map.put(each, count+1);
            }else map.put(each, 1);
        }
        for(int each:map.keySet()){
            if(each==1){
                array[count] = each;
            }
        }
            return    array;
    }



    public static int[] removeDup(int[] array){

        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int each:array){
            if(!arrayList.contains(each)){
                arrayList.add(each);
            }
        }
        array = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            array[i] = arrayList.get(i);
        }
        return array;
    }


    public static int removeDup1(int [] array){
        // Input: nums = [1, 1, 2]
        //Output: 2

        if(array.length==0){
            return 0;
        }
        int i = 0;
        for (int j = 0; j < array.length; j++) {
            if(array[i]!=array[j]){
                i++;
                array[j]=array[i];
            }
        }
        return i+1;

    }


}


// int [] score = {80, 85, 97, 67, 99, 58} -> 99, 97