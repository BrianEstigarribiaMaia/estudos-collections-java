package br.com.estudos.collections.list;

import java.util.LinkedList;

public class ExecutaLoja {

	public static void main(String[] args) {
		LinkedList<String> lojas =  new LinkedList<>();
		
		lojas.add("Americanas");
		lojas.add("Submarino");
		lojas.add("Saraiva");
		lojas.add("Netshoes");
		
		System.out.println(lojas);
		lojas.addFirst("Magalu");
		lojas.addLast("Centauro");
		System.out.println("Adicionadas mais duas lojas no inicio e no fim da lista \n"+lojas);
		System.out.println("Mostrar primeiro e ultima loja adicionada");
		System.out.println(lojas.getFirst());
		System.out.println(lojas.getLast());
		System.out.println("Remover e ultima loja: " +lojas.removeLast()+ " Removido!\n");
		System.out.println(lojas);
		

	}

}
