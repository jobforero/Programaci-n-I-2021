package enunciados4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class XSwingEventos1 extends JFrame implements ActionListener {

	private float numero1;
	private float numero2;
	private float rusultado;

	JButton bt1 = new JButton("+");
	JButton bt2 = new JButton("-");
	JButton bt3 = new JButton("*");
	JButton bt4 = new JButton("/");
	JButton bt5 = new JButton("Limpiar");

	JTextField tf1 = new JTextField();
	JTextField tf2 = new JTextField();
	JTextField tf3 = new JTextField();

	JLabel lb1 = new JLabel("Numero  1");
	JLabel lb2 = new JLabel("Numero  2");
	JLabel lb3 = new JLabel("Resulado   =");

	XSwingEventos1() {
		setTitle("Calculadora");
		setBounds(150, 150, 550, 230);
		getContentPane().setLayout(null);
		numero1 = 0;
		numero2 = 0;
		rusultado = 0;
	}

	void arma_pantalla() {
		bt1.setBounds(new Rectangle(60, 70, 50, 45));
		bt2.setBounds(new Rectangle(130, 70, 50, 45));
		bt3.setBounds(new Rectangle(200, 70, 50, 45));
		bt4.setBounds(new Rectangle(270, 70, 50, 45));
		bt5.setBounds(new Rectangle(340, 70, 100, 45));

		lb1.setBounds(new Rectangle(30, 30, 150, 20));
		lb2.setBounds(new Rectangle(270, 30, 150, 20));
		lb3.setBounds(new Rectangle(55, 135, 150, 20));

		tf1.setBounds(new Rectangle(120, 30, 100, 20));
		tf2.setBounds(new Rectangle(350, 30, 100, 20));
		tf3.setBounds(new Rectangle(150, 130, 200, 30));

		getContentPane().add(bt1, null); // 1
		getContentPane().add(bt2, null); // 2
		getContentPane().add(bt3, null); // 3
		getContentPane().add(bt4, null); // 4
		getContentPane().add(bt5, null); // 5
		getContentPane().add(lb1, null); // 6
		getContentPane().add(lb2, null); // 7
		getContentPane().add(tf1, null); // 8
		getContentPane().add(tf2, null); // 9
		getContentPane().add(tf3, null); // 10
		getContentPane().add(lb3, null); // 11

		bt1.addActionListener(this); // 1
		bt2.addActionListener(this); // 2
		bt3.addActionListener(this); // 3
		bt4.addActionListener(this); // 4
		bt5.addActionListener(this); // 5
		// lb1.addActionListener(this); //6
		// lb2.addActionListener(this); //7
		tf1.addActionListener(this); // 8
		tf2.addActionListener(this); // 9
		tf3.addActionListener(this); // 10

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

// este es el metodo para manejo de eventos
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("+")) {
			numero1 = Float.parseFloat(tf1.getText());
			numero2 = Float.parseFloat(tf2.getText());
			rusultado = numero1 + numero2;
		} else if (e.getActionCommand().equals("-")) {
			numero1 = Float.parseFloat(tf1.getText());
			numero2 = Float.parseFloat(tf2.getText());
			rusultado = numero1 - numero2;

		} else if (e.getActionCommand().equals("*")) {
			numero1 = Float.parseFloat(tf1.getText());
			numero2 = Float.parseFloat(tf2.getText());
			rusultado = numero1 * numero2;
		} else if (e.getActionCommand().equals("/")) {
			numero1 = Float.parseFloat(tf1.getText());
			numero2 = Float.parseFloat(tf2.getText());
			rusultado = numero1 / numero2;
		} else {
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
		}
		String result = String.valueOf(rusultado);
		tf3.setText(result);
	}
}

public class CalculadoraUno {
	public static void main(String args[]) {
		XSwingEventos1 ap = new XSwingEventos1();
		ap.arma_pantalla();
		// ap.actionPerformed();
	}
}
