package leetCode_150;

public class ValidPalindrome_125 {
    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
       // System.out.println(isPalindrome(s));
        System.out.println(isPalindrome2(s));
    }

    public static boolean isPalindrome(String s){
        //s = "A man, a plan, a canal: Panama"

        if(s.isEmpty()){
            return true;
        }

        String result="";

        for(char each:s.toCharArray()){
            if(Character.isDigit(each)||Character.isLetter(each)){
                result+=each;
            }
        }
        result=result.toLowerCase();

        int start=0;
        int end=result.length()-1;
        while(start<=end){
            if(result.charAt(start)!=result.charAt(end)){
                return false;
            }
            start+=1;
            end-=1;
        }
        return true;


    }


    public static boolean isPalindrome2(String s){

        int start=0;
        int end=s.length()-1;

        while(start<=end){
            while(start<end && !Character.isLetterOrDigit(start)){
                start++;
            }
            while(start<end && !Character.isLetterOrDigit(end)){
                end--;
            }
            if(Character.toLowerCase(s.charAt(start))!=Character.toLowerCase(s.charAt(end))){
                return false;
            }
            start++;
            end--;
        }
        return true;





    }
}
