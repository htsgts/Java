package test.jlabel;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelTest extends JFrame {
	
	public JLabelTest() {
		JLabel lbl1 = new JLabel("유한대학교",JLabel.CENTER);
		JLabel lbl2 = new JLabel("컴퓨터소프트웨어공학",JLabel.CENTER);
		lbl1.setBackground(Color.GREEN);
		lbl1.setOpaque(true);
		lbl2.setBackground(Color.MAGENTA);
		lbl2.setOpaque(true);
		add(lbl1,"North");
		add(lbl2,"Center");
		
		setTitle("JLabel 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JLabelTest();
	}

}
