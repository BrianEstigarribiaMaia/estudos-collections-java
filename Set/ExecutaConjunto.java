package br.com.estudos.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class ExecutaConjunto {

	public static void main(String[] args) {
		int vetorNumeros [] = {34, 22, 15, 66, 22};
		
		HashSet<Integer> conjunto = new HashSet<Integer>();
		
		try{
			for(int i = 0; i < 5; i++){
				conjunto.add(vetorNumeros[i]);
			}
			System.out.println("Set Aleatório: "+conjunto);
		}catch(Exception e){
			
		}
		
		TreeSet<Integer> conjuntoOrdenado = new TreeSet<Integer>(conjunto);
		System.out.println("Set Ordenado: "+conjuntoOrdenado);
		System.out.println("Primeiro: "+conjuntoOrdenado.first());
		System.out.println("Ultimo: "+conjuntoOrdenado.last());
		
		LinkedHashSet<Integer> conjuntoOrdemInsercao = new LinkedHashSet<Integer>();
		conjuntoOrdemInsercao.add(14);
		conjuntoOrdemInsercao.add(10);
		conjuntoOrdemInsercao.add(3);
		conjuntoOrdemInsercao.add(22);
		System.out.println("Set em ordem de inserção: "+conjuntoOrdemInsercao);
		
	}
	
}

