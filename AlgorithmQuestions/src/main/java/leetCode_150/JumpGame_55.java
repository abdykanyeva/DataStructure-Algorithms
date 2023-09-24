package leetCode_150;

public class JumpGame_55 {

    public static void main(String[] args) {

       int [] nums = {2,3,1,1,4};
        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[]nums){

        int endGoal = nums.length -1;
        for (int i = nums.length-1; i >=0 ; i--) {
            if(i+nums[i]>=endGoal){
                endGoal=i;
            }
        }

        return endGoal==0;

    }
}
