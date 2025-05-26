package br.dev.giovana.tarefas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

import br.dev.giovana.tarefas.dao.FuncionarioDAO;
import br.dev.giovana.tarefas.model.Funcionario;
import br.dev.giovana.tarefas.ui.FrameFuncionario;
import br.dev.giovana.tarefas.utils.Utils;

public class Main {

	private static String path = "c:\\Users\\25133664\\ProjetoTarefas\\tarefas.txt";

	public static void main(String[] args) {
		
		new FrameFuncionario();
		
		FrameFuncionario tela = new FrameFuncionario();
		
		
		
		
//		Funcionario f = new Funcionario ();
//		f.setNome("paulo");
//		f.setCargo("programador");
//		f.setSalario(1989.73);
//		
//		FuncionarioDAO dao = new FuncionarioDAO(f);
//		dao.gravar();
		
		

//		Funcionario funcionario1 = new Funcionario("Maria da Silva");
//		Funcionario funcionario2 = new Funcionario();
//
//		funcionario2.setMatricula(9);
//		funcionario2.setNome("patricia gomes");
//		funcionario2.setCargo("gerente de ti");
//
//		Funcionario funcionario3 = new Funcionario("Programador", "Ana maria");
//		Funcionario funcionario4 = new Funcionario("Programador", "Pedro", 2);

//		System.out.println(funcionario1);
//		System.out.println(funcionario2);
//		System.out.println(funcionario3);
//		System.out.println(funcionario4);

//	}
//
//	private static void gravarArquivo() {
//
//		FileWriter fw = null;
//		BufferedWriter bw = null;
//
//		try {
//			fw = new FileWriter(path, true);
//			bw = new BufferedWriter(fw);
//
//			String novalinha = "isso é uma nova linha!\n";
//			bw.write(novalinha);
//			bw.flush();
//
//		} catch (Exception erro) {
//			System.out.println(erro.getMessage());
//
//		}
//
//	}
//
//	private static void lerArquivo() {
//
//		FileReader fr = null;
//		BufferedReader br = null;
//
//		try {
//			fr = new FileReader(path);
//			br = new BufferedReader(fr);
//
//			String linha = br.readLine();
//
//			while (linha != null) {
//				String registro[] = linha.split(";");
//				System.out.println("nome:" + registro[0]);
//				System.out.println("nome:" + registro[1]);
//				System.out.println("-------------------");
//
//				linha = br.readLine();
//			}
//
//		} catch (FileNotFoundException erro) {
//			System.out.println(erro.getMessage());
//		} catch (IOException erro) {
//			System.out.println(erro.getMessage());
//		} catch (Exception erro) {
//			System.out.println(erro.getMessage());
//		}
	}

}
