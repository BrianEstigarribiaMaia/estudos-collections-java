package br.com.estudos.collections.set;

public class Livro {

	private int id, quantidade;
	private String nome, autor, editora;
	
	public Livro(int id, int quantidade, String nome, String autor, String editora) {
		this.id = id;
		this.quantidade = quantidade;
		this.nome = nome;
		this.autor = autor;
		this.editora = editora;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	@Override
	public String toString() {
		return "Livro [id:" + id + ", quantidade:" + quantidade + ", nome:" + nome + 
				", autor:" + autor + ", editora:"+ editora + "]";
	}	
	
	
}
