package gui;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class tarefaTela {
	public static void main(String[] args) {

		JPanel panel = new JPanel();
		JFrame frame = new JFrame(); // Criando a tela

		frame.setTitle("Registro de tarefas"); // Colocando titulo
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Encerrando o app quando fechar a tela
		frame.setResizable(false); // Torna o tamanho da tela estático
		frame.setSize(720,420);// Seta as direções X e Y na tela
		frame.add(panel);

		panel.setLayout(null);
		
		JLabel descricaoLabel = new JLabel("Desc. Tarefa");
		descricaoLabel.setBounds(325,5,170,50);
		panel.add(descricaoLabel);
		
		JTextArea tarefaText = new JTextArea();
		tarefaText.setBounds(255,40,210,80);
		panel.add(tarefaText);
		
		JLabel prioridadeLabel = new JLabel("Prioridade");
		prioridadeLabel.setBounds(325,130,130,25);
		panel.add(prioridadeLabel);
		
		String prioridade[] = {"0","1","2"};
		JComboBox<String> prioridadeBox = new JComboBox(prioridade);
		prioridadeBox.setBounds(300,155,130,25);
		panel.add(prioridadeBox);
		
		JCheckBox finalizadoCheckBox = new JCheckBox("Finalizado");
		finalizadoCheckBox.setBounds(315,180,90,90);
		panel.add(finalizadoCheckBox);

		JButton cancelarButton = new JButton("Cancelar");
		cancelarButton.setBounds(255,280,100,30);
		panel.add(cancelarButton);
		
		JButton salvarButton = new JButton("Salvar");
		salvarButton.setBounds(365,280,100,30);
		panel.add(salvarButton);
	
		frame.setVisible(true);// deixa a tela visivel

	}
}
