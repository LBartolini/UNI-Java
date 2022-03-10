package graph;

import java.util.ArrayList;

public class Grafo {
	
	private ArrayList<Nodo> nodi;
	private ArrayList<Arco> archi;
	private int nArchiVisitati = 0;
	
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
	
	public ArrayList<Nodo> getCircuitoEuleriano(){
		ArrayList<Nodo> out = new ArrayList<Nodo>();
		ArrayList<Nodo> temp;
		
		for(Nodo start: nodi) {
			temp = getCircuitoEuleriano(start, start);
			
			if(temp != null) {
				out.addAll(temp);
				
				return out;
			}
		}
		
		return null;
	}
	
	private ArrayList<Nodo> getCircuitoEuleriano(Nodo now, Nodo start){
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
				
				temp = getCircuitoEuleriano(next, start);
				
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
	
	public ArrayList<Nodo> getCamminoEuleriano(){
		ArrayList<Nodo> out = new ArrayList<Nodo>();
		ArrayList<Nodo> temp;
		nArchiVisitati = 0;
		
		for(Nodo start: nodi) {
			temp = getCamminoEuleriano(start);
			
			if(temp != null) {
				out.addAll(temp);
				
				return out;
			}
		}
		
		return null;
	} 
	
	private ArrayList<Nodo> getCamminoEuleriano(Nodo now){
		ArrayList<Nodo> out = new ArrayList<Nodo>();
		ArrayList<Nodo> temp;
		out.add(now);
		//ArrayList<Arco> archi_percorsi = new ArrayList<Arco>();
		
		for(Arco a: now.getArchi()) {
			if(!a.getVisitato()) {
				a.setVisitato(true);
				nArchiVisitati++;
				Nodo next = a.getDest(now);
				
				if(nArchiVisitati == archi.size()) {
					if(checkVisitaCompleta()) {
						return out;
					}else {
						a.setVisitato(false);
						nArchiVisitati--;
						return null;
					}
				}
				
				temp = getCamminoEuleriano(next);
				
				if(temp != null) {
					out.addAll(temp);
					
					return out;
				}else {
					a.setVisitato(false);
					nArchiVisitati--;
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
