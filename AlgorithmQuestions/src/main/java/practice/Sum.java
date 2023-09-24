package practice;

import java.util.Arrays;

public class Sum {

    public static void main(String[] args) {
        int []array = new int[]{1,2,3,4,5};
        int sum = 0;
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];   // O(n)
            product*=array[i];
        }
        System.out.println(sum);
        System.out.println(product);


        System.out.println(Arrays.toString(reverse(array)));
    }




    public static void printPairs(int []array){
        for (int i = 0; i < array.length; i++) {

        }
    }

    public static int[] reverse(int[] array){

        // 1,2,3,4,5,6
        //5,4,3,2,1

        for(int i = 0;i<array.length/2; i++){
            int other = array.length - 1 - i;
            int temp = array[i];
            array[i] = array[other];
            array[other] = temp;
        }
        return array;
    }



}
