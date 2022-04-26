package esercitazione;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;

import persona.*;

public class CollectionsMain {

	public static void main(String[] args) throws Exception {
		
		// ArrayList
		List<Operaio> array_list = new ArrayList<Operaio>();
		
		Operaio fortunato = new Operaio("Man", "Spider", 19, 20, 25); 
		
		array_list.add(new Operaio("Bartolini", "Lorenzo", 19, 20, 25));
		array_list.add(new Operaio("Pippo", "Pluto", 19, 20, 25));
		array_list.add(new Operaio("Majid", "Alessio", 19, 20, 25));
		array_list.add(new Operaio("D'Arrigo", "Cristian", 19, 20, 25));
		array_list.add(fortunato);
		
		for(Operaio op: array_list) {
			System.out.println(op);
		}
		
		array_list.add(0, new Operaio("Man", "Iron", 25, 100, 1000));
		
		Operaio secondoOperaio = array_list.get(1);
		secondoOperaio.inserisciGiornataLavorativa(9);
		
		array_list.remove(2);
		array_list.set(1, new Operaio("America", "Captain", 10000, 20, 30));
		
		boolean trovato = false;
		for(Operaio op: array_list) {
			if(op.equals(fortunato)) {
				System.out.println("Evviva trovato!");
				trovato = true;
				break;
			}
		}
		
		if(!trovato) System.out.println("Caspiterina non c'era!");
		
		System.out.println("\n\n\n\n");
		// LinkedList
		List<Operaio> linked_list = new LinkedList<Operaio>();
		
		fortunato = new Operaio("Man", "Spider", 19, 20, 25); 
		
		linked_list.add(new Operaio("Bartolini", "Lorenzo", 19, 20, 25));
		linked_list.add(new Operaio("Pippo", "Pluto", 19, 20, 25));
		linked_list.add(new Operaio("Majid", "Alessio", 19, 20, 25));
		linked_list.add(new Operaio("D'Arrigo", "Cristian", 19, 20, 25));
		linked_list.add(fortunato);
		
		for(Operaio op: linked_list) {
			System.out.println(op);
		}
		
		for(Operaio op: linked_list.subList(1, linked_list.size())) {
			System.out.println(op);
		}
		
		ListIterator<Operaio> iterator = linked_list.listIterator(linked_list.size());
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
		
		linked_list.add(new Operaio("Peter", "Parker", 15, 10, 20));
		linked_list.add(0, new Operaio("Pippo", "Pippo", 15, 10, 20));
		
		for(Operaio op: linked_list) {
			System.out.println(op);
		}
				
		// HashMap
		Map<Integer, List<Operaio>> hash_map = new HashMap<Integer, List<Operaio>>();
		
		hash_map.put(0, new ArrayList<Operaio>());
		hash_map.put(1, new ArrayList<Operaio>());
		hash_map.put(2, new ArrayList<Operaio>());
		
		hash_map.get(0).add(new Operaio("Majid", "Alessio", 19, 20, 25));
		hash_map.get(0).add(new Operaio("Lorenzo", "Bartolini", 19, 20, 25));
		hash_map.get(1).add(new Operaio("D'Arrigo", "Cristian", 19, 20, 25));
		hash_map.get(1).add(new Operaio("America", "Captain", 10000, 20, 30));
		hash_map.get(2).add(new Operaio("Man", "Spider", 19, 20, 25));
		hash_map.get(2).add(new Operaio("Fallaci", "Giovanni", 19, 20, 25));
		hash_map.get(2).add(new Operaio("Immobile", "Alessio", 19, 20, 25));
		
		ListIterator<Operaio> it = hash_map.get(2).listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
