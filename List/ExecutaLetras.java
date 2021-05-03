package br.com.estudos.collections.list;

import java.util.LinkedList;

public class ExecutaLetras {

	public static void main(String[] args) {
		LinkedList<String> letras = new LinkedList<String>();
		
		letras.add("F");
		letras.add("B");
		letras.add("R");
		letras.add("H");
		letras.addFirst("A");
		letras.addLast("Z");
		letras.add("A6");
		letras.add("Z2");
		
		System.out.println("Lista de Letras inicial: "+letras);
		
		letras.remove("A6");
		letras.remove(6);
		
		System.out.println("Lista de Letras após as remoções: "+letras);
		
		letras.removeFirst();
		letras.removeLast();
		
		System.out.println("Lista após remover a primeira e ultima letra: "+letras);

	}

}
