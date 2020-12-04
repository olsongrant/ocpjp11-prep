package concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var list1 = new ArrayList<>(List.of(1,2,3));
		var list2 = new CopyOnWriteArrayList<Integer>(list1);
		var map3 = new ConcurrentHashMap<Integer,Integer>();
		map3.put(1, 2);
		map3.put(3, 3);

//		for(var item : list1) list1.add(10);            // f1
		for(var item : list2) list2.add(item);          // f2
		for(var key : map3.keySet()) map3.remove(key);  // f3
		System.out.println(list1.size() + " " + list2.size()
		   + " " + map3.size());
	}

}
