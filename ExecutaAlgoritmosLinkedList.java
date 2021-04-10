package br.com.devmedia.algoritmos;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Comparator;

public class ExecutaAlgoritmosLinkedList {

	public static void main(String[] args) {
		List<Integer> lista = new LinkedList<Integer>();
		lista.add(10);
		lista.add(5);
		lista.add(-2);
		lista.add(30);
		lista.add(82);
		
		System.out.println("Lista em ordem crescente: ");
		Collections.sort(lista);
		for(Integer numero: lista){
			System.out.println(numero);
		}
		
		System.out.println("----------------------------");
		
		System.out.println("Lista em ordem decrescente: ");
		Comparator<Integer> reverso = Collections.reverseOrder();
		Collections.sort(lista, reverso);
		for(Integer numero: lista){
			System.out.println(numero);
		}
		
		System.out.println("----------------------------");
		
		System.out.println("O valor minimo da lista é: "+Collections.min(lista));
		System.out.println("O valor máximo da lista é: "+Collections.max(lista));
		
	}
}
