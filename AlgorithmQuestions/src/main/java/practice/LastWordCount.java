package practice;

public class LastWordCount {

    public static void main(String[] args) {

        System.out.println(countLast("mY NAME IS ADELINA "));
        System.out.println(countLast1("my name is adelina "));
    }


    public static int countLast(String s){

        int count = 0;
        int i = s.length() - 1;

        while(s.charAt(i) == ' '){
            i--;

        }
        while(s.charAt(i) != ' '){
            count++;
            i--;
        }
        return count;
    }

    public static int countLast1(String s){

        String result = s.trim();

        int count = 0;

        for (int i = result.length() - 1; i >= 0 ; i--) {
            if(result.charAt(i) != ' ') {
                count++;
            }else{
                break;
            }

        }


        return count;
    }


}
