package leetCode_150;

import java.util.ArrayList;
import java.util.List;

public class GreatestNumberOfCandies_1431 {

    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));

    }


    public static List<Boolean> kidsWithCandies(int[]candies, int extraCandy){

        List<Boolean> list = new ArrayList<>();

        int max = Integer.MIN_VALUE;
        for(int each:candies){
            max = Math.max(max, each);
        }
        for(int each:candies){
            list.add(each+extraCandy>=max);
        }
        return list;
    }

    /*
    Input: candies = [2,3,5,1,3], extraCandies = 3
    Output: [true,true,true,false,true]
     */
}
