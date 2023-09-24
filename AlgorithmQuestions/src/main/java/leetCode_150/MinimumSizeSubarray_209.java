package leetCode_150;

public class MinimumSizeSubarray_209 {

    public static void main(String[] args) {
        System.out.println(minLength(new int[]{2, 3, 1, 2, 4, 3}, 7));

    }

    public static int minLength(int[]array, int target){

        // target = 7, nums = [2,3,1,2,4,3]

        int r = 0;
        int l = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        while(r < array.length){
            sum+=array[r];
            while(target <= sum){
                min = Math.min(min, r-l+1);
                sum-=array[l];
                l++;

            }
            r++;
        }
        return min == Integer.MAX_VALUE ? 0: min;

    }
}
