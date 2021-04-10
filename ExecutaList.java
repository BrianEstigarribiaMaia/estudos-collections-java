package br.com.devmedia.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExecutaList {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>();
		nomes.add("Bruna");
		nomes.add("Luiz");
		nomes.add("Eduardo");
		nomes.add("Sonia");
		
		System.out.println("Saida de dados em um ArrayList:\n");
		for(String nome :nomes){
			System.out.println(nome);
		}
		
	
		List<String> nomes2 = new LinkedList<String>();
		nomes2.add("John");
		nomes2.add("Dani");
		nomes2.add("Sansa");
		nomes2.add("Aria");
		
		System.out.println("\nSaida de dados em um LinkedList:\n");
		for(String nome1 :nomes2){
			System.out.println(nome1);
		}
		
		System.out.println("\nElementos aparecem na ordem de inserção em ambos os casos.");
		
	}
}
