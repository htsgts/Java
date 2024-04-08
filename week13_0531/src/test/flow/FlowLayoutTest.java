package test.flow;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutTest extends JFrame {
	
	public FlowLayoutTest() {
		setLayout(new FlowLayout(FlowLayout.CENTER, 15, 25));
		Color[] colors = {Color.RED,Color.ORANGE,Color.YELLOW,Color.GREEN,Color.BLUE,new Color(0,33,135), new Color(110,47,199)};
		String[] btnStrs = {"사과", "딸기","포도","수박","키위","오렌지","참외"};
		JButton[] btnArr = new JButton[btnStrs.length];
		
		for (int i = 0; i < btnArr.length;i++) {
			btnArr[i] = new JButton(btnStrs[i]);
			btnArr[i].setBackground(colors[i]);
			btnArr[i].setForeground(Color.WHITE);
			add(btnArr[i]);
		}
		
		setTitle("FlowLayout 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 200, 300, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FlowLayoutTest();
	}

}
