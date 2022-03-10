package main;

import java.util.ArrayList;

import graph.*;

public class Main {

	public static void main(String[] args) {
		Grafo g = new Grafo();
		
		Nodo a = new Nodo(g, "A");
		Nodo b = new Nodo(g, "B");
		Nodo c = new Nodo(g, "C");
		Nodo d = new Nodo(g, "D");
				
		g.addArco(a, c);
		g.addArco(a, c);
		
		g.addArco(b, c);
		g.addArco(b, c);
		
		g.addArco(d, a);
		g.addArco(d, b);
		g.addArco(d, c);
		
		// Problema dei ponti di Königsberg
		
		ArrayList<Nodo> out = g.getCircuitoEuleriano();
		
		if(out == null) {
			System.out.println("Non esiste un Cammino Euleriano");
			return;
		}
		
		for(Nodo n: out) {
			System.out.println(n.getNome());
		}
	}

}
