package br.com.cod3r.exerciciossb.model.entities;

public class Cliente {

	private int id;
	private String nome;
	private String CPF;
	
	public Cliente(int id, String nome, String cPF) {
		super();
		this.id = id;
		this.nome = nome;
		CPF = cPF;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
}
