package in.cdac.mapsjava;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMainEx1 {

	public static void main(String [] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "value1");
		map.put(2, "value2");
		map.put(3, "value2");
		map.put(4, "value6");
		map.put(5, "value3");
		
		System.out.println(map);
		
		Set<Integer> keys = map.keySet();
		System.out.println("Keys of Map : " + keys);
		
		Collection<String> alue = map.values();
		System.out.println("Value of Map : " + alue);
	}
}