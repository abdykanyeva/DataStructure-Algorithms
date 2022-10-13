import java.util.Arrays;

public class Product {
    public static void main(String[] args) {


        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
    }

    public static int[]productExceptSelf(int[] num) {

        int[] left = new int[num.length];
        int[] right = new int[num.length];
        int[] result = new int[num.length];

        left[0] = 1;
        right[num.length - 1] = 1;

        for (int i = 1; i < num.length; i++) {
            left[i] = left[i - 1] * num[i - 1];
            right[num.length - i - 1] = right[num.length - i] * num[num.length - i];
        }

        for (int i = 0; i < num.length; i++)
            result[i] = left[i] * right[i];

        return result;
    }

}
