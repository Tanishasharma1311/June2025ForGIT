package Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapBasics {

	public static void main(String[] args) {
		HashMapBasics mapBasics = new HashMapBasics();
		mapBasics.performOperations();
	}
	
	public void performOperations() {
		int key = 20;
		String value = "Banana";
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Applee");
		map.put(key, value);
		map.put(14, "Coconut");
		map.put(37, "Lychee");
		
		System.out.println(map);
		
		map.put(37, "Mango");
		System.out.println(map);
		
		map.putIfAbsent(37, "Grapes");
		System.out.println(map);
		
		map.putIfAbsent(58, "Lychee");
		System.out.println(map);
		
		//get the value of a key
		String value1 = map.get(37);
		System.out.println("Value1 ::"+value1);
		
		String value2 = map.get(38);
		System.out.println("Value2 ::"+value2);
		
		//check if a key is present in map
		boolean containsKey = map.containsKey(37);
		System.out.println("containsKey::"+containsKey);
		
		boolean containsKey1 = map.containsKey(91);
		System.out.println("containsKey1::"+containsKey1);
		
		boolean containsValue = map.containsValue("Lychee");
		System.out.println("containsValue::"+containsValue);
		
		boolean containsValue1 = map.containsValue("Grapes");
		System.out.println("containsValue1::"+containsValue1);
		
		//check if a map is empty
		boolean isEmpty = map.isEmpty();
		System.out.println("isEmpty::"+isEmpty);
		
		//size
		int size = map.size();
		System.out.println("size::"+size);
		
		//keySet: Get the set of all keys in map
		Set<Integer> keySet = map.keySet();
		System.out.println("keySet::"+keySet);
		
		//values
		Collection<String> values = map.values();
		System.out.println("values::"+values);
		
		//removing data
		String removedValue = map.remove(37);
		System.out.println("removedValue::"+removedValue);
		
		System.out.println(map);
		
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(27, "tomato");
		map1.put(99, "kiwi");
		map1.put(14, "Peach");
		
		map.putAll(map1);
		System.out.println(map);
		
		//iterating through map using entrySet
		System.out.println("\niterating through map using entrySet");
		for(Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Key is ::"+entry.getKey() + " And value is ::"+entry.getValue());
		}
		
		//iterating through map using KeySet
		System.out.println("\niterating through map using KeySet");
		for(Integer mapKey : map.keySet()) {
			System.out.println("Key is ::"+mapKey + " And value is ::"+map.get(mapKey));
		}
		
		//iterating through map using Iterators
		System.out.println("\niterating through map using Iterator");
		Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<Integer, String> nextValue = itr.next();
			System.out.println("Key is ::"+nextValue.getKey() + " And value is ::"+nextValue.getValue());
		}
		
		//adding null
		System.out.println("\nPut null in map");
		map.put(null, "Orange");
		System.out.println(map);
		
		map.put(null, "watermelon");
		System.out.println(map);
		
		map.put(45, null);
		System.out.println(map);
		
		map.put(46, null);
		System.out.println(map);
		
		System.out.println(map.values());
		
		map.clear();
		System.out.println(map);
		
		System.out.println(map.isEmpty());
	}

}
