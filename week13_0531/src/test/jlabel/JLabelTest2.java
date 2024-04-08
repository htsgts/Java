package test.jlabel;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelTest2 extends JFrame {
	
	public JLabelTest2() {
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		JLabel lbl1 = new JLabel("유한대학교");
		JLabel lbl2 = new JLabel("컴퓨터소프트웨어공학");
		lbl1.setBackground(Color.GREEN);
		lbl1.setOpaque(true);
		add(lbl1);
		add(lbl2);
		
		setTitle("JLabel 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JLabelTest();
	}

}

