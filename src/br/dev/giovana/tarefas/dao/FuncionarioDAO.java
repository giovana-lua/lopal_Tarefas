package br.dev.giovana.tarefas.dao;

import java.io.IOException;

import br.dev.giovana.tarefas.factory.FileFactory;
import br.dev.giovana.tarefas.model.Funcionario;

public class FuncionarioDAO {

	private Funcionario funcionario;
	
	public FuncionarioDAO() {}
	
	public FuncionarioDAO(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public void gravar() {
		try {
			FileFactory ff = new FileFactory();
			ff.getbufferredWriter().write(funcionario.toString());
			ff.getbufferredWriter().flush();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
}
