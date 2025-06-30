package Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class printItems {

	public static void main(String[] args) {
		Map<String, Double> map = new HashMap<String, Double>();
		map.put("Lays", 50d);
		map.put("Soda", 200d);
		map.put("Sugar", 190.5);
		map.put("Salt", 205.3);
		map.put("Flour", 586.4);
		map.put("Pulses", 379.3);
		map.put("Tooth Paste", 129.4);
		map.put("Tooth brush", 100d);
		map.put("Detergent", 400d);
		printItems pi = new printItems();
		pi.findCondition(map);
		
		
	}
	
	public void findCondition(Map<String, Double> map) {
		for(Entry<String, Double> entry : map.entrySet()) {
			if(map.get(entry.getKey())<250){
				System.out.println(entry.getKey() + " is cheap");
				
				
			}
			else {
				System.out.println(entry.getKey() + " is expensive");
			}
			
			
			
		}
		
		
	}

}
