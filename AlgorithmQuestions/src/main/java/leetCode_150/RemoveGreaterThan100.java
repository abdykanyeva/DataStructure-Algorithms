package leetCode_150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveGreaterThan100 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,3,4,5,101,112));

        System.out.println(removeList(list));
    }


    public static List<Integer> removeList(List<Integer>list){

        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){
            if(it.next()>100){
                it.remove();
            }
        }
        return list;
    }
}
