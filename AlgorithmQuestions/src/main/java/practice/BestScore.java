package practice;

import java.util.Arrays;

public class BestScore {
    public static void main(String[] args) {
       int[] myArray = {84,85,86,87, 0};
       // 90, 87
        System.out.println(Arrays.toString(findTwoScores(myArray)));
    }


    public static int[] findTwoScores(int[] array){
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int score:array){
            if(firstMax < score){
                secondMax = firstMax;
                firstMax = score;


            }else if(score > secondMax && firstMax > score){
                secondMax = score;
            }
        }
        return new int[]{firstMax, secondMax};
    }
}
