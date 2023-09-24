package leetCode_150.search;

public class BinarySearch {

    public static void main(String[] args) {
        int [] arr = {8,9,12,15,17,19,20,21,28};
        BinarySearch.binarySearch(arr,15);
        //  System.out.println(binarySearch(arr, 6));


    }

    public static int binarySearch(int[]arr, int num){

        // Binaray search works only with sorted arrays
        // With the help of binary search we can eliminate the half of the elements at a time

        int start = 0;
        int end = arr.length - 1;
        int middle = (start+end)/2;
        System.out.println(start +" "+middle+" "+ end);
        while(num!=arr[middle] && start<=end){
            if(num > arr[middle]){
                start=middle+1;
            }else{
                end = middle-1;
            }
            middle=(start+end)/2;
            System.out.println(start +" "+middle+" "+ end);
        }

        return middle;

    }
}
