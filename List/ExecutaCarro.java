package br.com.estudos.collections.list;

import java.util.ArrayList;
import java.util.Collections;

public class ExecutaCarro {

	public static void main(String[] args) {
		ArrayList<String> carros =  new  ArrayList<String>();
		
		carros.add("BMW");
		carros.add("Ford");
		carros.add("Fiat");
		
		System.out.println("Primeiros elementos "+carros);
		System.out.println("Pegrar elemento no indice 1 "+carros.get(1));
		carros.set(2, "Opel");
		System.out.println("Nova lista depois de adicionar Opel no lugar de Fiat "+carros);
		System.out.println("Tamanho da lista "+carros.size());

		Collections.sort(carros);
		System.out.println("Lista ordenada em ordem alfabétca: ");
		for(String indice: carros){
			System.out.println(indice);
		}
	}

}
