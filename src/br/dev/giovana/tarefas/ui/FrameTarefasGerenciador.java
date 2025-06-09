package br.dev.giovana.tarefas.ui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameTarefasGerenciador {
	
	private JButton btnFuncionarios;
	private JButton btnTarefas;
	
	public FrameTarefasGerenciador () {
		criarTela();
	}
	private void criarTela () {
		JFrame tela = new JFrame();
		tela.setSize(300, 150);
		tela.setResizable(false);
		tela.setLocationRelativeTo(null);
		tela.setLayout(null);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Gerenciador de Tarefas");
		
		Container painel = tela.getContentPane();
	
		btnFuncionarios = new JButton("Funcionários");
		btnFuncionarios.setBounds(20, 40, 110, 40);
		btnTarefas = new JButton("Tarefas");
		btnTarefas.setBounds(150, 40, 110, 40);
		
			
		painel.add(btnFuncionarios);
		painel.add(btnTarefas);
		
		btnFuncionarios.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		} );
		
		btnTarefas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		tela.setVisible(true);
	}
}
