package leetCode_150;

import java.util.HashMap;

public class Mock17 {

    public static void main(String[] args) {
        int []array = {-5,1,5,0,-7};
        System.out.println(steps(array));
    }


    public static int steps(int []array){

        int gain = 0;
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            gain+=array[i];
            max = Math.max(gain, max);
        }

        return max;

    }



}

