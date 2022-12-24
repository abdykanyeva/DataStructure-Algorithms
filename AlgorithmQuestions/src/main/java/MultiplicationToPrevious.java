import java.util.Arrays;

public class MultiplicationToPrevious {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(multiplicationToPrev(new int[]{2, 3, 4, 6})));
    }


    public static int[] multiplicationToPrev(int[] array){

        int prev = array[0];
        array[0] = array[0] * array[1];
        for(int i = 1; i < array.length - 1; i++){
            int current = array[i];
            array[i] = prev * array[i + 1];
            prev = current;

        }
        array[array.length - 1] = prev * array[array.length - 1];
        return array;

    }
}
