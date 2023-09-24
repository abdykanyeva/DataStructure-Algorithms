package leetCode_150;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(removeFromSorted(new int[]{1,1,2,2,2,3,4,4})));

    }


    public static int[]removeFromSorted(int[]array){
        //1,1,2,3,4,4,5

        int position=1;
        for (int i = 2; i < array.length; i++) {
            if(array[i]!=array[position-1]){
                array[++position]=array[i];
            }
        }
        return array;
    }
}
