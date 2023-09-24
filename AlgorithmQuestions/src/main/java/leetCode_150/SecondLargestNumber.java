package leetCode_150;

public class SecondLargestNumber {

    public static void main(String[] args) {

        System.out.println(secondLargest(new int[]{1, 2, 3, 4, 5}));
        System.out.println(secondSmallest(new int[]{1, 2, 3, 4, 5}));

    }


    public static int secondLargest(int[]array){

        //1,2,3,4,5
        int max1=array[0];
        int max2=array[0];
        for(int each:array){
            if(each>max1){
                max2=max1;
                max1=each;

            }else if(each>max2){
                max2=each;
            }
        }
        return max2;
    }

    public static int secondSmallest(int[]array){

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int each:array){
            if(min1>each){
                min2=min1;
                min1=each;
            }else if(min2>each){
                min2=each;
            }
        }
        return min2;
    }
}
