package br.dev.giovana.tarefas.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.dev.giovana.tarefas.factory.FileFactory;
import br.dev.giovana.tarefas.model.Tarefas;

public class TarefasDAO {

	private Tarefas tarefas;
	
	public TarefasDAO() {		
	}
	
	public TarefasDAO (Tarefas tarefas) {
		this.tarefas = tarefas;
	}
	
	public void gravar() {
		try {
			FileFactory ff = new FileFactory();
			ff.getbufferredWritertarefas().write(tarefas.toString());
			ff.getbufferredWritertarefas().flush();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public List<Tarefas> listar(){
		
		List<Tarefas> tarefas = new ArrayList<Tarefas>();
		return tarefas;
		
		
	}
}
