package leetCode_150;

import java.util.HashMap;

public class RemoveDuplicatesFromSortedArrayII_80 {
    public static void main(String[] args) {
        int[]nums = {1,2,2,3,3,3};
        System.out.println(removeDup(nums));
       removeDupNotSorted(nums);
    }




    public static int removeDup(int[]array){
        // 1,2,2,3 -> 5

       int j=0; //1,2

        for (int i = 1; i < array.length; i++) {
            if(array[i]!=array[j]){
                j++;
                array[j]=array[i];
            }
        }
        return j+1;
    }


    public static void removeDupNotSorted(int[]array){
        // 1,6,6,2,2,3,4,5,1

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int each:array){
            if(!map.containsKey(each)){
                map.put(each, 1);
            }
            else{
                map.put(each, map.get(each)+1);
            }
        }
       map.forEach((k,v)-> System.out.print(k + " "));








    }

}
