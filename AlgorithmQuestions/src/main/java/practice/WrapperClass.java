package practice;

public class WrapperClass {
    public static void main(String[] args) {

        String a = "10";
        System.out.println(Integer.parseInt(a));
        int b = 10;
        String c = String.valueOf(Integer.valueOf(b));
        System.out.println(c);
    }
}
