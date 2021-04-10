package br.com.devmedia.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExecutaSet {

	public static void main(String[] args) {
		Set<String> nomes1 = new HashSet<String>();
		nomes1.add("John");
		nomes1.add("Dani");
		nomes1.add("Sansa");
		nomes1.add("Aria");
		
		System.out.println("Saida de dados em um HashSet:\n");
		for(String nome :nomes1){
			System.out.println(nome);
		}
		System.out.println("\nElementos mostrados em ordem aleatória.");
		System.out.println("-----------------------------------------");
		
		Set<String> nomes2 = new LinkedHashSet<String>();
		nomes2.add("John");
		nomes2.add("Dani");
		nomes2.add("Sansa");
		nomes2.add("Aria");
		
		System.out.println("Saida de dados em um LinkedHashSet:\n");
		for(String nome :nomes2){
			System.out.println(nome);
		}
		System.out.println("\nElementos mostrados em ordem de inserção.");
		System.out.println("-------------------------------------------");
		
		Set<String> nomes3 = new TreeSet<String>();
		nomes3.add("John");
		nomes3.add("Dani");
		nomes3.add("Sansa");
		nomes3.add("Aria");
		
		System.out.println("Saida de dados em um TreeSet:\n");
		for(String nome :nomes3){
			System.out.println(nome);
		}
		System.out.println("\nElementos mostrados em ordem alfabetica.");
		System.out.println("------------------------------------------");
	}
}
