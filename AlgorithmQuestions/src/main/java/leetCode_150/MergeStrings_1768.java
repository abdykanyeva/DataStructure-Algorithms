package leetCode_150;

public class MergeStrings_1768 {

    public static void main(String[] args) {

        System.out.println(mergeStrings("abc", "pqrt"));
        System.out.println(mergeStrings1("abc", "pqrt"));

    }

    public static String mergeStrings(String word1, String word2){
        String result ="";
        int i = 0;
        while(word1.length()>i && word2.length()>i){
            result+=word1.charAt(i)+""+word2.charAt(i);
            i++;
        }
        while(word1.length()>i){
            result+=word1.charAt(i);
            i++;
        }
        while(word2.length()>i){
            result+=word2.charAt(i);
            i++;
        }
        return result;
    }

    public static String mergeStrings1(String word1, String word2){

        StringBuilder str = new StringBuilder();
        int i = 0;

        while(word1.length()>i || word2.length() > i){
            if(word1.length()>i){
                str.append(word1.charAt(i));

            }
            if(word2.length()>i){
                str.append(word2.charAt(i));

            }
            i++;
        }
        return str.toString();
    }
}
