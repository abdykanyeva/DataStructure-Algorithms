package leetCode_150;

public class NumberOfSubArrays_1343 {
    public static void main(String[] args) {

        //  System.out.println(numberOfSubArrays(new int[]{2, 2, 5, 5, 5, 8}, 3, 4));

        //System.out.println(numberOfSubArrays(new int[]{2, 2, 2, 2, 5, 5, 5, 8}, 3, 4));
        System.out.println(maxSubArray(new int[]{2, 1, 5, 1, 3, 2}, 3));
    }


    public static int numberOfSubArrays(int[] array, int k, int threshold) {
        // arr = [2,2,5,5,5,8] int k = 3, tresh = 4

        int sum = 0;
        int start = 0;
        int end = 0;
        int count = 0;
        while (start < array.length) {
            sum += array[start];
            int length = start - end + 1;
            if (length == k) {
                if (sum / k >= threshold) {
                    count++;
                }
                sum -= array[end];
                end++;
            }
            start++;
        }
        return count;


    }


    public static int maxSubArray(int[] array, int k) {

        // 2,1,5,1,3,2  k=3

        int start = 0;
        int end = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;

        while(start<array.length){
            sum+=array[start];
            if(start>=k-1){
                max = Math.max(sum, max);
                sum-=array[end];
                end++;
            }

            start++;
        }
        return max;
    }
}
