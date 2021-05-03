package br.com.estudos.collections.list;
import java.util.ArrayList;

public class TestaPessoa {

	public static void main(String[] args) {
		ArrayList<Pessoa> lista = new ArrayList<Pessoa>();	
		
		Pessoa brian = new Pessoa();
		Pessoa kevin = new Pessoa();
		
		brian.setNome("Brian Estigarribia");
		brian.setIdade(25);
		
		kevin.setNome("Kevin Blank");
		kevin.setIdade(25);
		
		lista.add(brian);
		lista.add(kevin);
		
		for(int i = 0; i < lista.size(); i++){
			System.out.println("Nome: " + lista.get(i).getNome());
			System.out.println("Idade: " + lista.get(i).getIdade());
		}
		
		
}}
