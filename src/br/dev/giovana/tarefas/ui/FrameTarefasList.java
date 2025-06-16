package br.dev.giovana.tarefas.ui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import br.dev.giovana.tarefas.dao.FuncionarioDAO;
import br.dev.giovana.tarefas.dao.TarefasDAO;
import br.dev.giovana.tarefas.model.Funcionario;
import br.dev.giovana.tarefas.model.Tarefas;

public class FrameTarefasList {
	
	
	private JButton btnNovatarefa;
	private JButton btnSair;
	private JTable tabelaTarefas;
	private JScrollPane scrollTarefas;
	private DefaultTableModel modelTarefas;
	private String[] colunas = {"Código", "Nome","Responsável"};

	public FrameTarefasList(JFrame FrameTarefasGerenciador ) {
		criarTela(FrameTarefasGerenciador);
	}
	
	private void criarTela(JFrame FrameTarefasGerenciador) {
		JDialog tela = new JDialog(FrameTarefasGerenciador, true);
		tela.setSize(500, 500);
		tela.setResizable(false);
		tela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		tela.setLayout(null);
		tela.setLocationRelativeTo(FrameTarefasGerenciador);
		tela.setTitle("Lista de Tarefas");
		
		Container painel = tela.getContentPane();
		
		modelTarefas = new DefaultTableModel (colunas, 5){
			@Override
			public boolean isCellEditable(int row, int column) {
				
				return false;
			}
		};
		
		tabelaTarefas = new JTable(modelTarefas);
		tabelaTarefas.getTableHeader().setReorderingAllowed(false);
		scrollTarefas = new JScrollPane(tabelaTarefas);
		scrollTarefas.setBounds(10, 60, 460, 300);
		
	
		
		btnNovatarefa = new JButton("Nova Tarefa");
		btnNovatarefa.setBounds(40, 380, 180, 40);
		
		btnSair = new JButton("Sair");
		btnSair.setBounds(260, 380, 180, 40);
	
		
		btnNovatarefa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
			
				
				
			}
		});
		
		btnSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int resposta = JOptionPane.showConfirmDialog(tela, "Confirma a saída do sistema?");
				if (resposta == 0) {
					tela.dispose();
				}
			}
		});
		
		
		painel.add(tabelaTarefas);
		painel.add(scrollTarefas);
		painel.add(btnNovatarefa);
		painel.add(btnSair);
		
		
		
		
		tela.setVisible(true);
	}
	
	
	
}

