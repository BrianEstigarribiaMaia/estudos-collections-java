package br.com.devmedia.algoritmos;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

public class ExecutaRotate {

	public static void main(String[] args) {
		List<Integer> lista = new LinkedList<Integer>();
		lista.add(10);
		lista.add(5);
		lista.add(-2);
		lista.add(30);
		lista.add(82);
		
		
		System.out.println("Lista na Ordem normal: ");
		System.out.println(lista);
		
		int posicoes = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de posições de deslocamento da lista:"));
		Collections.rotate(lista, posicoes);
		System.out.println("Lista Circular: ");
		System.out.println(lista);
		

	}

}
