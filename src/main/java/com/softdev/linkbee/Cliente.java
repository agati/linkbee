package com.softdev.linkbee;


public class Cliente {
	
	private String nome;
	private int id;
	private String email;
	private String telefone;
	private boolean ativo;

	public Cliente(String nome, int id, String email, String telefone, boolean ativo) {
		super();
		
		this.nome = nome;
		this.id = id;
		this.email = email;
		this.telefone = telefone;
		this.ativo = ativo;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	
}
