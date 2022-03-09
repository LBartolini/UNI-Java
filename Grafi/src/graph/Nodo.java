package graph;

import java.util.ArrayList;

public class Nodo {
	private static int id_progr=0;
	private int id;
	private String nome;
	
	public String getNome() {
		return nome;
	}

	private ArrayList<Arco> archi;
	
	public Nodo() {
		archi = new ArrayList<Arco>();
		nome = "";
		id=(id_progr++);
	}
	
	public Nodo(Grafo g, String nome) {
		archi = new ArrayList<Arco>();
		id=(id_progr++);
		this.nome = nome;
		
		g.addNodo(this);
	}
	
	public int getId() {
		return id;
	}
	
	public ArrayList<Arco> getArchi() {
		return archi;
	}
	
	public void addArco(Arco a) {
		archi.add(a);
	}
}
