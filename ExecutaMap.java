package br.com.devmedia.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExecutaMap {
	
	public static void main(String[] args) {
		//HASHMAP
		Map<Integer, String> nomes1 = new HashMap<Integer, String>();
		nomes1.put(4, "John");
		nomes1.put(1, "Dani");
		nomes1.put(2, "Sansa");
		nomes1.put(3, "Aria");
		
		System.out.println("Saida de dados em um HashMap:\n");
		for(String nome :nomes1.values()){
			System.out.println(nome);
		}
		System.out.println("\nElementos mostrados em ordem aleatória.");
		System.out.println("-----------------------------------------");
		
		//TREEMAP
		Map<Integer, String> nomes2 = new TreeMap<Integer, String>();
		nomes2.put(4, "John");
		nomes2.put(1, "Dani");
		nomes2.put(2, "Sansa");
		nomes2.put(3, "Aria");
		
		System.out.println("Saida de dados em um TreeMap:\n");
		for(String nome :nomes2.values()){
			System.out.println(nome);
		}
		System.out.println("\nElementos mostrados pela ordem das chaves.");
		System.out.println("--------------------------------------------");
		
		//LINKEDHASHMAP
		Map<Integer, String> nomes3 = new LinkedHashMap<Integer, String>();
		nomes3.put(4, "John");
		nomes3.put(1, "Dani");
		nomes3.put(2, "Sansa");
		nomes3.put(3, "Aria");
		
		System.out.println("Saida de dados em um LinkedHashMap:\n");
		for(String nome :nomes3.values()){
			System.out.println(nome);
		}
		System.out.println("\nElementos mostrados pela ordem de inserção.");
		System.out.println("---------------------------------------------");
		
	}
}
