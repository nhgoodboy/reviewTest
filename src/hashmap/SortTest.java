package hashmap;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortTest {
	
	public static <K, V extends Comparable<? super V>> List<Map.Entry<K, V>> sortByValue(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
            @Override
            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

//        Map<K, V> result = new LinkedHashMap<>();
//        for (Map.Entry<K, V> entry : list) {
//            result.put(entry.getKey(), entry.getValue());
//        }
        return list;
    }
	
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 100);
		map.put(2, 88);
		map.put(3, 105);
		map.put(4, 2);
		map.put(5, 45);
		map.put(6, 116);
		map.put(7, 23);
		map.put(8, 96);
		map.put(9, 44);
		map.put(10, 3);
		
//		LinkedHashMap<Integer, Integer> linkMap = (LinkedHashMap<Integer, Integer>) sortByValue(map);
		
		System.out.println(sortByValue(map));
		
		int a = 2;
		System.out.println(++a > 2);
	}
}
