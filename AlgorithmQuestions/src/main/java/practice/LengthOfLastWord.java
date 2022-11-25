package practice;

public class LengthOfLastWord {

    public static void main(String[] args) {

        System.out.println(lengthOfLastWord("Hello World"));

        System.out.println(lengthOfLastWordWithouTrim("fly me  to the moon "));

        StringBuilder str = new StringBuilder();
        StringBuffer str2 = new StringBuffer();
    }

    public static int lengthOfLastWord(String word){
        word = word.trim();

        // "Hello World
        int count = 0;

        for(int i = word.length() - 1; i >= 0; i--){
            if(word.charAt(i) != ' '){
                count++;
            }else{
                break;
            }
        }
        return count;
    }


    public static int lengthOfLastWordWithouTrim(String word){

        int count = 0;
        for(int i = word.length() - 1; i >= 0; i--){
            if(Character.isWhitespace(word.charAt(i))){
                if(count > 0){
                    return count;
                }else{
                    continue;
                }
            }
            count++;

        }
        return count;
    }


}
