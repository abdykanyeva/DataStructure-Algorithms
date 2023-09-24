package leetCode_150;

import java.util.*;

public class TopKFrequentWords_692 {

    public static void main(String[] args) {

        String[] words = {"the","day","is","sunny","the","the","the","sunny","is","is"};

        System.out.println(topKFrequent(words, 4));
    }

    public static List<String> topKFrequent(String[] words, int k) {

        HashMap<String, Integer> map = new HashMap<>();

        for (String each : words) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }

        ArrayList<String> list = new ArrayList<>(map.keySet());

        Collections.sort(list, (w1, w2) -> map.get(w1).equals(w2) ? w1.compareTo(w2) :
                map.get(w2) - map.get(w1));


        return list.subList(0, k);
    }
}

