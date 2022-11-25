package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMedian {

    public static void main(String[] args) {

        System.out.println(findMedian(new ArrayList<>(Arrays.asList(5, 3, 1, 2, 4))));

    }

    public static int findMedian(List<Integer> arr) {
        // Write your code here

        Collections.sort(arr);

        double middle = arr.size()/2;
        if (arr.size()%2 == 0) {
            middle = (arr.get(arr.size()/2) + arr.get(arr.size()/2 - 1))/2;
        } else {
            middle = arr.get(arr.size() / 2);
        }
        return (int) middle;


    }

}
