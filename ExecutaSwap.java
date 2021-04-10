package br.com.devmedia.algoritmos;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

public class ExecutaSwap {

	public static void main(String[] args) {
		List<Integer> lista = new LinkedList<Integer>();
		lista.add(10);
		lista.add(5);
		lista.add(-2);
		lista.add(30);
		lista.add(82);

		System.out.println("Lista de Elementos: ");
		System.out.println(lista);
		
		int posicao1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira poisição: "));
		int posicao2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda poisição: "));
		
		System.out.println("---------------------------------------------");
		System.out.println("Lista de elementos dps da troca de posições: ");
		Collections.swap(lista, posicao1, posicao2);
		for(Integer numero: lista){
			System.out.println(numero);
		}
	}

}
