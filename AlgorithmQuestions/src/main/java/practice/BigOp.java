package practice;

import java.util.Arrays;

public class BigOp {

    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5};
        System.out.println((array[0])); // ------> O(1)


        for (int i = 0; i < 100; i*=2) {
            System.out.println(i); // -------> O(n)
        }


    }
}
