package sets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestSetString {
//initialisation Hashset
	public static void main(String[] args) {
		Set<String> list = new HashSet<>();
		list.add("USA");
		list.add("France");
		list.add("Allemagne");
		list.add("UK");
		list.add("Italie");
		list.add("Japon");
		list.add("Chine");
		list.add("Russie");
		list.add("Inde");
//-------------------------------------------------------
		//Iterator pour parcourir la liste
		Iterator<String> a = list.iterator();
		while(a.hasNext()) {
			System.out.println(a.next());
		}
//--------------------------------------------------------
		//mise de la liste Hashset dans une ArrayList
		List<String> listSet = new ArrayList<>();
		listSet.addAll(list);
		
//--------------------------------------------------------		
		// *********Plus de caractère*********
		int b = listSet.get(0).length();
		String plusLong = null;

		for (int i=0; i<list.size(); i++){
			if(b < listSet.get(i).length()){
				b= listSet.get(i).length();
				plusLong = listSet.get(i);
			}
		}
//---------------------------------------------------------		
		//mise en majuscule de tous les nom de Ville
		for (int i=0; i<listSet.size(); i++){
			listSet.set(i, listSet.get(i).toUpperCase());
		}
		
		
		//resultat
		System.out.println("\nla ville avec le plus de caractère est " +plusLong+"\n");
		System.out.println("Mise en majuscule des nom de ville :");
		System.out.println(listSet);
		
		
		
		
	}

}
