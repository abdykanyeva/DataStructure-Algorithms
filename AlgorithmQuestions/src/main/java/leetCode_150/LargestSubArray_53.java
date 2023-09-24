package leetCode_150;

public class LargestSubArray_53 {


    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));

    }

    public static int maxSubArray(int[]nums){

        // -2,1,-3,4,-1,2,1,-5,4

        int max = Integer.MIN_VALUE;
        int temp = 0;

        for(int each: nums){
            temp=temp+each;

            if(temp>max){
                max=temp;
            }
            if(temp<0){
                temp=0;
            }


        }
        return max;
    }
}
