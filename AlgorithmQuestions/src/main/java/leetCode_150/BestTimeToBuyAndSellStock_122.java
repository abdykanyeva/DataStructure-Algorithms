package leetCode_150;

public class BestTimeToBuyAndSellStock_122 {

    public static void main(String[] args) {

        //[7,1,5,3,6,4]
        int[]array={7,1,5,3,6,4};
        System.out.println(maxProfit(array));
    }


    public static int maxProfit(int []prices){
        int profit=0;


        for (int i = 1; i < prices.length; i++) {
            if(prices[i]>prices[i-1]){
                profit=profit+(prices[i]-prices[i-1]);
            }
        }
        return profit;
    }
}
