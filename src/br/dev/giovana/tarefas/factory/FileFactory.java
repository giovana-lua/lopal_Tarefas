package br.dev.giovana.tarefas.factory;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileFactory {

	private String arquivo = "C:\\Users\\25133664\\ProjetoTarefas\\funcionarios.csv";
	
	private FileWriter fw;
	private BufferedWriter bw;
	private FileReader fr;
	private BufferedReader br;
	
	public FileFactory() throws IOException {
		
		//Necessário para escrever no arquivo
		fw = new FileWriter(arquivo,true);
		bw = new BufferedWriter(fw);
		
		//Necessário para ler o arquivo
		fr = new FileReader(arquivo);
		br = new BufferedReader(fr);
	}
	
	public BufferedWriter getbufferredWriter() {
		return bw;
	}
	public BufferedReader getBufferedReader() {
		return br;
	}
}

