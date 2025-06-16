package br.dev.giovana.tarefas.ui;

import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameCadastro {

	private JLabel labelTitulo;
	private JLabel labelDescricao;
	private JLabel labelDataInicial;
	private JLabel labelPrazo;
	private JLabel labelDataConclusao;
	private JLabel labelStatus;
	private JLabel labelResponsavel;
	private JTextField txtTitulo;
	private JTextField txtDescricao;
	private JTextField txtDataInicial;
	private JTextField txtPrazo;
	private JTextField txtDataConclusao;
	private JButton btnSalvar;
	private JButton btnSair;
	private JComboBox<String> boxStatus;
	private JComboBox<String> boxResponsavel;
	
	public FrameCadastro(JFrame FrameTarefasList) {
			criarTela(FrameTarefasList);	
	}
	
	private void criarTela (JFrame FrameTarefasList) {
		JDialog tela = new JDialog(FrameTarefasList,true);
		tela.setSize(300, 460);
		tela.setResizable(false);
		tela.setTitle("Cadastro de tarefas");
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		labelTitulo = new JLabel("Título:");
		labelTitulo.setFont(new Font("Arial", Font.BOLD,10));
		labelTitulo.setBounds(10, 10, 200, 30);
		txtTitulo = new JTextField();
		txtTitulo.setBounds(10, 35, 150, 25);
		
		labelDescricao = new JLabel("Descrição:");
		labelDescricao.setFont(new Font ("Arial", Font.BOLD,10));
		labelDescricao.setBounds(10, 60, 150, 30);
		txtDescricao = new JTextField();
		txtDescricao.setFont(new Font("Arial", Font.BOLD,10));
		txtDescricao.setBounds(10, 85, 250, 25);
		
		labelDataInicial = new JLabel("Data inicial");
		labelDataInicial.setFont(new Font("Arial", Font.BOLD,10));
		labelDataInicial.setBounds(10, 110, 150, 30);
		txtDataInicial = new JTextField();
		txtDataInicial.setBounds(10, 135, 150, 25);
		
		labelPrazo = new JLabel("Prazo:");
		labelPrazo.setFont(new Font("Arial", Font.BOLD,10));
		labelPrazo.setBounds(10, 160, 150, 30);
		txtPrazo = new JTextField();
		txtPrazo.setBounds(10, 185, 150, 25);
		
		labelDataConclusao = new JLabel("Data Conclusão:");
		labelDataConclusao.setFont(new Font("Arial", Font.BOLD,10));
		labelDataConclusao.setBounds(10, 210, 150, 30);
		txtDataConclusao = new JTextField();
		txtDataConclusao.setBounds(10, 235, 150, 25);
		
		labelStatus = new JLabel("Status:");
		labelStatus.setFont(new Font("Arial", Font.BOLD,10));
		labelStatus.setBounds(10, 255, 150, 30);
		boxStatus = new JComboBox<String>();
		String [] statusOptions = {"Não iniciado","Em andamento","Concluído"};
		boxStatus.setBounds(10, 280, 150, 25);
		
		labelResponsavel = new JLabel("Responsável:");
		labelResponsavel.setFont(new Font("Arial", Font.BOLD,10));
		labelResponsavel.setBounds(10, 300, 150, 30);
		boxResponsavel = new JComboBox<String>();
		boxResponsavel.setBounds(10, 325, 150, 25);		
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(15,365, 90, 40);
		
		btnSair = new JButton("Sair");
		btnSair.setBounds(115, 365, 90, 40);
		
		
		
		
		
		
		
		Container painel = tela.getContentPane();
		
		
		painel.add(labelTitulo);
    	painel.add(txtTitulo);
		painel.add(labelDescricao);
		painel.add(txtDescricao);
		painel.add(labelDataInicial);
        painel.add(txtDataInicial);
		painel.add(labelPrazo);
		painel.add(txtPrazo);
		painel.add(labelDataConclusao);
		painel.add(txtDataConclusao);
		painel.add(labelStatus);
		painel.add(boxStatus);
		painel.add(labelResponsavel);
		painel.add(boxResponsavel);
		painel.add(btnSalvar);
		painel.add(btnSair);
		
		
		
		
		
		
		
		
		
		
		tela.setVisible(true);
	}
}
