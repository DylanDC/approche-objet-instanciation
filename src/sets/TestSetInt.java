package sets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestSetInt {

	public static void main(String[] args) {
		
		
		Set<Integer> list = new HashSet<Integer>();
		list.add(-1);
		list.add(5);
		list.add(7);
		list.add(3);
		list.add(-2);
		list.add(4);
		list.add(8);
		list.add(5);
		
		Iterator<Integer> a = list.iterator();
		
		while(a.hasNext()) {
			System.out.println(a.next());
		}
			//*******plus grand --- plus petit*******
		List<Integer> listSet = new ArrayList<Integer>();
		listSet.addAll(list);
		Collections.sort(listSet);
		System.out.println("Plus petit = " + listSet.get(0));
		System.out.println("Plus grand = " + listSet.get(listSet.size()-1));
		
		//******négatif en positif*******
		for (int i=0; i<listSet.size(); i++){
			if (listSet.get(i) < 0){
				listSet.set(i, listSet.get(i) * (-1));
			}
		}
		System.out.println(listSet);
		

	}

}
