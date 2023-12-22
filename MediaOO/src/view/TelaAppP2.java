package view;

import javax.swing.*;

import java.awt.event.*;
import java.util.Locale;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class TelaAppP2 implements ActionListener{
	JLabel msgTrab1, msgTrab2, msgTrab3, msgP1, msgP2, msgMedia, msgNotaNecessariaMM, msgNotaNecessariaMS, msgNotaNecessariaSS, msgErroMM, msgErroMS, msgErroSS;
	JTextField trab1, trab2, trab3, p1, p2, media, notaNecessariaMM, notaNecessariaMS, notaNecessariaSS;
	JButton enviar;
	
	public TelaAppP2() {
	// Criando um JFrame (Uma janela com o nome de by: @leo.sjr)
	JFrame jp = new JFrame("by: @leo.sjr");
	
	// Dando uma dimensão à janela criada
	jp.setSize(500, 500);
	jp.setLayout(null);
	jp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	
	// Criando JTextField pro usuário digitar as notas
	trab1 = new JTextField();
	trab2 = new JTextField();
	trab3 = new JTextField();
	p1 = new JTextField();
	p2 = new JTextField();
	media = new JTextField();
	notaNecessariaMM = new JTextField();
	notaNecessariaMS = new JTextField();
	notaNecessariaSS = new JTextField();
		
	p2.setEditable(false);
	notaNecessariaMM.setEditable(false);
	notaNecessariaMS.setEditable(false);
	notaNecessariaSS.setEditable(false);
	p2.setBorder(new EmptyBorder(0,0,0,0));
	notaNecessariaMM.setBorder(new EmptyBorder(0,0,0,0));
	notaNecessariaMS.setBorder(new EmptyBorder(0,0,0,0));
	notaNecessariaSS.setBorder(new EmptyBorder(0,0,0,0));
	
	
	
	// Criando JLabel que servirão de mensagem pra colocar do lado das caixinhas de texto
	msgTrab1 = new JLabel("Digite aqui a nota do trabalho 1: ");
	msgTrab2 = new JLabel("Digite aqui a nota do trabalho 2: ");
	msgTrab3 = new JLabel("Digite aqui a nota do trabalho 3: ");
	msgP1 = new JLabel("Digite aqui a nota da prova 1: ");
	msgP2 = new JLabel("A sua nota da prova 2 terá que ser: ");
	msgMedia = new JLabel("Digite a média desejada: ");
	msgNotaNecessariaMM = new JLabel("A nota necessária para passar com MM é: ");
	msgNotaNecessariaMS = new JLabel("A nota necessária para passar com MS é: ");
	msgNotaNecessariaSS = new JLabel("A nota necessária para passar com SS é: ");
	msgErroMM = new JLabel("");
	msgErroMS = new JLabel("");
	msgErroSS = new JLabel("");
	msgErroMM.setForeground(Color.red);
	msgErroMS.setForeground(Color.red);
	msgErroSS.setForeground(Color.red);
	
	
	// Definindo as posições e dimensões de tudo
	msgTrab1.setBounds(10, 10, 200, 25);
	trab1.setBounds(220, 10, 200, 25);
	msgTrab2.setBounds(10, 10+30, 200, 25);
	trab2.setBounds(220, 10+30, 200, 25);
	msgTrab3.setBounds(10, 10+30+30, 200, 25);
	trab3.setBounds(220, 10+30+30, 200, 25);
	msgP1.setBounds(10, 10+30+30+30, 200, 25);
	p1.setBounds(220, 10+30+30+30, 200, 25);
	msgP2.setBounds(10, 140+30+60, 200, 25);
	p2.setBounds(260, 140+30+60, 200, 25);
	msgMedia.setBounds(10, 10+30+30+30+30, 200, 25);
	media.setBounds(220, 10+30+30+30+30, 200, 25);
	notaNecessariaMM.setBounds(260, 140+30+60+30, 60, 25);
	msgNotaNecessariaMM.setBounds(10, 140+30+60+30, 500, 25);
	notaNecessariaMS.setBounds(260, 140+30+60+30+30, 60, 25);
	msgNotaNecessariaMS.setBounds(10, 140+30+60+30+30, 500, 25);
	notaNecessariaSS.setBounds(260, 140+30+60+30+30+30, 60, 25);
	msgNotaNecessariaSS.setBounds(10, 140+30+60+30+30+30, 500, 25);
	msgErroMM.setBounds(10, 140+30+60+30+30+30+30, 500, 25);
	msgErroMS.setBounds(10, 140+30+60+30+30+30+30+30, 500, 25);
	msgErroSS.setBounds(10, 140+30+60+30+30+30+30+30+30, 500, 25);
	

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
	jp.add(notaNecessariaMM);
	jp.add(msgNotaNecessariaMM);
	jp.add(notaNecessariaMS);
	jp.add(msgNotaNecessariaMS);
	jp.add(notaNecessariaSS);
	jp.add(msgNotaNecessariaSS);
	jp.add(msgErroMM);
	jp.add(msgErroMS);
	jp.add(msgErroSS);
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
	        String valorMedia = media.getText();

	        if (valorTrab1.isEmpty() || valorTrab2.isEmpty() || valorTrab3.isEmpty() || valorP1.isEmpty() || valorMedia.isEmpty()) {
	            JOptionPane.showMessageDialog(null, "Todos os dados são obrigatórios para a realização dos cálculos!", null, JOptionPane.ERROR_MESSAGE);
	        } else {
	            try {
	                double trab1Double = Double.parseDouble(valorTrab1);
	                double trab2Double = Double.parseDouble(valorTrab2);
	                double trab3Double = Double.parseDouble(valorTrab3);
	                double p1Double = Double.parseDouble(valorP1);
	                double mediaDouble = Double.parseDouble(valorMedia);

	                double resultado = (-(trab1Double * 0.1) - (trab2Double * 0.1) - (trab3Double * 0.1) - (p1Double * 0.3) + (mediaDouble))*1/0.4;
	                String resultadoStr = String.format(Locale.US, "%.4f", resultado);;
	                p2.setText(resultadoStr);
	                double resultadoMM = (-(trab1Double * 0.1) - (trab2Double * 0.1) - (trab3Double * 0.1) - (p1Double * 0.3) + (5))*1/0.4;
	                String resultadoMMStr = String.format(Locale.US, "%.4f", resultadoMM);
	                double resultadoMS = (-(trab1Double * 0.1) - (trab2Double * 0.1) - (trab3Double * 0.1) - (p1Double * 0.3) + (7))*1/0.4;
	                String resultadoMSStr = String.format(Locale.US, "%.4f", resultadoMS);
	                double resultadoSS = (-(trab1Double * 0.1) - (trab2Double * 0.1) - (trab3Double * 0.1) - (p1Double * 0.3) + (9))*1/0.4;
	                String resultadoSSStr = String.format(Locale.US, "%.4f", resultadoSS);
	                notaNecessariaMM.setText(resultadoMMStr);
	                notaNecessariaMS.setText(resultadoMSStr);
	                notaNecessariaSS.setText(resultadoSSStr);
	                if (resultadoMM > 10) {
	                	msgErroMM.setText("Você não possui nota para o MM");
	                } else {
	                	msgErroMM.setText("");
	                }
	                if (resultadoMS > 10) {
	                	msgErroMS.setText("Você não possui nota para o MS");
	                } else {
	                	msgErroMS.setText("");
	                }
	                if (resultadoSS > 10) { 
	                	msgErroSS.setText("Você não possui nota para o SS");
	                } else {
	                	msgErroSS.setText("");
	                }
	                
	                	
	                
	            } catch (NumberFormatException e) {
	                JOptionPane.showMessageDialog(null, "Certifique-se de digitar números válidos!", null, JOptionPane.ERROR_MESSAGE);
	            }
	        }
	    }
	}

	
	public static void main(String[] args) {
		new TelaAppP2();
	}
}
