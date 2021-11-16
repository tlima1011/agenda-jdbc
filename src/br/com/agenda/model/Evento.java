package br.com.agenda.model;

import java.util.Date;

public class Evento {
	
	private int id; 
	private String titulo; 
	private String descricao; 
	private Date data_evento; 
	private Date data_criacao; 
	
	public Evento() { 
		
	}

	public Evento(String titulo, String descricao, Date data_evento, Date data_criacao) {
		this.id = id; 
		this.titulo = titulo;
		this.descricao = descricao;
		this.data_evento = data_evento;
		this.data_criacao = data_criacao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getData_evento() {
		return data_evento;
	}

	public void setData_evento(Date data_evento) {
		this.data_evento = data_evento;
	}

	public Date getData_criacao() {
		return data_criacao;
	}

	public void setData_criacao(Date data_criacao) {
		this.data_criacao = data_criacao;
	}
		
}
