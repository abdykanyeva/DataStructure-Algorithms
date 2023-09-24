package leetCode_150;

public class MaxSubArray {

    public static void main(String[] args) {

        /*
        Find max sum of subArray of a fixed size k

        {4,2,1,7,8,1,2,8,1,0}
         */
        System.out.println(findMaxSubArray(new int[]{4, 2, 1, 7, 8, 1, 2, 8, 1, 0}, 3));
        System.out.println(smallestSubArray(8, new int[]{4, 2, 2, 7, 8, 1, 2, 8, 10}));
    }


    public static int findMaxSubArray(int[]arr, int k){

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if(i>=k-1){
                max = Math.max(max, sum);
                sum-=arr[i-(k-1)];
            }
        }
        return max;

    }


    public static int findMaxSubArray2(int[] array, int k){

        // {4,2,1,7,8,1,2,8,1,0}

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum+=array[i];

            if(i>=k-1){
               max = Math.max(max, sum);
               sum-=array[i-(k-1)];
            }
        }

        return max;

    }

    public static int smallestSubArray(int targetSum, int[]array){

        // 4,2,2,7,8,1,2,8,10
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;

        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
            while(sum>=targetSum){
                min = Math.min(min, i-start+1 );
                sum-=array[start];
                start++;
            }

        }
        return min;

    }
}
