package test.border;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutTest2 extends JFrame {
	
	public BorderLayoutTest2() {
		
		setLayout(new BorderLayout(25, 15));
		Color[] colors = {Color.RED,Color.ORANGE,Color.BLUE,new Color(0,33,135), new Color(110,47,199)};
		String[] btnStrs = {"사과", "딸기","포도", "키위","참외"};
		String[] locStrs = {"North", "South","Center", "West","East"};
		JButton[] btnArr = new JButton[btnStrs.length];
		
		JPanel[] pans = new JPanel[3];
		for (int i = 0; i < pans.length;i++) {
			pans[i] = new JPanel();
			if(i % 2 == 0)
				pans[i].setBackground(Color.PINK);
			add(pans[i], locStrs[i]);
		}
		
		for (int i = 0; i < btnArr.length;i++) {
			btnArr[i] = new JButton(btnStrs[i]);
			btnArr[i].setBackground(colors[i]);
			btnArr[i].setForeground(Color.WHITE);
		}
		
		pans[0].add(btnArr[0]); pans[0].add(btnArr[1]);
		pans[1].add(btnArr[2]); 
		pans[2].add(btnArr[3]); pans[2].add(btnArr[4]);
		
		setTitle("BorderLayout 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 200, 300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new BorderLayoutTest2();

	}

}
