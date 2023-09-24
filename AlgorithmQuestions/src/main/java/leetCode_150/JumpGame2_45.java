package leetCode_150;

public class JumpGame2_45 {

    public static void main(String[] args) {

        int []array = {2,3,0,1,4};
        System.out.println(jump(array));
    }


    public static int jump(int[]nums){
        int jumps = 0, currEnd = 0, currFarthest = 0;
        for(int i = 0; i < nums.length - 1; i ++) {
            currFarthest = Math.max(currFarthest, i + nums[i]);
            if(i == currEnd) {
                currEnd = currFarthest;
                jumps ++;
            }
        }
        return jumps;
    }
}
