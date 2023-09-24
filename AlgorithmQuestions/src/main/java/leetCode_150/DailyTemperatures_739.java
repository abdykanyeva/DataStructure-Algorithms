package leetCode_150;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures_739 {

    public static void main(String[] args) {

        int[] temp = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemp(temp)));
    }


    public static int[] dailyTemp(int []temp){
        /*
        Input: temperatures = [73,74,75,71,69,72,76,73]
        Output: [1,1,4,2,1,1,0,0]

         */

        Stack<Integer> stack = new Stack<>();
        int [] result = new int[temp.length];
        int n = temp.length;

        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && temp[i]>=temp[stack.peek()]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                result[i]=stack.peek()-i;
            }

            stack.push(i);
        }

        return result;



    }
}
