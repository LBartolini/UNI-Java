package graph;

import java.util.ArrayList;

public class Grafo {
	
	private ArrayList<Nodo> nodi;
	private ArrayList<Arco> archi;
	
	public Grafo() {
		nodi = new ArrayList<Nodo>();
		archi = new ArrayList<Arco>();
	}
	
	public boolean checkVisitaCompleta() {
		for(Arco a: archi) {
			if(!a.getVisitato()) {
				return false;
			}
		}
		
		return true;
	}
	
	public ArrayList<Nodo> getCicloEuleriano(){
		ArrayList<Nodo> out = new ArrayList<Nodo>();
		ArrayList<Nodo> temp;
		
		for(Nodo start: nodi) {
			temp = getCicloEuleriano(start, start);
			
			if(temp != null) {
				//out.add(start);
				out.addAll(temp);
				
				return out;
			}
		}
		
		return null;
	}
	
	public ArrayList<Nodo> getCicloEuleriano(Nodo now, Nodo start){
		ArrayList<Nodo> out = new ArrayList<Nodo>();
		ArrayList<Nodo> temp;
		out.add(now);
		//ArrayList<Arco> archi_percorsi = new ArrayList<Arco>();
		
		for(Arco a: now.getArchi()) {
			if(!a.getVisitato()) {
				a.setVisitato(true);
				Nodo next = a.getDest(now);
				
				if(next == start) {
					if(checkVisitaCompleta()) {
						return out;
					}else {
						a.setVisitato(false);
						
						return null;
					}
				}
				
				temp = getCicloEuleriano(next, start);
				
				if(temp != null) {
					out.addAll(temp);
					
					return out;
				}else {
					a.setVisitato(false);
				}
			}
		}
		
		return null;
	}
	
	public void addNodo(Nodo n) {
		nodi.add(n);
	}
	
	public void addArco(Nodo n1, Nodo n2) {
		Arco a = new Arco(n1, n2);
		archi.add(a);
		
		n1.addArco(a);
		n2.addArco(a);
	}
	
	public Nodo getNodo(int id) {
		for(Nodo n: nodi) {
			if(n.getId() == id) {
				return n;
			}
		}
		
		return null;
	}

}