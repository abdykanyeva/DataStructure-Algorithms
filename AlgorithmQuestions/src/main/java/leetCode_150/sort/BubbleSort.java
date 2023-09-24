package leetCode_150.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[]array = {9,8,3,1,7,4,5,6};
        bubbleSort(array);
        bs.printArray(array);


    }


    public static void bubbleSort(int[]arr){
        //array = {9,8,3,1,7,4,5,6}
        int n = arr.length;


        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - 1 -i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }

            }
        }
        System.out.println(arr);

    }

    void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"");
        }
        System.out.println();
    }
}
