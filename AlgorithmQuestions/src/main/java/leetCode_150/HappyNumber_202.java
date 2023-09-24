package leetCode_150;

import java.util.HashSet;

public class HappyNumber_202 {

    public static void main(String[] args) {

        System.out.println(happyNum(19));
    }


    public static boolean happyNum(int n){
        //19
        HashSet<Integer> set  = new HashSet<>();

        while(n!=1){
            int current = n;
            int sum = 0;
            while(current!=0){
                sum+=(current%10)*(current%10);
                current/=10;
            }
            if(set.contains(sum)){
                return false;
            }
            set.add(sum);
            n=sum;
        }
        return true;
    }
}
