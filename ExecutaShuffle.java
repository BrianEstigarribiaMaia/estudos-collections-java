package br.com.devmedia.algoritmos;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class ExecutaShuffle {

	public static void main(String[] args) {
		List<Integer> lista = new LinkedList<Integer>();
		lista.add(10);
		lista.add(5);
		lista.add(-2);
		lista.add(30);
		lista.add(82);
		
		
		System.out.println("Lista na Ordem normal: ");
		System.out.println(lista);
		System.out.println("-----------------------------------------------------");
		Collections.shuffle(lista);
		System.out.println("Lista Após o uso do Shuffle, que embaralha os itens: ");
		System.out.println(lista);
		

	}

}
