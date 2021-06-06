package br.com.estudos.collections.set;

import java.util.LinkedHashSet;

public class TesteLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<Livro> conjunto = new LinkedHashSet<Livro>();
		
		Livro livro1 = new Livro(101, 100, "C Como Programar", "Deitel", "Pearson");
	    Livro livro2 = new Livro(103, 56, "Sistemas Operacionais Modernos", "Tanenbaum", "Pearson");
	    Livro livro3 = new Livro(102, 22, "Engenharia de Software", "Sommerville", "Pearson");
	    
	    conjunto.add(livro1);
	    conjunto.add(livro2);
	    conjunto.add(livro3);
	    
	    for(Livro livro: conjunto){
	    	System.out.println(livro);
	    }
	}

}
