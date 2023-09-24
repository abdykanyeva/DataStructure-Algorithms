package leetCode_150;

import java.util.Arrays;

public class RotateArray_189 {

    public static void main(String[] args) {
        int[]array={-1,-100,3,99};
       // rotate(array, 2);
        System.out.println(Arrays.toString(reverse(array)));

    }

//    public static void rotate(int[]array, int k){
//        //[-1,-100,3,99], k = 2
//        //rotate 1 steps to the right: [99,-1,-100,3]
//        //rotate 2 steps to the right: [3,99,-1,-100]
//
//
//        for (int i = 0; i < array.length/1; i++) {
//           int temp = array[i];
//           int moving = array.length -k -i;
//            array[i]=array[moving];
//            array[moving] = temp;
//
//        }
//        System.out.println(Arrays.toString(array));
//
//    }




    public static int[] reverse(int []array){

        // array ={1,2,3,4,5} -> 5,4,3,2,1
        for (int i = 0; i < array.length/2; i++) {
            int temp =array[i];
            int last = array.length-1-i;
            array[i]=array[last];
            array[last]=temp;
        }
        return array;
    }
}
