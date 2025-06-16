package br.dev.giovana.tarefas.factory;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileFactory {

	private String arquivofuncionario = "C:\\Users\\25133664\\ProjetoTarefas\\funcionarios.csv";
	private String arquivotarefas = "C:\\Users\\25133664\\ProjetoTarefas\\tarefas.csv";
	
	private FileWriter fwf;
	private BufferedWriter bwf;
	private FileReader frf;
	private BufferedReader brf;
	private FileWriter fwt;
	private BufferedWriter bwt;
	private FileReader frt;
	private BufferedReader brt;
	
	public FileFactory() throws IOException {
		
		//Necessário para escrever no arquivo (funcionário)
		fwf = new FileWriter(arquivofuncionario,true);
		bwf = new BufferedWriter(fwf);
		
		//Necessário para ler o arquivo (funcionário)
		frf = new FileReader(arquivofuncionario);
		brf = new BufferedReader(frf);
		
		
		// tarefas 
		fwt = new FileWriter(arquivotarefas,true );
		bwt = new BufferedWriter(fwt);
		
		frt = new FileReader(arquivotarefas);
		brt = new BufferedReader(frt);
		
		
		
	}
	
	public BufferedWriter getbufferredWritertarefas() {
		return bwt;
	}
	public BufferedReader getBufferedReadertarefas() {
		return brt;
	}
	
	public BufferedWriter getbufferredWriter() {
		return bwf;
	}
	public BufferedReader getBufferedReader() {
		return brf;
	}
	
}

