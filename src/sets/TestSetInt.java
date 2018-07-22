package sets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestSetInt {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(-1);
		set.add(5);
		set.add(7);
		set.add(3);
		set.add(-2);
		set.add(4);
		set.add(8);
		set.add(5);
		
		Iterator a = set.iterator();
		
		while(a.hasNext()) {
			System.out.println(a.next());
		}
			
		List<Integer> listSet = new ArrayList<Integer>();
		listSet.addAll(set);
		Collections.sort(listSet);
		System.out.println("Plus petit = " + listSet.get(0));
		System.out.println("Plus grand = " + listSet.get(listSet.size()-1));

	}

}
