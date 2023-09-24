package leetCode_150;

public class CanPlaceFlowers_605 {

    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));

    }

    public static boolean canPlaceFlowers(int[]flowerBed, int n){
        // flowerbed = [1,0,0,0,1], n = 1 -> true

        int count = 0;

        for (int i = 0; i < flowerBed.length; i++) {
            if (flowerBed[i] == 0) {
                int prev = (i == 0 || flowerBed[i - 1] == 0) ? 0 : 1;
                int next = (i == flowerBed.length - 1 || flowerBed[i + 1] == 0) ? 0 : 1;

                if (prev == 0 && next == 0) {
                    flowerBed[i] = 1;
                    count++;
                }
            }
        }
        return count>=n;
    }
}
