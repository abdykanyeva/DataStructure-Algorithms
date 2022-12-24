package practice;

public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println(digital_count(132189));
    }



    public static int digital_count(int n){
        int sum = 0;  // 1, 2

        while(n > 0){   //
            sum += n%10; // 1 + 1 + 1
            n/=10;  // 11 , 1 , 0
        }

        return sum; // 3
    }
}
