package br.com.estudos.collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class ExecutaNumero {

	public static void main(String[] args) {
		HashSet<Integer> numeros = new HashSet<Integer>();
		
		numeros.add(5);
		numeros.add(8);
		numeros.add(3);
		numeros.add(8);
		numeros.add(28);
		numeros.add(38);
		numeros.add(48);
		
		for(int i = 1; i <=10; i++){
			if(numeros.contains(i)){
				System.out.println(i + " Está no set.");
			}else{
				System.out.println(i + " Não está no set.");
			}
		}

		System.out.println("Numeros do Set: "+numeros);
		
		Iterator<Integer> it = numeros.iterator();
		while(it.hasNext()){
			Integer i = it.next();
			if(i < 10){
				it.remove();
			}
		}
		System.out.println("Numeros menor que 10 removidos : "+numeros);
	}

}
