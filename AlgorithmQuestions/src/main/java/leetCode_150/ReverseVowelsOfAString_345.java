package leetCode_150;

public class ReverseVowelsOfAString_345 {

    public static void main(String[] args) {

        System.out.println(reverseVowels("leetcode"));
    }

    public static String reverseVowels(String s){
        // s = "hello" => "holle"

        // 'a', 'e', 'i', 'o', and 'u'

      String vowels = "aeiouAEIOU";
      char [] str = s.toCharArray();
      int start = 0;
      int end = s.length()-1;

      while(start<end){
          while(start<end && !vowels.contains(str[start]+"")){
              start++;

          }

          while(start<end && !vowels.contains(str[end]+"")){
              end--;
          }

          char temp = str[start];
          str[start] = str[end];
          str[end] = temp;
          start++;
          end--;
      }



      return new String(str);

    }
}
