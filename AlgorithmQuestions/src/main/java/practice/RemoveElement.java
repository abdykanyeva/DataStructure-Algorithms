package practice;

public class RemoveElement {
    public static void main(String[] args) {

        System.out.println(removeElement(new int[]{3, 2, 2, 3}, 3));

    }

    public static int removeElement(int[]array, int val){

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(val!=array[i]){
                array[count] = array[i];
                count++;
            }
        }
        return count;
    }


}


