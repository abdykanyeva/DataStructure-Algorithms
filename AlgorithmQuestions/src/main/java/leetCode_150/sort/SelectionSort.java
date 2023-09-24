package leetCode_150.sort;

public class SelectionSort {

    public static void main(String[] args) {

    }

    public static void selectionSort(int []a){
        for (int i = 0; i < a.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if(a[j] < a[i]){
                    minIndex=j;
                }
                if(minIndex!=i){
                    int temp = a[i];
                    a[j] = a[minIndex];
                    a[minIndex] = temp;


                }
            }

        }

    }
}
