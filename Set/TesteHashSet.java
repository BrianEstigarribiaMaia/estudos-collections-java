package br.com.estudos.collections.set;

import java.util.HashSet;

public class TesteHashSet {

	public static void main(String[] args) {
		HashSet<Livro> conjunto = new HashSet<Livro>();
		
		Livro livro1 = new Livro(104, 88, "C Como Programar", "Deitel", "Pearson");
		Livro livro2 = new Livro(106, 95, "Sistemas Operacionais Modernos", "Tanenbaum", "Pearson");
		Livro livro3 = new Livro(105, 57, "Engenharia de Software", "Sommerville", "Pearson");

		conjunto.add(livro1);
		conjunto.add(livro2);
		conjunto.add(livro3);
		
		for(Livro livro: conjunto){
			System.out.println(livro);
		}
	}

}
