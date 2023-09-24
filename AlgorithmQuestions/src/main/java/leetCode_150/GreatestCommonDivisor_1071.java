package leetCode_150;

import jdk.swing.interop.SwingInterOpUtils;

public class GreatestCommonDivisor_1071 {

    public static void main(String[] args) {
        String str1 = "ABCABCABC";
        String str2 = "ABC";

        System.out.println(greatestCommonDiv(str1, str2));


    }


    public static String greatestCommonDiv(String str1, String str2){

        if(!(str1 + str2).equals(str2+str1)){
            return "";
        }
        int resGsd = gsd(str1.length(), str2.length());
        return str1.substring(0,resGsd);






    }
    private static int gsd(int num1, int num2){
        if(num2==0){
            return num1;
        }else{
            return gsd(num2, num1%num2);
        }

    }
}
