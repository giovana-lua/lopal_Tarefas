package br.dev.giovana.tarefas.model;

import java.time.LocalDate;

public class Tarefas {
   
	private String titulo;
	private String descricao;
	private LocalDate datainicio;
	private int prazo;
	private LocalDate dataconclusao;
	private Status status;
	private Funcionario responsavel;
	
	
	
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
	public LocalDate getDatainicio() {
		return datainicio;
	}
	public void setDatainicio(LocalDate datainicio) {
		this.datainicio = datainicio;
	}
	public int getPrazo() {
		return prazo;
	}
	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}
	public LocalDate getDataclonclusao() {
		return dataconclusao;
	}
	public void setDataclonclusao(LocalDate dataconclusao) {
		this.dataconclusao = dataconclusao;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Funcionario getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Funcionario responsavel) {
		this.responsavel = responsavel;
	}
	
	
}
