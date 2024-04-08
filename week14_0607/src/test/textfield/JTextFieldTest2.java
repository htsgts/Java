package test.textfield;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JTextFieldTest2 extends JFrame {
	int rows = 4;
	int cols = 4;
	JPanel panC = new JPanel(new GridLayout(rows,cols));
	JButton[] btns = new JButton[rows * cols];
	String[] btnStrs = {"0",".","C","+","-","×","÷"};
	JTextField tf = new JTextField();
	JButton btnE = new JButton("=");
			
	public JTextFieldTest2() {
		for(int i=0;i<btns.length;i++) {
			if(i<9) 
				btns[i] = new JButton(i+1+"");
			else  
				btns[i] = new JButton(btnStrs[i-9]);
			
			panC.add(btns[i]);
		}
		add(panC,"Center");
		add(tf,"North");
		add(btnE,"South");
		
		setTitle("계산기 화면");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(200, 250, 300, 300);
		setVisible(true);
		setResizable(false);
	}
	
	public static void main(String[] args) {
		new JTextFieldTest2();

	}

}
