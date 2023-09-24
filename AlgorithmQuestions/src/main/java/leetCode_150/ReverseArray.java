package leetCode_150;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(new int[]{1,2,3,4,5})));

    }


    public static int[]reverse(int[]array){

        for (int i = 0; i < array.length/2; i++) {
            int temp=array[i];
            int res = array.length -1-i;
            array[i]=array[res];
            array[res]=temp;
        }
        return array;

    }
}
