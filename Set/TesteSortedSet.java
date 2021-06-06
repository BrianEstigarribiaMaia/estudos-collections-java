package br.com.estudos.collections.set;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TesteSortedSet {

	public static void main(String[] args) {
		Set<String> conjunto = new TreeSet<String>();
		
		conjunto.add("b");
		conjunto.add("d");
		conjunto.add("c");
		conjunto.add("a");
		
		Iterator<String> iterador = conjunto.iterator();
		while(iterador.hasNext()){
			Object elemento = iterador.next();
			System.out.println(elemento.toString());
		}
		
	}
}
