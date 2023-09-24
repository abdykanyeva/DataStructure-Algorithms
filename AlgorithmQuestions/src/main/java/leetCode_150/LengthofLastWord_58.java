package leetCode_150;

public class LengthofLastWord_58 {
    public static void main(String[] args) {

        String s = "a"; // 5
        System.out.println(lengthOfWord(s));
    }

    public static int lengthOfWord(String s){
        if(s.length()==0){
            return 0;
        }
        int count = 0;
        for(int i=s.length()-1;i>=0;i--){

            if(s.charAt(i) !=' '){
                count++;

            }
            else if(count>0){
                return count;
            }


        }
        return count;

    }
}
