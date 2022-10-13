import com.github.fracpete.romannumerals4j.RomanNumeralFormat;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

public class RomanToIntegers {

    public static void main(String[] args) throws ParseException {

      //  System.out.println(romanToInt("MCMXCIV"));

        RomanNumeralFormat f = new RomanNumeralFormat();
        System.out.println(f.parse("MCMXCIV"));
    }


    public static int romanToInt(String str){

        /*
        Input: s = "MCMXCIV"
        Output: 1994
        Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

         */
        // map -> character, integer
        // assign to integer the last element of the string
        // for loop -> to check if left is bigger than right
        // -> find difference
        // -> add

        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);


        // Input: s = "MCMXCIV" - 7
        int result = map.get(str.charAt(str.length() - 1));

        for(int i = str.length() - 2; i >= 0; i--){
            if(map.get(str.charAt(i)) < map.get(str.charAt(i + 1))){
                result -= map.get(str.charAt(i));
            }else{
                result += map.get(str.charAt(i));
            }
        }
        return result;


    }
}
