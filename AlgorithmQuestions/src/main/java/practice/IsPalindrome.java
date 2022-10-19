package practice;

public class IsPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome1("race a car"));
    }


    public static boolean isPalindrome(String s){


        s = s.toLowerCase();
        String result = "";
        String original = "";

        for(int i = s.length() - 1; i >= 0; i--){
            if(!Character.isLetterOrDigit(s.charAt(i)) || s.charAt(i) == ' '){
                continue;
            }else{
                result += s.charAt(i);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if(!Character.isLetterOrDigit(s.charAt(i)) || s.charAt(i) == ' '){
                continue;
            }
            else {
                original+=s.charAt(i);
            }
        }
        return result.equals(original);

    }

    public static boolean isPalindrome1(String s){

        if (s == null) {
            throw new IllegalArgumentException("Input string is null");
        }

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;


    }
}
