package test.jframe;

import javax.swing.JFrame;

public class JframeTest1 extends JFrame {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("Jframe 연습1");
		f.setSize(500,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
