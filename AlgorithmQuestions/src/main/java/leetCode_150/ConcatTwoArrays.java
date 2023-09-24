package leetCode_150;

import java.util.Arrays;

public class ConcatTwoArrays {

    public static void main(String[] args) {

        int[]num1={1,1,2,3};
        int[]num2={3,4,5,6};
        System.out.println(Arrays.toString(concat(num1, num2)));
    }


    public static int[]concat(int[]array1, int[]array2){

        int[]array3=new int[array1.length+array2.length];


        int i =0;
        for(int each:array1){
            array3[i]=each;
            i++;
        }
        for(int each:array2){
            array3[i]=each;
            i++;
        }
        return array3;

    }
}
