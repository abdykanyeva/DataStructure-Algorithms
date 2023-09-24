package leetCode_150;

public class IntegerToRoman_12 {

    public static void main(String[] args) {
        System.out.println(intToRoman(58));

    }

    public static String intToRoman(int num) {

        //58
        int[] nu = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] str = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX","V", "IV", "I"};

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nu.length; i++) {
            while (num >= nu[i]) {
                sb.append(str[i]);
                num = num - nu[i];

            }
        }
        return sb.toString();
    }
}