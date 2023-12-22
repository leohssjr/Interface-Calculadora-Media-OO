package view;

import javax.swing.*;
import java.awt.event.*;

// Média faltante na P2

public class TelaApp implements ActionListener{
	JLabel msgTrab1, msgTrab2, msgTrab3, msgP1, msgP2, msgMedia;
	JTextField trab1, trab2, trab3, p1, p2, media;
	JButton enviar;
	
	public TelaApp() {
	// Criando um JFrame (Uma janela com o nome de Calculadora média OO)
	JFrame jp = new JFrame("Calculadora média OO");
	
	// Dando uma dimensão à janela criada
	jp.setSize(500, 300);
	jp.setLayout(null);
	jp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	
	// Criando JTextField pro usuário digitar as notas
	trab1 = new JTextField();
	trab2 = new JTextField();
	trab3 = new JTextField();
	p1 = new JTextField();
	p2 = new JTextField();
	media = new JTextField();
	
	// Criando JLabel que servirão de mensagem pra colocar do lado das caixinhas de texto
	msgTrab1 = new JLabel("Digite aqui a nota do trabalho 1: ");
	msgTrab2 = new JLabel("Digite aqui a nota do trabalho 2: ");
	msgTrab3 = new JLabel("Digite aqui a nota do trabalho 3: ");
	msgP1 = new JLabel("Digite aqui a nota da prova 1: ");
	msgP2 = new JLabel("Digite aqui a nota da prova 2: ");
	msgMedia = new JLabel("Sua média é: ");
	
	// Definindo as posições e dimensões de tudo
	msgTrab1.setBounds(10, 10, 200, 25);
	trab1.setBounds(220, 10, 200, 25);
	msgTrab2.setBounds(10, 10+30, 200, 25);
	trab2.setBounds(220, 10+30, 200, 25);
	msgTrab3.setBounds(10, 10+30+30, 200, 25);
	trab3.setBounds(220, 10+30+30, 200, 25);
	msgP1.setBounds(10, 10+30+30+30, 200, 25);
	p1.setBounds(220, 10+30+30+30, 200, 25);
	msgP2.setBounds(10, 10+30+30+30+30, 200, 25);
	p2.setBounds(220, 10+30+30+30+30, 200, 25);
	msgMedia.setBounds(125, 10+30+30+30+30+30, 200, 25);
	media.setBounds(220, 10+30+30+30+30+30, 200, 25);
	

	// Adicionando o botao de enviar
	JButton btEnviar = new JButton("Enviar");
	btEnviar.setBounds(10, 140+30, 100, 50);
	btEnviar.addActionListener(this);
	
	// Adicionando os conteiners ao JFrame
	jp.add(trab1);
	jp.add(trab2);
	jp.add(trab3);
	jp.add(p1);
	jp.add(p2);
	jp.add(msgTrab1);
	jp.add(msgTrab2);
	jp.add(msgTrab3);
	jp.add(msgP1);
	jp.add(msgP2);
	jp.add(media);
	jp.add(msgMedia);
	jp.add(btEnviar);
	
	// SUPER IMPORTANTE TORNAR ISSO AQUI TRUE
	jp.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
	    if (ae.getActionCommand().equals("Enviar")) {
	        String valorTrab1 = trab1.getText();
	        String valorTrab2 = trab2.getText();
	        String valorTrab3 = trab3.getText();
	        String valorP1 = p1.getText();
	        String valorP2 = p2.getText();

	        if (valorTrab1.isEmpty() || valorTrab2.isEmpty() || valorTrab3.isEmpty() || valorP1.isEmpty() || valorP2.isEmpty()) {
	            JOptionPane.showMessageDialog(null, "Todos os dados são obrigatórios para a realização dos cálculos!", null, JOptionPane.ERROR_MESSAGE);
	        } else {
	            try {
	                double trab1Double = Double.parseDouble(valorTrab1);
	                double trab2Double = Double.parseDouble(valorTrab2);
	                double trab3Double = Double.parseDouble(valorTrab3);
	                double p1Double = Double.parseDouble(valorP1);
	                double p2Double = Double.parseDouble(valorP2);

	                double resultadoMedia = (trab1Double * 0.1) + (trab2Double * 0.1) + (trab3Double * 0.1) + (p1Double * 0.3) + (p2Double * 0.4);
	                String resultadoMediaStr = String.valueOf(resultadoMedia);
	                media.setText(resultadoMediaStr);

	            } catch (NumberFormatException e) {
	                JOptionPane.showMessageDialog(null, "Certifique-se de digitar números válidos!", null, JOptionPane.ERROR_MESSAGE);
	            }
	        }
	    }
	}

	
	public static void main(String[] args) {
		new TelaApp();
	}
}
