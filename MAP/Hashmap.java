package MAP;


	import java.util.HashMap;

	public class Hashmap {
		public static void main (String args[]) {
			HashMap map =new HashMap();
			map.put(123, "dileep lockers");
			map.put(321, "sandeep lockers");
			map.put(421, "mahesh lockers");
			map.put(564, "rakesh lockers");
			System.out.println(map.get(321));
			System.out.println(map.get(564));
			System.out.println(map.keySet());
			System.out.println(map.values());
			System.out.println(map.hashCode());
			System.out.println(map.size());
			
			
		}

	}

	


