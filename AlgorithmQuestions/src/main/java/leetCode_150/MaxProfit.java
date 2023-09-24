package leetCode_150;

public class MaxProfit {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{8, 3, 3, 1, 4, 9, 12, 11}));

    }


    public static int maxProfit(int[]array){

        int max_profit=0;
        int min_value=Integer.MAX_VALUE;

        // 8,3,3,1,4,9,12,11

        for(int each:array){
            if(each<min_value){
                min_value=each;
            }else if(each-min_value>max_profit){
                max_profit=each-min_value;
            }
        }

        return max_profit;

    }
}
