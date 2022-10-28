package MAP;

import java.util.TreeMap;

public class Treemap {
	public static void main (String args[]) {
	TreeMap map=new TreeMap();
	map.put(123, "dileep lockers");
	map.put(321, "sandeep lockers");
	map.put(421, "mahesh lockers");
	map.put(453, "rakesh lockers");
	System.out.println(map.pollFirstEntry());
	System.out.println(map.get(321));
	System.out.println(map.pollLastEntry());
}
}